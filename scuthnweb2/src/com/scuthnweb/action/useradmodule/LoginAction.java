package com.scuthnweb.action.useradmodule;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.domain.Account;
import com.scuthnweb.listener.LoginSessionContainer;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.QueryValidateModule;

public class LoginAction extends ActionSupport{
	private String user_account;
	private String user_password;
	
	private UserAdModule userAdModule;
	private QueryValidateModule queryValidateModule;
	private LoginSessionContainer loginSessionContainer;
	
	private String errMsg;
	
	public String execute(){
		
		 ActionContext ctx = ActionContext.getContext();
		 HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);		 		 
		 HttpSession session = request.getSession();
         
		 Account account = this.userAdModule.login(user_account, user_password, session.getId()); //验证登录并持久化登录会话记录
		 if(account==null){
			 this.errMsg = "用户名或密码错误.<br/>";
			 session.setAttribute("errMsg", errMsg);
			 return ERROR;
		 }else{ 
			 
			 //添加或者修改客户端cookie
			 Cookie ck = new Cookie("scuthn.user",account.getId()+"&"+account.getAccount());
			 ck.setMaxAge(60*60*14);  //一周有效期
			 HttpServletResponse response = (HttpServletResponse) ctx.get(ServletActionContext.HTTP_RESPONSE);		 
	         response.addCookie(ck);
	         
	         //设置当前会话登录标识
			 session.setAttribute("user_account", account.getAccount());
			 session.setAttribute("user_id", account.getId());
			 
			 //添加登录会话到登录会话容器
	         LoginSessionContainer.create(session);
			 return SUCCESS;
		 }			 
	}

	public String getUser_account() {
		return user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
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

	public LoginSessionContainer getLoginSessionContainer() {
		return loginSessionContainer;
	}

	public void setLoginSessionContainer(LoginSessionContainer loginSessionContainer) {
		this.loginSessionContainer = loginSessionContainer;
	}
}
