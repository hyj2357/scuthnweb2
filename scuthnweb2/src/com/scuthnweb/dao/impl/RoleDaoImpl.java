package com.scuthnweb.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.scuthnweb.dao.RoleDao;
import com.scuthnweb.domain.Role;
import com.scuthnweb.domain.Valid_code;

public class RoleDaoImpl  extends HibernateDaoSupport implements RoleDao{

	@Override
	public void create(Role role) {
		this.getHibernateTemplate().save(role);
	}

	@Override
	public boolean delete(final Role role) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(Session session) throws HibernateException, SQLException {
						session.setFlushMode(FlushMode.AUTO);
						session.beginTransaction();
						Query query = session.createSQLQuery("DELETE FROM role WHERE id=?")
								.setInteger(0, role.getId() );
						query.executeUpdate();					
						session.getTransaction().commit();
						return null; 
					}
				});		
		return true;
	}

	@Override
	public Role get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(final Role role) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
						session.setFlushMode(FlushMode.AUTO); 
						session.update(role); 
						session.flush(); 
						return null; 
					}
		});
		return true;
	}

	@Override
	public List findByUid(Integer uid) {
		String hql = "FROM Role r WHERE r.account.id=?";
		return this.getHibernateTemplate().find(hql, new Object[]{uid});
	}
}
