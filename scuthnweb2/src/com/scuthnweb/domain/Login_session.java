package com.scuthnweb.domain;

public class Login_session {
	private Integer id;
	private java.sql.Timestamp login_time;
	private String session_id;
	
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
	public String getSession_id() {
		return session_id;
	}
	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}
}
