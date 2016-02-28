package com.scuthnweb.service;

import com.scuthnweb.domain.Account;
import com.scuthnweb.domain.Sy_user;

public interface UserAdModule {
	public Sy_user register(String account,String name,String gender,String grade,String major,String mail,String password);
	
	public Sy_user inviteRegister(String account,String password);
	
	public Account activateUser(String valid_code);
	
	public Account login(String account,String password);
	
	public Sy_user checkUserInfo(Integer id);
	
	public Sy_user modifyUserInfo(Integer uid,String account,String gender,String grade,String college,String major,String phone_number,String qq_number,String wechat_number);

	public void loginOut(Integer uid);
}
