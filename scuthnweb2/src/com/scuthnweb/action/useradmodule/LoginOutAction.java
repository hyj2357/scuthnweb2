package com.scuthnweb.action.useradmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.service.UserAdModule;

public class LoginOutAction extends ActionSupport{
	private UserAdModule userAdModule;
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		Integer uid = (Integer)ctx.getSession().remove("user_id");
		this.userAdModule.loginOut(uid);
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
}
