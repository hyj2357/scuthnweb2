package com.scuthnweb.action.useradmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.domain.Account;
import com.scuthnweb.service.UserAdModule;

/**
 * 
 * @author YJ.Huang
 *
 */
public class ActivateUserAction extends ActionSupport{
	private String code;
	private UserAdModule userAdModule;
	
	public String execute(){
		ActionContext ctx  = ActionContext.getContext();
		Account _account = this.userAdModule.activateUser(code);
		if(_account==null){
			return ERROR;
		}else{
			ctx.getSession().put("user_account", _account.getAccount());
			ctx.getSession().put("user_id", _account.getId());
			return SUCCESS;
		}
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public UserAdModule getUserAdModule() {
		return userAdModule;
	}

	public void setUserAdModule(UserAdModule userAdModule) {
		this.userAdModule = userAdModule;
	}
	
}
