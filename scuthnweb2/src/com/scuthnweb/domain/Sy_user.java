package com.scuthnweb.domain;

public class Sy_user {
	private Integer id;
	private String user_name,
	               gender,
	               major,
	               grade,
	               phone_number,
	               qq_number,
	               wechat_number,
	               mail;
	
	private Account account;
	
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getQq_number() {
		return qq_number;
	}
	public void setQq_number(String qq_number) {
		this.qq_number = qq_number;
	}
	public String getWechat_number() {
		return wechat_number;
	}
	public void setWechat_number(String wechat_number) {
		this.wechat_number = wechat_number;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
