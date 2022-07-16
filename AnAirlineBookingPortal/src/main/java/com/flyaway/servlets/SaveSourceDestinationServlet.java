package com.flyaway.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flyaway.entity.MasterPlacesList;
import com.flyaway.util.HibernateUtilDBUtil;

/**
 * Servlet implementation class SaveSourceDestinationServlet
 */
@WebServlet("/sucessfulinsertionsourcedestination")
public class SaveSourceDestinationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveSourceDestinationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//String place_id = request.getParameter("placeid");
		String placename = request.getParameter("placename");
		String airportname = request.getParameter("airportname");
		String country = request.getParameter("country");
		
		MasterPlacesList sd = new MasterPlacesList();
		sd.setPlaceName(placename);
		sd.setAirportName(airportname);
		sd.setCountry(country);
		/*
		 * sd.(placename); sd.setAirport_Name(airportname); sd.setCountry(country);
		 */
		// Load the Session Factory Object 
		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		//Now we create session object or Get session object
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(sd);
		tx.commit();
		session.close();
		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		pw.append("<h1 style=\"color:Green;\">Source and Destimation Master Data saved successfully.</h1>");
		pw.append("</body></html>");
	}

}
