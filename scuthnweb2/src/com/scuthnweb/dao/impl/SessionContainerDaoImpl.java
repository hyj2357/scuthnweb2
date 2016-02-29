package com.scuthnweb.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.scuthnweb.dao.SessionContainerDao;

public class SessionContainerDaoImpl implements SessionContainerDao{
	private Map<Integer,List<HttpSession>> sessionMap = new HashMap<Integer,List<HttpSession>>();

	
	@Override
	public Map<Integer, List<HttpSession>> getSessionMap() {
		return this.sessionMap;
	}

	@Override
	public void setSessionMap(Map<Integer, List<HttpSession>> sessionMap) {
		this.sessionMap = sessionMap;
	}

	@Override
	public void delete(HttpSession session) {
		Integer uid = (Integer) session.getAttribute("user_id");
		if(uid==null)
			return;
		else{
			List<HttpSession> ls = this.sessionMap.get(uid);
			
			String sid = session.getId();
			Iterator<HttpSession> itr = ls.iterator();
			while(itr.hasNext()){
				HttpSession s = itr.next();
				if(s.getId().equals(sid)){
					ls.remove(s);
					return;
				}
			}	
		}
	}

	@Override
	public void create(HttpSession session) {
		Integer uid = (Integer) session.getAttribute("user_id");
		if(uid==null)
			return;
		else{
			List<HttpSession> ls = sessionMap.get(uid);
			if(ls==null){
				List<HttpSession> _ls = new ArrayList<HttpSession>();
				_ls.add(session);
				this.sessionMap.put(uid, _ls);
			}else{
				ls.add(session);
			}
		}
	}

	@Override
	public List<HttpSession> get(Integer uid) {		
		return this.sessionMap.get(uid);
	}
	
}
