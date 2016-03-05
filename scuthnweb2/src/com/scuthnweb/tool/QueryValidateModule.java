package com.scuthnweb.tool;

import com.scuthnweb.dao.AccountDao;
import com.scuthnweb.dao.Login_sessionDao;
import com.scuthnweb.dao.RoleDao;
import com.scuthnweb.dao.Sy_userDao;
import com.scuthnweb.dao.Sy_user_picDao;
import com.scuthnweb.domain.Role;
import com.scuthnweb.domain.Sy_user_pic;
import com.scuthnweb.listener.LoginSessionContainer;

/**
 * 
 * @author YJ.Huang
 *
 */
public class QueryValidateModule {
	private AccountDao accountDao;
	private Sy_userDao sy_userDao;
	private RoleDao roleDao;
	private Login_sessionDao login_sessionDao;
	private LoginSessionContainer loginSessionContainer;
	
	/**
	 * ����û����Ƿ����
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
	 * ��������꼶��רҵ�Ƿ�ͬʱ�ظ�
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
	 * �û��Ƿ������ӦȨ��
	 * @param id
	 * @return
	 */
	public boolean hasAuthority(Integer id){
		Role role = (Role)this.roleDao.findByUid(id).get(0);
		return role.getAuthority()==1?true:false;
	}
	
	
	/**
	 * �û���ɫ
	 * @param id
	 * @return
	 */
	public String userRole(Integer id){
		Role role = (Role)this.roleDao.findByUid(id).get(0);
		return role.getRole_name();
	}
	
	/**
	 * ��⵱ǰ�û��Ƿ��Ѿ���¼�Ự
	 * @param uid
	 * @return
	 */
	public boolean isLogin(Integer uid){
		if(this.login_sessionDao.findByAccount(uid).size()>0)
			return true;
		else
			return false;
	}
	
	/**
	 * ��⵱ǰ�Ự�Ƿ��¼
	 * @param uid
	 * @param sid
	 * @return
	 */
	public boolean isSessionLogin(Integer uid,String sid){
		if(LoginSessionContainer.findLoginSessionByUidAndSid(uid, sid)==null)
			return false;
		else
			return true;
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

	public LoginSessionContainer getLoginSessionContainer() {
		return loginSessionContainer;
	}

	public void setLoginSessionContainer(LoginSessionContainer loginSessionContainer) {
		this.loginSessionContainer = loginSessionContainer;
	}
}
