package com.scuthnweb.dao;

import java.util.List;

import com.scuthnweb.domain.Login_session;

public interface Login_sessionDao {
	public void create(Login_session login_session);
	
	public void delete(Login_session login_session);
	
	public void update(Login_session login_session);
	
	public Login_session get(Integer id);
	
	/**
	 * ”…uid≤È—ØLogin_session
	 * @param uid
	 * @return
	 */
	public List findByUid(Integer uid);
	
	/**
	 * 
	 * @param session_id
	 * @return
	 */
	public List findBySession_id(String session_id);
	
	/**
	 * 
	 * @param account
	 * @return
	 */
	public List findByAccount(String account);
	
}
