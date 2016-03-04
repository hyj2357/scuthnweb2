package com.scuthnweb.action.authority;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.QueryValidateModule;

public class OnlineAction extends ActionSupport{
	private QueryValidateModule queryValidateModule;
	private Integer vid;
	private String sid;
	private String isLogin = "false";
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		Integer uid  = (Integer)ctx.getSession().get("user_id");
		if(this.queryValidateModule.isLogin(uid)){
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


	public Integer getVid() {
		return vid;
	}


	public void setVid(Integer vid) {
		this.vid = vid;
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
