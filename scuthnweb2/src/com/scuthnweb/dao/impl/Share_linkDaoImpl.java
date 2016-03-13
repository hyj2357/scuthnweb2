package com.scuthnweb.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.scuthnweb.dao.Share_linkDao;
import com.scuthnweb.domain.Share_link;

public class Share_linkDaoImpl extends HibernateDaoSupport implements Share_linkDao{

	@Override
	public void create(Share_link share_link) {
		this.getHibernateTemplate().save(share_link);
	}

}
