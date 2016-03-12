package com.scuthnweb.domain;

import java.util.Set;
/**
 * 
 * @author YJ.Huang
 *
 */
public class Share_link {
    private Integer id;
    private String link_name;
    private String link;
    private java.sql.Timestamp add_time;
    
    private Account poster_account;
    private Set<Share_link_comment> share_link_comments;
    
	public Set<Share_link_comment> getShare_link_comments() {
		return share_link_comments;
	}

	public void setShare_link_comments(Set<Share_link_comment> share_link_comments) {
		this.share_link_comments = share_link_comments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLink_name() {
		return link_name;
	}

	public void setLink_name(String link_name) {
		this.link_name = link_name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Account getPoster_account() {
		return poster_account;
	}

	public void setPoster_account(Account poster_account) {
		this.poster_account = poster_account;
	}

	public java.sql.Timestamp getAdd_time() {
		return add_time;
	}

	public void setAdd_time(java.sql.Timestamp add_time) {
		this.add_time = add_time;
	}
}
