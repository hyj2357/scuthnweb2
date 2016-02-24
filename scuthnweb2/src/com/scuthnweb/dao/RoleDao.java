package com.scuthnweb.dao;

import java.util.List;

import com.scuthnweb.domain.Role;

public interface RoleDao {
	public void create(Role role);
	public boolean delete(final Role role);
	public boolean update(Role role);
	public Role get(Integer id);
	public List findByUid(Integer uid);
}
