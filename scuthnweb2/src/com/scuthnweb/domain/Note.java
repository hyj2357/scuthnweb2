package com.scuthnweb.domain;
/**
 * 
 * @author YJ.Huang
 *
 */
public class Note {
    private Integer id;
    private String content;
    private java.sql.Timestamp add_time;
    
    private Account poster_account;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public java.sql.Timestamp getAdd_time() {
		return add_time;
	}

	public void setAdd_time(java.sql.Timestamp add_time) {
		this.add_time = add_time;
	}

	public Account getPoster_account() {
		return poster_account;
	}

	public void setPoster_account(Account poster_account) {
		this.poster_account = poster_account;
	}
}
