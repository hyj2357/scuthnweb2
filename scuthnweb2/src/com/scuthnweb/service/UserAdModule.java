package com.scuthnweb.service;

import com.scuthnweb.domain.Account;
import com.scuthnweb.domain.Sy_user;

public interface UserAdModule {
	public Sy_user register(String account,String name,String grade,String major,String mail,String password);
	
	public Sy_user inviteRegister(String account,String password);
	
	public Sy_user activateUser(String valid_code);
	
	public Account login(String account,String password);
}
