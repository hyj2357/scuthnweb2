package com.scuthnweb.action.reslinkmodule;

import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.service.ResLinkModule;

public class CreateResLinkAction extends ActionSupport{
	private Integer uid;
	private String link_name,  link_content,  category;
	
	private ResLinkModule resLinkModule;

	public String execute(){
		System.out.println("sdf");
		if(this.resLinkModule.createResLink(uid, link_name, link_content, category))
			return SUCCESS;
		else
			return ERROR;
	}
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getLink_name() {
		return link_name;
	}
	public void setLink_name(String link_name) {
		this.link_name = link_name;
	}
	public String getLink_content() {
		return link_content;
	}
	public void setLink_content(String link_content) {
		this.link_content = link_content;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public ResLinkModule getResLinkModule() {
		return resLinkModule;
	}

	public void setResLinkModule(ResLinkModule resLinkModule) {
		this.resLinkModule = resLinkModule;
	}

}
