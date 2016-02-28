package com.scuthnweb.listener;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.scuthnweb.dao.AccountDao;
import com.scuthnweb.dao.Login_sessionDao;
import com.scuthnweb.domain.Login_session;

public class LoginSessionListener implements HttpSessionListener{
	private Login_sessionDao login_sessionDao;
	private AccountDao accountDao;
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
	
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		Integer uid = (Integer)session.getAttribute("user_id");
		if(uid!=null){
			List ls = this.login_sessionDao.findByUid(uid);
			if(ls.size()==0)
				return;
			else{
				this.login_sessionDao.delete((Login_session)ls.get(0));
			}			
		}
		else
			return;
	}

	public Login_sessionDao getLogin_sessionDao() {
		return login_sessionDao;
	}

	public void setLogin_sessionDao(Login_sessionDao login_sessionDao) {
		this.login_sessionDao = login_sessionDao;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
