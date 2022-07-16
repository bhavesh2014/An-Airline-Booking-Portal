package com.flyaway.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.flyaway.entity.Admin_Table;
import com.flyaway.entity.Airlines;
import com.flyaway.util.HibernateUtilDBUtil;

public class AirlinesTableDAO {
	public List<Airlines> list() throws SQLException {
        List<Airlines> airlinesList = new ArrayList<>();

		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		Session session = sf.openSession();
        
		Query query = session.createQuery("FROM Airlines");

		airlinesList = query.getResultList();
        return airlinesList;
        
	}       
}
