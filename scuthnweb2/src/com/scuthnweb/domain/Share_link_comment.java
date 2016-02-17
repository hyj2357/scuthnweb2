package com.scuthnweb.domain;

public class Share_link_comment {
	private Integer id;
	private String content;
	private java.sql.Timestamp add_time;
	
	private Account account;
	private Share_link share_link;
	
	
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
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Share_link getShare_link() {
		return share_link;
	}
	public void setShare_link(Share_link share_link) {
		this.share_link = share_link;
	}
}
