package com.scuthnweb.listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.scuthnweb.dao.Login_sessionDao;

/**
 * 
 * @author YJ.Huang
 *
 */
public class LoginSessionContainer{
	private static Map<Integer,List<HttpSession>> sessionMap = new HashMap<Integer,List<HttpSession>>();

	
	public static Map<Integer, List<HttpSession>> getSessionMap() {
		return sessionMap;
	}

	public static void delete(HttpSession session) {
		Integer uid = (Integer) session.getAttribute("user_id");
		if(uid==null)
			return;
		else{
			List<HttpSession> ls = sessionMap.get(uid);	
			if(ls==null){
				String sid = session.getId();
				Iterator<HttpSession> itr = ls.iterator();
				while(itr.hasNext()){
					HttpSession s = itr.next();
					if(s.getId().equals(sid)){
						ls.remove(s);
						return;
					}
				}	
			}else{
				return;
			}
		}
	}

	public static void create(HttpSession session) {
		Integer uid = (Integer) session.getAttribute("user_id");
		if(uid==null)
			return;
		else{
			List<HttpSession> ls = sessionMap.get(uid);
			if(ls==null){
				List<HttpSession> _ls = new ArrayList<HttpSession>();
				_ls.add(session);
				sessionMap.put(uid, _ls);
			}else{
				ls.add(session);
			}
		}
	}

	public static List<HttpSession> get(Integer uid) {		
		return sessionMap.get(uid);
	}
		
	public static HttpSession findLoginSessionByUidAndSid(Integer uid,String sid){
		List<HttpSession> ls = LoginSessionContainer.get(uid);
		if(ls==null)
			return null;
		HttpSession session = null;
		Iterator<HttpSession> itr = ls.iterator();
		while(itr.hasNext()){
			HttpSession s = itr.next();
			if(s.getId().equals(sid)){
				session = s;
				break;
			}
		}			
		return session;
	}
	
}
