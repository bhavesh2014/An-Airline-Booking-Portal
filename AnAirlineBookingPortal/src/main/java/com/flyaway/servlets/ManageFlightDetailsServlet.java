package com.flyaway.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.dao.AirlinesTableDAO;
import com.flyaway.dao.MasterPlaceListDAO;
import com.flyaway.entity.Airlines;
import com.flyaway.entity.MasterPlacesList;

/**
 * Servlet implementation class ManageFlightDetailsServlet//DAO Layer
 */
@WebServlet("/manageflightdetails")
public class ManageFlightDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageFlightDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AirlinesTableDAO dao = new AirlinesTableDAO();
		try {
			 
            List<Airlines> airlinesList = dao.list();
            request.setAttribute("airlinesList", airlinesList);
            
            MasterPlaceListDAO placeDao=new MasterPlaceListDAO();
            request.setAttribute("masterPlaceList", placeDao.list());
       
 
            RequestDispatcher dispatcher = request.getRequestDispatcher("ManageFlightDetails.jsp");
            dispatcher.forward(request, response);
 
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
	}
 	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AirlinesTableDAO airlineDao = new AirlinesTableDAO();
		MasterPlaceListDAO placeDao=new MasterPlaceListDAO();
		 try {
		        request.setAttribute("airlinesList", airlineDao.list());
		        
		        request.setAttribute("masterPlaceList", placeDao.list());
		        
		        
	            RequestDispatcher dispatcher = request.getRequestDispatcher("ManageFlightDetails.jsp");
	            dispatcher.forward(request, response);
	 
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new ServletException(e);
	        }
		
		
	}

}
