package com.scuthnweb.dao;

import java.util.List;

import com.scuthnweb.domain.Sy_user_pic;

public interface Sy_user_picDao {
	public Sy_user_pic get(Integer id);
	
	public void create(Sy_user_pic sy_user_pic);
	
	public void delete(Sy_user_pic sy_user_pic);
	
	public void update(Sy_user_pic sy_user_pic);

	public List findByUid(Integer uid);
}
