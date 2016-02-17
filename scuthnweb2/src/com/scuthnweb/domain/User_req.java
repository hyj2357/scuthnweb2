package com.scuthnweb.domain;

public class User_req {
	private Integer id;
	private String name;
	private String grade_major;
	private String other_info;
	private java.sql.Timestamp valid_time;
	
	private Account account;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade_major() {
		return grade_major;
	}

	public void setGrade_major(String grade_major) {
		this.grade_major = grade_major;
	}

	public String getOther_info() {
		return other_info;
	}

	public void setOther_info(String other_info) {
		this.other_info = other_info;
	}

	public java.sql.Timestamp getValid_time() {
		return valid_time;
	}

	public void setValid_time(java.sql.Timestamp valid_time) {
		this.valid_time = valid_time;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
