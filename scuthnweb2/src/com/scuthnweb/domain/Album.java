package com.scuthnweb.domain;

import java.util.Set;

public class Album {
	private Integer id;
	private String album_name,introduction;
	private java.sql.Timestamp add_time;
	
	private Account account;
    private Set<Album_pic> album_pics;
    
    
	public Set<Album_pic> getAlbum_pics() {
		return album_pics;
	}

	public void setAlbum_pics(Set<Album_pic> album_pics) {
		this.album_pics = album_pics;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
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
}
