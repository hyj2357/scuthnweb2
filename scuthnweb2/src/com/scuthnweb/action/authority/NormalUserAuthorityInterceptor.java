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

public class NormalUserAuthorityInterceptor extends AbstractInterceptor  implements ErrorCode{
	private QueryValidateModule queryValidateModule;
	private UserAdModule userAdModule;
	
	
	@Override
	public String intercept(ActionInvocation action) throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer uid = (Integer)ctx.getSession().get("user_id");		
		String account = (String)ctx.getSession().get("user_account");	
		
		System.out.println(action.getAction().getClass().getName());
		boolean isPfs = action.getAction().getClass().getName().equals("com.scuthnweb.action.authority.PageForwardServlet")?true:false,
				returnActionInvoke = true;
		
		//�����ǰ�Ự���޵�¼��ʶ
		if(uid==null||account==null){
			HttpServletRequest request = (HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);	
			//�ж�cookie���Ƿ��е�¼��Ϣ
			//Cookie ck = CookieUtil.getCookieFromCookieArray(request.getCookies(), "scuthn.user", uid+":"+account);
			Cookie ck = CookieUtil.getCookieByNameFromCookieArray(request.getCookies(), "scuthn.user");
			if(!(ck==null)){
				String login_info[] = URLDecoder.decode(ck.getValue(),"utf-8").split("&");
				if(login_info.length!=2){	//���cookie��¼�û���Ϣ���ⲿ�޸�
					ck.setValue("");
					HttpServletResponse response = (HttpServletResponse) ctx.get(ServletActionContext.HTTP_RESPONSE);		 
			        response.addCookie(ck);
					returnActionInvoke = false;
				}else{
					HttpSession session = request.getSession();
					this.userAdModule.autoLogin(uid, session.getId());  //�־û���¼�Ự��¼
					//���õ�¼�Ự��ʶ
					ctx.getSession().put("user_account", login_info[0]);
					ctx.getSession().put("user_id", new Integer(Integer.parseInt(login_info[1])));
					LoginSessionContainer.create(session); 	//����¼�Ựע���¼�Ự��������
					returnActionInvoke = true;
				    return action.invoke();
				}
			}else
				returnActionInvoke = false;
		}
		else
			returnActionInvoke = true;
		
		if(returnActionInvoke){
			return action.invoke();
		}else{
			if(isPfs)
				return action.invoke();
			else
				return NO_LOGIN;
		}
	}

	public QueryValidateModule getQueryValidateModule() {
		return queryValidateModule;
	}

	public void setQueryValidateModule(QueryValidateModule queryValidateModule) {
		this.queryValidateModule = queryValidateModule;
	}

	public UserAdModule getUserAdModule() {
		return userAdModule;
	}

	public void setUserAdModule(UserAdModule userAdModule) {
		this.userAdModule = userAdModule;
	}
	
}
