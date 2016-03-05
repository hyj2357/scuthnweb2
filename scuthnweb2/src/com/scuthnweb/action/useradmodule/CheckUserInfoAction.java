package com.scuthnweb.action.useradmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.QueryValidateModule;

/**
 * 
 * @author YJ.Huang
 *
 */
public class CheckUserInfoAction extends ActionSupport{
	private UserAdModule userAdModule;
	private QueryValidateModule queryValidateModule;
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		if(ctx.getSession().get("user_account")==null||ctx.getSession().get("user_id")==null)
			return ERROR;
		else{
			Integer id = (Integer)ctx.getSession().get("user_id");
			ctx.getSession().put("user_info", this.userAdModule.checkUserInfo(id));
			ctx.getSession().put("authority", this.queryValidateModule.hasAuthority(id));
			return SUCCESS;
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
