package com.scuthnweb.action.useradmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.service.UserAdModule;

public class CheckUserInfoForModifyAction extends ActionSupport{
	private UserAdModule userAdModule;
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		if(ctx.getSession().get("user_account")==null||ctx.getSession().get("user_id")==null)
			return ERROR;
		else{
			Integer id = (Integer)ctx.getSession().get("user_id");
			ctx.getSession().put("user_info", this.userAdModule.checkUserInfo(id));
			return SUCCESS;
		}
	}

	public UserAdModule getUserAdModule() {
		return userAdModule;
	}

	public void setUserAdModule(UserAdModule userAdModule) {
		this.userAdModule = userAdModule;
	}

}
