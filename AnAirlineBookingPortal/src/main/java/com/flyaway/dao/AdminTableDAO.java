package com.flyaway.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.flyaway.entity.Admin_Table;
import com.flyaway.util.HibernateUtilDBUtil;

public class AdminTableDAO {

	public List<Admin_Table> list() throws SQLException {
        List<Admin_Table> adminList = new ArrayList<>();

		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		Session session = sf.openSession();
        
		Query query = session.createQuery("FROM Admin_Table ");

		adminList = query.getResultList();
        return adminList;
        
	}        
}
