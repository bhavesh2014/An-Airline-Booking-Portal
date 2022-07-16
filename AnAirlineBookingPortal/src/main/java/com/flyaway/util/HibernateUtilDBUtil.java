package com.flyaway.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.flyaway.entity.Admin_Table;
import com.flyaway.entity.Airlines;
import com.flyaway.entity.Flight;
import com.flyaway.entity.MasterPlacesList;
import com.flyaway.entity.users;

//import com.simplilearn.entity.PhoneNumber;
//import com.simplilearn.entity.Student;
//This is Configuration object from here we will create session factory, so create Util class , this class will give us session factory whenever we need
public class HibernateUtilDBUtil {

	//Create a method for Session Factory
	static SessionFactory sessionFactory ;
	
	public static SessionFactory getSessionFactory() {
		
		//Create Configuration object , provide DB information and mapping information
		if(sessionFactory != null) return sessionFactory;
		//Created configuration object, and provide DB information and mapping information by hibernate.cfg.xml.
		//we inject the DB information
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Add annotated class like below
		//configuration.addAnnotatedClass(users.class);///Here is the mapping information we provide.
		configuration.addAnnotatedClass(Admin_Table.class); //Here is the mapping information we provide.
		configuration.addAnnotatedClass(MasterPlacesList.class); //Here is the mapping information we provide.
		configuration.addAnnotatedClass(Airlines.class); //Here is the mapping information we provide.
		configuration.addAnnotatedClass(Flight.class);
		//onfiguration.addAnnotatedClass(PhoneNumber.class);
		//How do we provide the mapping information
		//configuration.addAnnotatedClass(EmpJPAnnot.class);
		//For each and every entity we need to add
		//Create session factory aboject and return
		sessionFactory = configuration.buildSessionFactory();//Build session factory object and return
		return sessionFactory;
	}
	


}
