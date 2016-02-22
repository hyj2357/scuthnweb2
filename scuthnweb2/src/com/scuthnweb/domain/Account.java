package com.scuthnweb.domain;

import java.sql.Timestamp;
import java.util.Set;

public class Account {
	private Integer id;
    private String account;
    private Timestamp register_time;
    private String password;
    
    private Set<New> news;
    private Set<Share_link> share_links;
    private Set<Action> actions;
    private Set<Action_summary> join_actions;
    private Set<Album> albums;
    private Set<Message> receive_messages,send_messages;
    private Set<Note> notes;
    private Set<User_req_deal> user_req_deals;
    private Set<Invite_code> invite_codes;
    private Set<Share_link_comment> share_link_comments;
    
	public Set<User_req_deal> getUser_req_deals() {
		return user_req_deals;
	}
	public void setUser_req_deals(Set<User_req_deal> user_req_deals) {
		this.user_req_deals = user_req_deals;
	}
	public Set<Invite_code> getInvite_codes() {
		return invite_codes;
	}
	public void setInvite_codes(Set<Invite_code> invite_codes) {
		this.invite_codes = invite_codes;
	}
	public Set<Share_link_comment> getShare_link_comments() {
		return share_link_comments;
	}
	public void setShare_link_comments(Set<Share_link_comment> share_link_comments) {
		this.share_link_comments = share_link_comments;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Timestamp getRegister_time() {
		return register_time;
	}
	public void setRegister_time(Timestamp register_time) {
		this.register_time = register_time;
	}
	public Set<New> getNews() {
		return news;
	}
	public void setNews(Set<New> news) {
		this.news = news;
	}
	public Set<Share_link> getShare_links() {
		return share_links;
	}
	public void setShare_links(Set<Share_link> share_links) {
		this.share_links = share_links;
	}
	public Set<Action> getActions() {
		return actions;
	}
	public void setActions(Set<Action> actions) {
		this.actions = actions;
	}
	public Set<Album> getAlbums() {
		return albums;
	}
	public void setAlbums(Set<Album> albums) {
		this.albums = albums;
	}
	public Set<Message> getReceive_messages() {
		return receive_messages;
	}
	public void setReceive_messages(Set<Message> receive_messages) {
		this.receive_messages = receive_messages;
	}
	public Set<Note> getNotes() {
		return notes;
	}
	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}
	public Set<Action_summary> getJoin_actions() {
		return join_actions;
	}
	public void setJoin_actions(Set<Action_summary> join_actions) {
		this.join_actions = join_actions;
	}
	public Set<Message> getSend_messages() {
		return send_messages;
	}
	public void setSend_messages(Set<Message> send_messages) {
		this.send_messages = send_messages;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
