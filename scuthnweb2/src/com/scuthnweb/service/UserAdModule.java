package com.scuthnweb.service;

import com.scuthnweb.domain.Account;
import com.scuthnweb.domain.Sy_user;

public interface UserAdModule {
	public Sy_user register(String account,String name,String gender,String grade,String major,String mail,String password);
	
	public Sy_user inviteRegister(String account,String password);
	
	public Account activateUser(String valid_code);
	
	public Account login(String account,String password);
	
	public Sy_user checkUserInfo(Integer id);
}
