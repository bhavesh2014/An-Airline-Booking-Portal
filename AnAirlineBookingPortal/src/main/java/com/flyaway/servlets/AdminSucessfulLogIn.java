package com.flyaway.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.flyaway.dao.AdminTableDAO;
import com.flyaway.entity.Admin_Table;
import com.flyaway.entity.MasterPlacesList;
import com.flyaway.util.HibernateUtilDBUtil;

/**
 * Servlet implementation class AdminSucessfulLogIn
 */
@WebServlet("/adminenter")
public class AdminSucessfulLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Admin_Table = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSucessfulLogIn() {
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
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		
		//SessionFactory sf = HibernateUtilDBUtil.getSessionFactory();
		//Session session = sf.openSession();
		
		//session.createQuery("from Admin_Table"  + "where Admin_User_Name = ? ");
		AdminTableDAO adm = new AdminTableDAO();
		List<Admin_Table> adminList=new ArrayList<Admin_Table>();
		try {
			adminList = adm.list();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Admin_Table admobj:adminList) {
			if(admobj.getAdmin_User_Name().equals(username) && admobj.getAdmin_Pasword().equals(userpwd)) {
				response.sendRedirect("adminBackendActivity.html");
				return;
			}
		}
		response.sendRedirect("invalidlogin.html");
		/*
		if( username.equals("admin") && userpwd.equals("admin")) {
			response.sendRedirect("adminBackendActivity.html");
		}
		else {
			
			response.sendRedirect("invalidlogin.html");
		}
		*/
	}

}
