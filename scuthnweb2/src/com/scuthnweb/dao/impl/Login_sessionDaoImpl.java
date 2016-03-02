package com.scuthnweb.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.scuthnweb.dao.Login_sessionDao;
import com.scuthnweb.domain.Login_session;

public class Login_sessionDaoImpl extends HibernateDaoSupport implements Login_sessionDao{

	@Override
	public void create(Login_session login_session) {
		this.getHibernateTemplate().save(login_session);
	}

	@Override
	public void delete(final Login_session login_session) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(Session session) throws HibernateException, SQLException {
						session.setFlushMode(FlushMode.AUTO);
						session.beginTransaction();
						Query query = session.createSQLQuery("DELETE FROM Login_session WHERE id=?")
								.setInteger(0, login_session.getId() );
						query.executeUpdate();					
						session.getTransaction().commit();
						return null; 
					}
				});				
	}

	@Override
	public void update(final Login_session login_session) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {
					public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
						session.setFlushMode(FlushMode.AUTO); 
						session.update(login_session); 
						session.flush(); 
						return null; 
					}
		});
	}

	@Override
	public Login_session get(Integer id) {
		return 	(Login_session)this.getHibernateTemplate().get(Login_session.class, id);
	}

	@Override
	public List findByUid(Integer uid) {
		String hql = "FROM Login_session l WHERE l.account.id=?";
		List ls = this.getHibernateTemplate().find(hql,new Object[]{uid});
		return ls;
	}

	@Override
	public List findByAccount(String account) {
		String hql = "FROM Login_session l WHERE l.account.account=?";
		List ls = this.getHibernateTemplate().find(hql,new Object[]{account});
		return ls;
	}

	@Override
	public List findBySession_id(String session_id) {
		String hql = "FROM Login_session l WHERE l.session_id=?";
		List ls = this.getHibernateTemplate().find(hql,new Object[]{session_id});
		return ls;
	}

}
