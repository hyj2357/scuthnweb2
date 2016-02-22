package com.scuthnweb.action.useradmodule;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.domain.Account;
import com.scuthnweb.service.UserAdModule;

public class LoginAction extends ActionSupport{
	private String user_account;
	private String user_password;
	private UserAdModule userAdModule;
	
	private String errMsg;
	
	public String execute(){
		 Account account = this.userAdModule.login(user_account, user_password);
		 ActionContext ctx = ActionContext.getContext();
		 if(account==null){
			 this.errMsg = "用户名或密码错误.<br/>";
			 ctx.getSession().put("errMsg", errMsg);
			 return ERROR;
		 }else{
			 ctx.getSession().put("user_account", account.getAccount());
			 ctx.getSession().put("user_id", account.getId());
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
}
