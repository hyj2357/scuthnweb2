package com.scuthnweb.domain;
/**
 * 
 * @author YJ.Huang
 *
 */
public class Invite_code {
	private Integer id;
	private String code;
	private java.sql.Timestamp valid_time;
	
	private Account admin,user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public java.sql.Timestamp getValid_time() {
		return valid_time;
	}

	public void setValid_time(java.sql.Timestamp valid_time) {
		this.valid_time = valid_time;
	}

	public Account getAdmin() {
		return admin;
	}

	public void setAdmin(Account admin) {
		this.admin = admin;
	}

	public Account getUser() {
		return user;
	}

	public void setUser(Account user) {
		this.user = user;
	}
}
