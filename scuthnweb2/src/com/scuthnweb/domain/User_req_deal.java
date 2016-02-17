package com.scuthnweb.domain;

public class User_req_deal {
	private Integer id;
	
	private User_req user_req;
	private Account admin;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User_req getUser_req() {
		return user_req;
	}
	public void setUser_req(User_req user_req) {
		this.user_req = user_req;
	}
	public Account getAdmin() {
		return admin;
	}
	public void setAdmin(Account admin) {
		this.admin = admin;
	}
}
