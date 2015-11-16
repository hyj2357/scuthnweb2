package com.scuthnweb.domain;

import java.sql.Timestamp;
import java.util.Set;

public class Account {
    private String account;
    private Timestamp register_time;
    private Set<User> users;
    private Set<Role> roles;
    private Set<New> news;
    private Set<Share_link> share_links;
    private Set<Action> actions;
    private Set<Action_summary> join_action;
    private Set<Album> albums;
    private Set<Message> receive_messages,send_message;
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
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
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
	public Set<Action_summary> getJoin_action() {
		return join_action;
	}
	public void setJoin_action(Set<Action_summary> join_action) {
		this.join_action = join_action;
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
	public Set<Message> getSend_message() {
		return send_message;
	}
	public void setSend_message(Set<Message> send_message) {
		this.send_message = send_message;
	}
	public Set<Note> getNotes() {
		return notes;
	}
	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}

}
