package com.flyaway.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.dao.FlightDAO;
import com.flyaway.entity.Airlines;
import com.flyaway.entity.Flight;
import com.flyaway.util.DateUtil;

@WebServlet("/saveFlight")
public class SaveFlightDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveFlightDetailsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FlightDAO dao= new FlightDAO();
		String airlinesName = request.getParameter("airlinesName");
		String flightNo = request.getParameter("flightNo");
		String sourceAirport = request.getParameter("sourceAirport");
		String destinationAirport = request.getParameter("destinationAirport");
		Date flyingDate =DateUtil.convertStringToDateYYYYMMDD( request.getParameter("flyingDate"));

		Double ticketprice = Double.parseDouble(request.getParameter("ticketprice"));
		int totalAvailableTkt =Integer.parseInt(request.getParameter("totalAvailableTkt"));


		Flight flightob=new Flight();
		flightob.setAirlinesName(airlinesName);
		flightob.setFlightNo(flightNo);
		flightob.setSourceAirport(sourceAirport);
		flightob.setDestinationAirport(destinationAirport);
		flightob.setFlyingDate(flyingDate);
		flightob.setTicketPrice(ticketprice);
		flightob.setTotalAvailableTkt(totalAvailableTkt);
		
		try {
			dao.saveFlight(flightob);
			PrintWriter pw = response.getWriter();
			pw.append("<html><body>");
			pw.append("Flight Details added successfully...");
			pw.append("</body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
