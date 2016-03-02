package com.scuthnweb.tool;

import com.scuthnweb.dao.AccountDao;
import com.scuthnweb.dao.Login_sessionDao;
import com.scuthnweb.dao.RoleDao;
import com.scuthnweb.dao.Sy_userDao;
import com.scuthnweb.domain.Role;

public class QueryValidateModule {
	private AccountDao accountDao;
	private Sy_userDao sy_userDao;
	private RoleDao roleDao;
	private Login_sessionDao login_sessionDao;
	
	/**
	 * 检测用户名是否存在
	 * @param account
	 * @return
	 */
	public boolean accountMultiple(String account){
		if(accountDao.findByAccount(account).size()==0)
			return false;
		else
			return true;
	}
	
	/**
	 * 检测姓名年级与专业是否同时重复
	 * @param name
	 * @param grade
	 * @param major
	 * @return
	 */
	public boolean nameAndGradeAndMajorMultiple(String name,String grade,String major){
		if(sy_userDao.findByNameAndGradeAndMajor(name, grade, major).size()==0)
			return false;
		else
			return true;
	}
	
	/**
	 * 用户是否具有相应权限
	 * @param id
	 * @return
	 */
	public boolean hasAuthority(Integer id){
		Role role = (Role)this.roleDao.findByUid(id).get(0);
		return role.getAuthority()==1?true:false;
	}
	
	
	/**
	 * 用户角色
	 * @param id
	 * @return
	 */
	public String userRole(Integer id){
		Role role = (Role)this.roleDao.findByUid(id).get(0);
		return role.getRole_name();
	}
	
	/**
	 * 检测当前用户是否已经登录会话
	 * @param uid
	 * @return
	 */
	public boolean isLogin(String account){
		if(this.login_sessionDao.findByAccount(account).size()>0)
			return true;
		else
			return false;
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

	public Login_sessionDao getLogin_sessionDao() {
		return login_sessionDao;
	}

	public void setLogin_sessionDao(Login_sessionDao login_sessionDao) {
		this.login_sessionDao = login_sessionDao;
	}
}
