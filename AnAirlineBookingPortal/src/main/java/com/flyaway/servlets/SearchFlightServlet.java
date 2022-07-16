package com.flyaway.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.dao.FlightDAO;
import com.flyaway.dao.MasterPlaceListDAO;
import com.flyaway.entity.Flight;
import com.flyaway.util.DateUtil;

@WebServlet("/SearchFlight")
public class SearchFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchFlightServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MasterPlaceListDAO placeDao=new MasterPlaceListDAO();
		 try {
			request.setAttribute("masterPlaceList", placeDao.list());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 RequestDispatcher dispatcher = request.getRequestDispatcher("searchaFlight.jsp");
         dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		FlightDAO dao= new FlightDAO();
		String sourceAirport = request.getParameter("sourceAirport");
		String destinationAirport = request.getParameter("destinationAirport");
		Date flyingDate =DateUtil.convertStringToDateYYYYMMDD( request.getParameter("flyingDate"));
		int noOfpassanger =Integer.parseInt(request.getParameter("noOfpasnger"));

		List<Flight> flightList=new ArrayList<Flight>();
		
		try {
			flightList = dao.getFlight(sourceAirport, destinationAirport, flyingDate, noOfpassanger);
			
	            request.setAttribute("flightList", flightList);
	            request.setAttribute("noOfpassanger", noOfpassanger);
	            RequestDispatcher dispatcher = request.getRequestDispatcher("ListAvailableFlights.jsp");
	            dispatcher.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		 
	}

}
