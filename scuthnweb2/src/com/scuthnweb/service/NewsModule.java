package com.scuthnweb.service;

import java.util.List;

import com.scuthnweb.domain.New;

public interface NewsModule {
	public New checkNew(Integer nid);
	
	public List<Object[]> checkNewsByUid(Integer uid);
	
	public boolean createNew(Integer uid,String title,String content);
	
	public boolean postNew(Integer uid,Integer nid);
	
	public boolean pullNew(Integer uid,Integer nid);
	
	public boolean modifyNew(Integer uid,Integer nid,String title,String content);
}
