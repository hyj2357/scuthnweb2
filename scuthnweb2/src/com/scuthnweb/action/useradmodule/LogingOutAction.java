package com.scuthnweb.action.useradmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogingOutAction extends ActionSupport{
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().remove("user_account");
		ctx.getSession().remove("user_id");
		return SUCCESS;
	}

}
