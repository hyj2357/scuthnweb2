package com.scuthnweb.service.impl;

import com.scuthnweb.dao.AccountDao;
import com.scuthnweb.dao.RoleDao;
import com.scuthnweb.dao.Sy_userDao;
import com.scuthnweb.domain.Sy_user;
import com.scuthnweb.service.UserAdModule;

public class UserAdModuleImpl implements UserAdModule{
	private AccountDao accountDao;
	private Sy_userDao sy_userDao;
	private RoleDao roleDao;
	
	@Override
	public Sy_user register(String account, String name, String major, String mail, String password, String cpassword) {
		return null;
	}

	@Override
	public Sy_user inviteRegister(String account, String password, String cpassword) {
		return null;
	}

	@Override
	public Sy_user activateUser(String valid_code) {
		return null;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public Sy_userDao getSy_userDao() {
		return sy_userDao;
	}

	public void setSy_userDao(Sy_userDao sy_userDao) {
		this.sy_userDao = sy_userDao;
	}

	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
}
