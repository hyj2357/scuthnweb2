package com.scuthnweb.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.ejb.HibernateQuery;
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
	public boolean update(Account account) {
		return false;
	}

	@Override
	public Account get(Integer id) {
		return (Account) this.getHibernateTemplate().get(Account.class, id);		
	}
	
}
