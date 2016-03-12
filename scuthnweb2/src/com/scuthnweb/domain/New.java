package com.scuthnweb.domain;

import java.util.Set;
/**
 * 
 * @author YJ.Huang
 *
 */
public class New {
	private Integer id;
	private String title;
	private String content;
	private Integer obj_status;
	private java.sql.Timestamp add_time;
	

	private Account poster_account;
	private Set<New_pic> new_pics;
	
	
	
	public java.sql.Timestamp getAdd_time() {
		return add_time;
	}
	public void setAdd_time(java.sql.Timestamp add_time) {
		this.add_time = add_time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getObj_status() {
		return obj_status;
	}
	public void setObj_status(Integer obj_status) {
		this.obj_status = obj_status;
	}
	public Account getPoster_account() {
		return poster_account;
	}
	public void setPoster_account(Account poster_account) {
		this.poster_account = poster_account;
	}
	public Set<New_pic> getNew_pics() {
		return new_pics;
	}
	public void setNew_pics(Set<New_pic> new_pics) {
		this.new_pics = new_pics;
	}
}
