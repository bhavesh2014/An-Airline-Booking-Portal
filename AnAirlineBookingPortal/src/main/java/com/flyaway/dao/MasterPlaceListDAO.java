package com.flyaway.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.flyaway.entity.MasterPlacesList;
import com.flyaway.util.HibernateUtilDBUtil;
//import com.testdatabase.entity.DynamicDropdown;
//import com.testdatabse.util.HibernateUtilDBUtil;

public class MasterPlaceListDAO {

	public List<MasterPlacesList> list() throws SQLException {
        List<MasterPlacesList> listCategory = new ArrayList<>();

		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		Session session = sf.openSession();
        
		Query query = session.createQuery("FROM MasterPlacesList ");

		listCategory = query.getResultList();
        return listCategory;
}
}
