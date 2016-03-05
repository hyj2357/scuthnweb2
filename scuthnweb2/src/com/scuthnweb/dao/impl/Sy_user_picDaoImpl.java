package com.scuthnweb.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.scuthnweb.dao.Sy_user_picDao;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.scuthnweb.dao.Sy_user_picDao;
import com.scuthnweb.domain.Sy_user_pic;

public class Sy_user_picDaoImpl extends HibernateDaoSupport implements Sy_user_picDao{

	@Override
	public void create(Sy_user_pic sy_user_pic) {
		this.getHibernateTemplate().save(sy_user_pic);
	}

	@Override
	public void delete(final Sy_user_pic sy_user_pic) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(Session session) throws HibernateException, SQLException {
						session.setFlushMode(FlushMode.AUTO);
						session.beginTransaction();
						Query query = session.createSQLQuery("DELETE FROM Sy_user_pic WHERE id=?")
								.setInteger(0, sy_user_pic.getId() );
						query.executeUpdate();					
						session.getTransaction().commit();
						return null; 
					}
				});	
	}

	@Override
	public void update(final Sy_user_pic sy_user_pic) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {
					public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
						session.setFlushMode(FlushMode.AUTO); 
						session.update(sy_user_pic); 
						session.flush(); 
						return null; 
					}
				});
	}

	@Override
	public Sy_user_pic get(Integer id) {
		return (Sy_user_pic)this.getHibernateTemplate().get(Sy_user_pic.class, id);
	}

	@Override
	public List findByUid(Integer uid) {
		String hql = "FROM Sy_user_pic s WHERE s.account.id=?";
		List ls = this.getHibernateTemplate().find(hql,new Object[]{uid});
		return ls;
	}
}
