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


import com.flyaway.dao.MasterPlaceListDAO;
import com.flyaway.entity.MasterPlacesList;



/**
 * Servlet implementation class ManageAirlinesServlet
 */
@WebServlet("/manageairlines")
public class ManageAirlinesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageAirlinesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MasterPlaceListDAO dao = new MasterPlaceListDAO();
		try {
			 
            List<MasterPlacesList> listCatagory = dao.list();
            request.setAttribute("listCategory", listCatagory);
 
            RequestDispatcher dispatcher = request.getRequestDispatcher("ManageAirlines.jsp");
            dispatcher.forward(request, response);
 
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
        
		//listCategory(request, response);
	}

	private void listCategory(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		MasterPlaceListDAO dao = new MasterPlaceListDAO();
 
        try {
 
        	List<MasterPlacesList> listCatagory = dao.list();
            request.setAttribute("listCategory", listCatagory);
            
 
            RequestDispatcher dispatcher = request.getRequestDispatcher("ManageAirlines.jsp");
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
 
		//response.sendRedirect("ManageAirlines.html");
	//	int Id = Integer.parseInt(request.getParameter("Airport_Name"));
		 
      //  request.setAttribute("selectedCatId", Id);
		Integer selectedAirport = 3;  
		request.setAttribute("selectedAirport", selectedAirport);
 
        listCategory(request, response);
	}

}
