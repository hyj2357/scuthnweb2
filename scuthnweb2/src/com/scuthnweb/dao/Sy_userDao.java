package com.scuthnweb.dao;

import java.util.List;

import com.scuthnweb.domain.Sy_user;

public interface Sy_userDao {
	public void create(Sy_user sy_user);
	public void update(Sy_user sy_user);
	public List findByNameAndGradeAndMajor(String name,String grade,String major);
	public List findByUid(Integer uid);
}
