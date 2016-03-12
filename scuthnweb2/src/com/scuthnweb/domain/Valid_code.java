package com.scuthnweb.domain;
/**
 * 
 * @author YJ.Huang
 *
 */
public class Valid_code {
	private Integer id;
	private String code;
	private java.sql.Timestamp valid_time;
	
	private Account account;

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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
