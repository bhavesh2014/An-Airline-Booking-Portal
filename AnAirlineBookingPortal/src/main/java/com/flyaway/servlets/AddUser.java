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

import com.flyaway.entity.users;
import com.flyaway.util.HibernateUtilDBUtil;

//import Utility.Session.Factory.HibernateUtilSessFac;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/add-user")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//String User_Id = request.getParameter("User_Id");
		String Email_address = request.getParameter("emailAddress");
		String User_type = request.getParameter("types1");
		
		//Create the object:
		users us = new users();
		//ea.setPrice(Double.parseDouble(productPrice));
		//us.setUser_Id(Integer.parseInt(User_Id));
		//us.setUser_Id(User_Id);
		us.setEmail_address(Email_address);
		us.setUser_type(User_type);
		
		//now create Session Factory , session, transaction, commit the transaction and close the session object.
		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		//Now we create session object or Get session object
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(us);
		tx.commit();
		
		session.close();
		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		pw.append("Your user added successfully...");
		pw.append("</body></html>");
		
	}

}
