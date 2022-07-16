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

@WebServlet("/confirmReservation")
public class CustomerConfirmationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerConfirmationServlet() {
		super();
	}

	FlightDAO dao = new FlightDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * request.setAttribute("flightId",
		 * Integer.parseInt(request.getParameter("flightId")));
		 * request.setAttribute("noOfpassanger",
		 * Integer.parseInt(request.getParameter("noOfpassanger")));
		 * request.setAttribute("totalAvailableTkt",
		 * Integer.parseInt(request.getParameter("totalAvailableTkt")));
		 * RequestDispatcher dispatcher =
		 * request.getRequestDispatcher("PaymentProcess.jsp");
		 * dispatcher.forward(request, response);
		 */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int flightId = Integer.parseInt(request.getParameter("flightId"));
		int noOfpassanger = Integer.parseInt(request.getParameter("noOfpassanger"));
		int totalAvailableTkt = Integer.parseInt(request.getParameter("totalAvailableTkt"));

		Flight flight = new Flight();
		flight.setFlightId(flightId);
		try {
			flight = dao.getFlightById(flightId);
			request.setAttribute("flightSelected", flight);
			request.setAttribute("flightId", flightId);
			request.setAttribute("noOfpassanger", noOfpassanger);
			request.setAttribute("totalAvailableTkt", totalAvailableTkt);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("PaymentInfo.jsp");
		dispatcher.forward(request, response);

	}

}
