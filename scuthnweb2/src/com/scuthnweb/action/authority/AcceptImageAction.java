package com.scuthnweb.action.authority;

import com.opensymphony.xwork2.ActionSupport;

public class AcceptImageAction extends ActionSupport{
	private String type;
	private Integer uid;
	private String path;
	
	private String accept;
	
	public String execute(){
		System.out.println(type+" "+uid+" "+path+"\n");
		this.accept = "true";
		return SUCCESS;
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
}
