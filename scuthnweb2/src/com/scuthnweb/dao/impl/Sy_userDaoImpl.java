package com.scuthnweb.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.scuthnweb.dao.Sy_userDao;
import com.scuthnweb.domain.Sy_user;

public class Sy_userDaoImpl extends HibernateDaoSupport implements Sy_userDao{

	@Override
	public void create(Sy_user sy_user) {
		this.getHibernateTemplate().save(sy_user); 
	}

	@Override
	public List findByNameAndGradeAndMajor(String name, String grade, String major) {
		String hql = "FROM sy_user s WHERE s.name=? AND s.grade=? AND s.major=?";
		List ls = this.getHibernateTemplate().find(hql,new Object[]{name,grade,major});
		return ls;
	}
	
}
