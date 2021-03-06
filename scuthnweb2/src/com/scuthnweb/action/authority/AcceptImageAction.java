package com.scuthnweb.action.authority;

import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.QueryValidateModule;

/**
 * 
 * @author YJ.Huang
 *
 */
public class AcceptImageAction extends ActionSupport{
	private String type;
	private Integer uid;
	private String sid;
	private String path;
	
	private String accept;
	private String lastUrl;
	
	private UserAdModule userAdModule;
	private QueryValidateModule queryValidateModule;
	
	private final String USER_ICON = "user_icon",
			             ALBUM_PIC = "album_pic",
			             NEW_PIC = "new_pic",
			             ACTION_PIC = "action_pic";
	
	public String execute(){
		System.out.println("*************************** Accept Image **************************************");
		System.out.println(this.uid+":"+this.sid+" "+this.path);
		boolean is = this.queryValidateModule.isSessionLogin(uid, sid);
		System.out.println(is);
		if(is){
			System.out.println(type+" "+uid+" "+path+"\n");
			if(type.equals(USER_ICON)){
				this.lastUrl = this.userAdModule.uploadUserIcon(uid, path);
				System.out.println("last url:"+this.lastUrl);
			}
			else if(type.equals(ALBUM_PIC)){
				
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

	public String getLastUrl() {
		return lastUrl;
	}

	public void setLastUrl(String lastUrl) {
		this.lastUrl = lastUrl;
	}	
}
