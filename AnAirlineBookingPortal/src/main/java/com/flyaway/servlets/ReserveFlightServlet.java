package com.flyaway.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.dao.FlightDAO;
import com.flyaway.entity.Flight;

@WebServlet("/reserveFlight")
public class ReserveFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReserveFlightServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int flightId = Integer.parseInt(request.getParameter("flightId"));
		int noOfpassanger =Integer.parseInt(request.getParameter("noOfpassanger"));
		int totalAvailableTkt =Integer.parseInt(request.getParameter("totalAvailableTkt"));
		
		request.setAttribute("flightId", flightId);
		request.setAttribute("noOfpassanger", noOfpassanger);
		request.setAttribute("totalAvailableTkt", totalAvailableTkt);
		/*
		 * Flight flight= new Flight(); flight.setFlightId(flightId);
		 * flight.setTotalAvailableTkt(totalAvailableTkt-noOfpassanger);
		 * flight.setNoOfpassangerBooking(noOfpassanger);
		 * request.setAttribute("flightSelected", flight);
		 */
		 
		 RequestDispatcher dispatcher = request.getRequestDispatcher("PassangerInfo.jsp");
         dispatcher.forward(request, response);
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		FlightDAO dao= new FlightDAO();
		int noOfpassanger =Integer.parseInt(request.getParameter("noOfpassanger"));
		int totalAvailableTkt =Integer.parseInt(request.getParameter("totalAvailableTkt"));
		int flightId =Integer.parseInt(request.getParameter("flightId"));


 Flight flight= new Flight();
 
 flight.setFlightId(flightId);
 
		try {
			 flight=dao.getFlightById(flightId);
			 flight.setTotalAvailableTkt(totalAvailableTkt-noOfpassanger);
			 dao.updateFlight(flight);
			 PrintWriter pw = response.getWriter();
				pw.append("<html><body>");
				pw.append("<h1>Payment Done and Booking Successful</h1>");
				pw.append("</body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		 
	}

}
