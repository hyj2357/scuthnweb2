package com.scuthnweb.dao;

import java.util.List;

import com.scuthnweb.domain.Valid_code;

/**
 * 
 * @author YJ.Huang
 *
 */
public interface Valid_codeDao {
	public void create(Valid_code valid_code);
	public List findIdByValid_code(String valid_code);
	public boolean delete(final Valid_code valid_code);
	public Valid_code get(Integer id);
}
