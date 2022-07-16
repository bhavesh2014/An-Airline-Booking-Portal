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
 * Servlet implementation class SaveNewAdminDetails
 */
@WebServlet("/savenewadmindetails")
public class SaveNewAdminDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveNewAdminDetails() {
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
		String AdminName = request.getParameter("adminname");
		String AdminUserName= request.getParameter("username");
		String AdminPasword=request.getParameter("password");
		
		
		//Create the object with the above details from the user details 
		Admin_Table ad = new Admin_Table();
		ad.setAdmin_Name(AdminName);
		ad.setAdmin_User_Name(AdminUserName);
		ad.setAdmin_Pasword(AdminPasword);
		
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
		pw.append("<h1 style=\"color:Tomato;\">Congratulations! The new Admin has been added successfully...</h1>");
		pw.append("</body></html>");
		
		
	}

}
