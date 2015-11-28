package com.scuthnweb.domain;

public class Action_join_info {
	 private Integer id;
     private java.sql.Timestamp join_time,end_join_time,start_time,end_time;
     private Action action;
     
     
	public java.sql.Timestamp getJoin_time() {
		return join_time;
	}
	public void setJoin_time(java.sql.Timestamp join_time) {
		this.join_time = join_time;
	}
	public java.sql.Timestamp getEnd_join_time() {
		return end_join_time;
	}
	public void setEnd_join_time(java.sql.Timestamp end_join_time) {
		this.end_join_time = end_join_time;
	}
	public java.sql.Timestamp getStart_time() {
		return start_time;
	}
	public void setStart_time(java.sql.Timestamp start_time) {
		this.start_time = start_time;
	}
	public java.sql.Timestamp getEnd_time() {
		return end_time;
	}
	public void setEnd_time(java.sql.Timestamp end_time) {
		this.end_time = end_time;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
