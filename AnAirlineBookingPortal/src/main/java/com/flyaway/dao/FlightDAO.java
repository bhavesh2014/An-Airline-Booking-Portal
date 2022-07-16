package com.flyaway.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flyaway.entity.Flight;
import com.flyaway.util.HibernateUtilDBUtil;

public class FlightDAO {

	@SuppressWarnings("unchecked")
	public List<Flight> list() throws SQLException {
        List<Flight> flightList = new ArrayList<>();

		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		Session session = sf.openSession();
        
		Query query = session.createQuery("FROM Flight ");

		flightList = query.getResultList();
        return flightList;
        
	}   
	
	public void saveFlight(Flight flight) throws SQLException {
		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(flight);
		tx.commit();		
		session.close();
	}     
	
	@SuppressWarnings("unchecked")
	public List<Flight> getFlight(String sourceAirport, String destinationAirport, Date flyingDate, int noOfPassanger) throws SQLException {

		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		Session session = sf.openSession();
        
		Query query = session.createQuery("FROM Flight f where f.sourceAirport=:sourceAirport and f.destinationAirport=:destinationAirport and f.flyingDate=:flyingDate and "
				+ "totalAvailableTkt >= : totalAvailableTkt");

		query.setParameter("sourceAirport", sourceAirport);
		query.setParameter("destinationAirport", destinationAirport);
		query.setParameter("flyingDate", flyingDate);
		query.setParameter("totalAvailableTkt", noOfPassanger);
		List<Flight>results = query.getResultList();		
        return results;
        
	}  
	@SuppressWarnings("unchecked")
	public Flight getFlightById(  int flightId) throws SQLException {

		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		Session session = sf.openSession();
        
		Query query = session.createQuery("FROM Flight f where f.flightId=:flightId  ");

		query.setParameter("flightId", flightId);
		List<Flight>results = query.getResultList();		
        return results.get(0);
        
	}  
	public void  updateFlight(Flight flight) throws SQLException {
		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(flight);
		tx.commit();		
		session.close();
	} 
}
