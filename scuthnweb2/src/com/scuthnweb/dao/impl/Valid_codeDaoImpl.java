package com.scuthnweb.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.scuthnweb.dao.Valid_codeDao;
import com.scuthnweb.domain.Valid_code;
/**
 * 
 * @author YJ.Huang
 *
 */
public class Valid_codeDaoImpl extends HibernateDaoSupport implements Valid_codeDao{

	@Override
	public void create(Valid_code valid_code) {
		this.getHibernateTemplate().save(valid_code);
	}

	@Override
	public List findIdByValid_code(String valid_code) {
		String hql = "SELECT v.id FROM Valid_code v WHERE v.code=?";
		List ls = this.getHibernateTemplate().find(hql,new Object[]{valid_code});
		return ls;
	}
	
	public Valid_code get(Integer id){
		return (Valid_code) this.getHibernateTemplate().get(Valid_code.class, id);		
	}
	
	public boolean delete(final Valid_code valid_code) {
		this.getHibernateTemplate().execute(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(Session session) throws HibernateException, SQLException {
						session.setFlushMode(FlushMode.AUTO);
						session.beginTransaction();
						Query query = session.createSQLQuery("DELETE FROM valid_code WHERE id=?")
								.setInteger(0, valid_code.getId() );
						query.executeUpdate();					
						session.getTransaction().commit();
						return null; 
					}
				});		
		return true;
	}
}
