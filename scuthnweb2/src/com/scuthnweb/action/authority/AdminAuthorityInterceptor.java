package com.scuthnweb.action.authority;

import java.net.URLDecoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.scuthnweb.listener.LoginSessionContainer;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.CookieUtil;
import com.scuthnweb.tool.QueryValidateModule;

/**
 * 
 * @author YJ.Huang
 *
 */
public class AdminAuthorityInterceptor  extends AbstractInterceptor  implements ErrorCode{
	private UserAdModule userAdModule;
	private QueryValidateModule queryValidateModule;
	
	@Override
	public String intercept(ActionInvocation action) throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer uid = (Integer)ctx.getSession().get("user_id");		
		String account = (String)ctx.getSession().get("user_account");
		//如果当前会话中无登录标识
		if(uid==null||account==null){
			HttpServletRequest request = (HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);	
			//判断cookie中是否有登录信息
			Cookie ck = CookieUtil.getCookieByNameFromCookieArray(request.getCookies(), "scuthn.user");
			if(!(ck==null)){
				String login_info[] = URLDecoder.decode(ck.getValue(),"utf-8").split("&");
				if(login_info.length!=2){	//如果cookie登录用户信息被外部修改
					ck.setValue("");
					HttpServletResponse response = (HttpServletResponse) ctx.get(ServletActionContext.HTTP_RESPONSE);		 
			        response.addCookie(ck);
					return NO_LOGIN;
				}else{
					String role = this.queryValidateModule.userRole(uid);
					//用户是否为管理员角色
					if(role.equals("admin")||role.equals("super_admin")){
						HttpSession session = request.getSession();
						this.userAdModule.autoLogin(uid, session.getId());  //持久化登录会话记录
						//设置登录会话标识
						ctx.getSession().put("user_account", login_info[0]);
						ctx.getSession().put("user_id", new Integer(Integer.parseInt(login_info[1])));
						LoginSessionContainer.create(session); 	//将登录会话注入登录会话容器当中
					    return action.invoke();
					}
					else
						return NO_ROLE;
				}
			}else
				return NO_LOGIN;
		}else{
			String role = this.queryValidateModule.userRole(uid);
			if(role.equals("admin")||role.equals("super_admin")){			
				return action.invoke();
			}else{
				return NO_ROLE;
			}
		}

	}

	
	public UserAdModule getUserAdModule() {
		return userAdModule;
	}


	public void setUserAdModule(UserAdModule userAdModule) {
		this.userAdModule = userAdModule;
	}


	public QueryValidateModule getQueryValidateModule() {
		return queryValidateModule;
	}

	public void setQueryValidateModule(QueryValidateModule queryValidateModule) {
		this.queryValidateModule = queryValidateModule;
	}
}
