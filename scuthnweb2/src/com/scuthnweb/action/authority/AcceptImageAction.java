package com.scuthnweb.action.authority;

import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.QueryValidateModule;

public class AcceptImageAction extends ActionSupport{
	private String type;
	private Integer uid;
	private String sid;
	private String path;
	
	private String accept;
	private UserAdModule userAdModule;
	private QueryValidateModule queryValidateModule;
	
	private final String USER_ICON = "user_icon",
			             ALBUM_PIC = "album_pic",
			             NEW_PIC = "new_pic",
			             ACTION_PIC = "action_pic";
	
	public String execute(){
		if(this.queryValidateModule.isSessionLogin(uid, sid)){
			System.out.println(type+" "+uid+" "+path+"\n");
			if(type.equals(USER_ICON)){
				
			}else if(type.equals(ALBUM_PIC)){
				
			}else if(type.equals(NEW_PIC)){
				
			}else if(type.equals(ACTION_PIC)){
				
			}else{
				this.accept = "false";
				return ERROR;
			}
			this.accept = "true";
			return SUCCESS;
		}else{
			this.accept  = "false";
			return ERROR;
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getAccept() {
		return accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
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

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}	
}
