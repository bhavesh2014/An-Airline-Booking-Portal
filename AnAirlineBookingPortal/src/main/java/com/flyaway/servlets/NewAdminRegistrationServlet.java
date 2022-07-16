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

import com.flyaway.entity.Admin_Table;
import com.flyaway.util.HibernateUtilDBUtil;

/**
 * Servlet implementation class NewAdminRegistrationServlet
 */
@WebServlet("/adminregistration")
public class NewAdminRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewAdminRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.sendRedirect("NewAdminRegistration.html");
		//request.getRequestDispatcher("NewAdminRegistration.html").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("NewAdminRegistration.html");
		//Now we collect the Data and save it into the database
		//String Admin_Id = request.getParameter("Admin_Id");
		/*
		String Admin_Email_Address = request.getParameter("Admin_Email_Address");
		String Admin_User_Name= request.getParameter("Admin_User_Name");
		String Admin_Pasword=request.getParameter("Admin_Pasword");
		String User_Type = request.getParameter("User_Type");
		
		//Create the object with the above details from the user details 
		Admin_Table ad = new Admin_Table();
		ad.setAdmin_Email_Address(Admin_Email_Address);
		ad.setAdmin_User_Name(Admin_User_Name);
		ad.setAdmin_Pasword(Admin_Pasword);
		ad.setUser_Type(User_Type);
		// Load the Session Factory Object 
		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		//Now we create session object or Get session object
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(ad);
		tx.commit();
		session.close();
		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		pw.append("Admin added successfully...");
		pw.append("</body></html>");
		*/
	}

}
