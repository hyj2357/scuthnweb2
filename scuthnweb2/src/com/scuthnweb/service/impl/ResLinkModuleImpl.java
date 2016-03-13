package com.scuthnweb.service.impl;

import com.scuthnweb.dao.AccountDao;
import com.scuthnweb.dao.Share_linkDao;
import com.scuthnweb.domain.Account;
import com.scuthnweb.domain.Share_link;
import com.scuthnweb.service.ResLinkModule;

public class ResLinkModuleImpl implements ResLinkModule{
	private Share_linkDao share_linkDao;
	private AccountDao accountDao;
	@Override
	public boolean createResLink(Integer uid, String link_name, String link_content, String category) {
		Account ac = this.accountDao.get(uid);
		Share_link share_link = new Share_link();
		share_link.setLink_name(link_name);
		share_link.setLink(link_content);
		share_link.setPoster_account(ac);
		share_link.setAdd_time(new java.sql.Timestamp(System.currentTimeMillis()));
		this.share_linkDao.create(share_link);
		return true;
	}

	public Share_linkDao getShare_linkDao() {
		return share_linkDao;
	}

	public void setShare_linkDao(Share_linkDao share_linkDao) {
		this.share_linkDao = share_linkDao;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

}
