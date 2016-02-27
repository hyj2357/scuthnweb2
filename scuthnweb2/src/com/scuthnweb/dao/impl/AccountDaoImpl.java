package com.scuthnweb.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.ejb.HibernateQuery;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.scuthnweb.dao.AccountDao;
import com.scuthnweb.domain.Account;
import com.scuthnweb.domain.Valid_code;

public class AccountDaoImpl  extends HibernateDaoSupport implements AccountDao{

	@Override
	public void create(Account account) {
		this.getHibernateTemplate().save(account);
	}
	
	@Override
	public List findByAccount(String account){
		String hql = "FROM Account a WHERE a.account=?";
		List ls = this.getHibernateTemplate().find(hql,new Object[]{account});
		return ls;
	}
	
	@Override
	public List findByAccountAndPassword(String account,String password){
		String hql = "SELECT a.id,a.account FROM Account a WHERE a.account=? AND a.password=?";
		List ls = this.getHibernateTemplate().find(hql,new Object[]{account,password});
		return ls;
	}

	@Override
	public boolean update(final Account account) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {
					public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
						session.setFlushMode(FlushMode.AUTO); 
						session.update(account); 
						session.flush(); 
						return null; 
					}
				});
		return true;
	}

	@Override
	public Account get(Integer id) {
		return (Account) this.getHibernateTemplate().get(Account.class, id);		
	}
	
}
