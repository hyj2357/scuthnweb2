package com.scuthnweb.dao;

import java.util.List;

import com.scuthnweb.domain.Account;

/**
 * 
 * @author YJ.Huang
 *
 */
public interface AccountDao {
	public void create(Account account);
	public boolean update(Account account);
	public Account get(Integer id);
	public List findByAccount(String account);
	public List findByAccountAndPassword(String account,String password);
}
