package com.scuthnweb.service;

import com.scuthnweb.domain.Sy_user;

public interface UserAdModule {
	public Sy_user register(String account,String name,String major,String mail,String password,String cpassword);
	
	public Sy_user inviteRegister(String account,String password,String cpassword);
	
	public Sy_user activateUser(String valid_code);
}
