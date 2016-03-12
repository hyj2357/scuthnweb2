package com.scuthnweb.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.scuthnweb.dao.Sy_userDao;
import com.scuthnweb.domain.Sy_user;
/**
 * 
 * @author YJ.Huang
 *
 */
public class Sy_userDaoImpl extends HibernateDaoSupport implements Sy_userDao{

	@Override
	public void create(Sy_user sy_user) {
		this.getHibernateTemplate().save(sy_user); 
	}

	@Override
	public List findByNameAndGradeAndMajor(String name, String grade, String major) {
		String hql = "FROM Sy_user s WHERE s.user_name=? AND s.grade=? AND s.major=?";
		List ls = this.getHibernateTemplate().find(hql,new Object[]{name,grade,major});
		return ls;
	}

	@Override
	public List findByUid(Integer uid) {
		String hql = "FROM Sy_user s WHERE s.account.id=?";
		return this.getHibernateTemplate().find(hql, new Object[]{uid});
	}

	@Override
	public void update(final Sy_user sy_user) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {
					public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
						session.setFlushMode(FlushMode.AUTO); 
						session.update(sy_user); 
						session.flush(); 
						return null; 
					}
				});
	}	
}
