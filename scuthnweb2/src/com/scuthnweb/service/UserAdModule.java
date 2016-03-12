package com.scuthnweb.service;

import com.scuthnweb.domain.Account;
import com.scuthnweb.domain.Sy_user;
/**
 * 
 * @author YJ.Huang
 *
 */
public interface UserAdModule {
	public Sy_user register(String account,String name,String gender,String grade,String major,String mail,String password);
	
	public Sy_user inviteRegister(String account,String password);
	
	public Account activateUser(String valid_code);
	
	Account login(String account, String password, String sid);
	
	public Object[] checkUserInfo(Integer id);
	
	public Sy_user modifyUserInfo(Integer uid,String account,String gender,String grade,String college,String major,String phone_number,String qq_number,String wechat_number);

	public void loginOut(String sid);
	
	public void autoLogin(Integer uid,String sid);
	
	public String uploadUserIcon(Integer uid,String path);
}
