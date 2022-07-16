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

import com.flyaway.entity.Airlines;
import com.flyaway.util.HibernateUtilDBUtil;

/**
 * Servlet implementation class SaveAirlinesDetailsServlet
 */
@WebServlet("/sucessfulinsertionairlines")
public class SaveAirlinesDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveAirlinesDetailsServlet() {
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

		String airlines_name = request.getParameter("airlinesname");
		
		Airlines air = new Airlines();
		air.setAirlinesName(airlines_name);
		
		// Load the Session Factory Object 
		SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		//Now we create session object or Get session object
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(air);
		tx.commit();
		session.close();
		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		pw.append("<h1 style=\"color:Green;\">New Airlines Record saved successfully.</h1>");
		pw.append("</body></html>");
	}

}
