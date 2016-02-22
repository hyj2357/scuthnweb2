package com.scuthnweb.dao;

import java.util.List;

import com.scuthnweb.domain.Account;

public interface AccountDao {
	public void create(Account account);
	public List findByAccount(String account);
	public List findByAccountAndPassword(String account,String password);
}
