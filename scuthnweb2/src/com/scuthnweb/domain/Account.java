package com.scuthnweb.domain;

import java.sql.Timestamp;
import java.util.Set;

public class Account {
    private String account;
    private Timestamp register_time;
    private Set<Sy_user> users;
    private Set<Role> roles;
    private Set<New> news;
    private Set<Share_link> share_links;
    private Set<Action> actions;
    private Set<Action_summary> join_actions;
    private Set<Album> albums;
    private Set<Message> receive_messages,send_messages;
    private Set<Note> notes;
    
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
	public Set<Sy_user> getUsers() {
		return users;
	}
	public void setUsers(Set<Sy_user> users) {
		this.users = users;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
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

}
