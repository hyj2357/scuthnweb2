package com.scuthnweb.domain;

public class Login_session {
	private Integer id;
	private java.sql.Timestamp login_time;
	private Account account;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public java.sql.Timestamp getLogin_time() {
		return login_time;
	}
	public void setLogin_time(java.sql.Timestamp login_time) {
		this.login_time = login_time;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}
