package com.scuthnweb.action.authority;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.QueryValidateModule;

/**
 * 
 * @author YJ.Huang
 *
 */
public class OnlineAction extends ActionSupport{
	private QueryValidateModule queryValidateModule;
	private Integer uid;
	private String sid;
	private String isLogin = "false";
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		System.out.println(uid+":"+sid);
		if(this.queryValidateModule.isSessionLogin(uid,sid)){
			this.isLogin = "true";
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}


	public QueryValidateModule getQueryValidateModule() {
		return queryValidateModule;
	}

	public void setQueryValidateModule(QueryValidateModule queryValidateModule) {
		this.queryValidateModule = queryValidateModule;
	}


	public Integer getUid() {
		return uid;
	}


	public void setUid(Integer uid) {
		this.uid = uid;
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getIsLogin() {
		return isLogin;
	}


	public void setIsLogin(String isLogin) {
		this.isLogin = isLogin;
	}
}
