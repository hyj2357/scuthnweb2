package com.scuthnweb.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.scuthnweb.dao.AccountDao;
import com.scuthnweb.dao.RoleDao;
import com.scuthnweb.dao.Sy_userDao;
import com.scuthnweb.dao.Valid_codeDao;
import com.scuthnweb.domain.Account;
import com.scuthnweb.domain.Sy_user;
import com.scuthnweb.domain.Valid_code;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.MD5Util;
import com.scuthnweb.tool.SMTPUtil;

public class UserAdModuleImpl implements UserAdModule{
	private AccountDao accountDao;
	private Sy_userDao sy_userDao;
	private RoleDao roleDao;
	private Valid_codeDao valid_codeDao;
	
	@Override
	public Sy_user register(String account, String name, String grade, String major, String mail, String password) {
		/** ����Account **/
		Account _account = new Account();
	    _account.setAccount(account);
	    Timestamp d = new Timestamp(System.currentTimeMillis());
	    _account.setRegister_time(d);
	    _account.setPassword(password);	    
	    this.accountDao.create(_account);
	    
	    /** ����Sy_user **/
	    Sy_user sy_user = new Sy_user();
	    sy_user.setUser_name(name);
	    sy_user.setMajor(major);
	    sy_user.setMail(mail);
	    sy_user.setGrade(grade);
	    sy_user.setAccount(_account);	    
	    this.sy_userDao.create(sy_user);
	    
	    /** ���ɼ����� **/
	    Valid_code valid_code = new Valid_code();
	    valid_code.setAccount(_account);
	    valid_code.setCode(MD5Util.stringMD5(name+grade+major));
	    valid_code.setValid_time(new Timestamp(System.currentTimeMillis()+86400000)); //��Ч����Ϊһ��(86400000����)֮��
	    this.valid_codeDao.create(valid_code);
	   
	    /******************
	                     ���ͼ����ʼ�
	     ******************/
	    SMTPUtil.sendMail("smtp.163.com", "hyj23575651", "18976445506qwe", "hyj23575651@163.com", mail, "��������ѧ����ͬ���ƽ̨�û�����.", "��ӭ����뻪������ͬ���,���������������ע��:http://localhost/scuthnweb2/activateUser?validcode="+valid_code.getCode());
		return sy_user;
	}

	@Override
	public Sy_user inviteRegister(String account, String password) {
		return null;
	}

	@Override
	public Sy_user activateUser(String valid_code) {
		return null;
	}

	@Override
	public Account login(String account, String password) {
		Account _account = new Account();
		List ls = this.accountDao.findByAccountAndPassword(account, password);
		if(ls.size()==0)
			return null;
		else{
			_account.setId((int)((Object[])ls.get(0))[0]);
			_account.setAccount((String)((Object[])ls.get(0))[1]);			
			return _account;
		}	
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

	public Valid_codeDao getValid_codeDao() {
		return valid_codeDao;
	}

	public void setValid_codeDao(Valid_codeDao valid_codeDao) {
		this.valid_codeDao = valid_codeDao;
	}
	
}
