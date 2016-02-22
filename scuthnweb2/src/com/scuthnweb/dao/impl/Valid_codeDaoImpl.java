package com.scuthnweb.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.scuthnweb.dao.Valid_codeDao;
import com.scuthnweb.domain.Valid_code;

public class Valid_codeDaoImpl extends HibernateDaoSupport implements Valid_codeDao{

	@Override
	public void create(Valid_code valid_code) {
		this.getHibernateTemplate().save(valid_code);
	}
	
	
}
