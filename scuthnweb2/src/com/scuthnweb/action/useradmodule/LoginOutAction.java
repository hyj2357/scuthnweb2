package com.scuthnweb.action.useradmodule;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.mysql.fabric.Response;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.listener.LoginSessionContainer;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.CookieUtil;

/**
 * 
 * @author YJ.Huang
 *
 */
public class LoginOutAction extends ActionSupport{
	private LoginSessionContainer loginSessionContainer;
	private UserAdModule userAdModule;	
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);		 		 
		HttpSession session = request.getSession();
		
		//移除相关cookie值
		String value = (Integer)session.getAttribute("user_id")+":"+(String)session.getAttribute("user_account");
		Cookie ck = CookieUtil.getCookieByNameFromCookieArray(request.getCookies(),"scuthn.user");
		if(ck!=null){
			ck.setValue("");
			HttpServletResponse response = (HttpServletResponse) ctx.get(ServletActionContext.HTTP_RESPONSE);		 
	        response.addCookie(ck);
		}
		//移除持久化的登录会话记录
		String sid = session.getId();
		this.userAdModule.loginOut(sid);
		
		//从登录会话容器中移除会话
		LoginSessionContainer.delete(session);
		
		//移除当前登录会话登录标识
		ctx.getSession().remove("user_account");
		ctx.getSession().remove("user_id");
		return SUCCESS;
	}

	public UserAdModule getUserAdModule() {
		return userAdModule;
	}

	public void setUserAdModule(UserAdModule userAdModule) {
		this.userAdModule = userAdModule;
	}

	public LoginSessionContainer getLoginSessionContainer() {
		return loginSessionContainer;
	}

	public void setLoginSessionContainer(LoginSessionContainer loginSessionContainer) {
		this.loginSessionContainer = loginSessionContainer;
	}
}
