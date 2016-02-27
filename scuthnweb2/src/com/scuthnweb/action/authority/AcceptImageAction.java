package com.scuthnweb.action.authority;

import com.opensymphony.xwork2.ActionSupport;

public class AcceptImageAction extends ActionSupport{
	private String type;
	private Integer uid;
	private String path;
	
	private boolean succ=false;
	
	public String execute(){
		System.out.println(type+" "+uid+" "+path+"\n");
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

	public boolean isSucc() {
		return succ;
	}

	public void setSucc(boolean succ) {
		this.succ = succ;
	}	
}
