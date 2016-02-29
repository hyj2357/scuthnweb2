package com.scuthnweb.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

public interface SessionContainerDao {
	
	public Map<Integer, List<HttpSession>> getSessionMap();
	
	public void setSessionMap(Map<Integer,List<HttpSession>> sessionMap);
		
	public void delete(HttpSession session);
	
	public void create(HttpSession session);
	
	public List<HttpSession> get(Integer uid);
}
