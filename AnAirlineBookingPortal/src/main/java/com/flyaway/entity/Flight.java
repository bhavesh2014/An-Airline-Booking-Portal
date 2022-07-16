package com.flyaway.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Flight")
public class Flight {

	@Id@
	Column(name = "Flight_Id" ,nullable = false)
	@GeneratedValue
	private int flightId;
	
	@Column(name = "Airlines_Name")
	private String airlinesName;
	
	@Column(name = "Flight_No")
	private String flightNo;
	
	@Column(name = "Source_Airport")
	private String sourceAirport;
	
	@Column(name = "Destination_Airport")
	private String destinationAirport;	
	
	@Column(name = "Flying_Date")
	private Date  flyingDate;
	
	@Column(name = "Total_Available_Tkts")
	private int  totalAvailableTkt;
	
	@Column(name = "Ticket_Price")
	private double ticketPrice;

	@Transient
	private double noOfpassangerBooking;



	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlinesName=" + airlinesName + ", flightNo=" + flightNo
				+ ", sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport + ", flyingDate="
				+ flyingDate + ", totalAvailableTkt=" + totalAvailableTkt + ", ticketPrice=" + ticketPrice
				+ ", getFlightId()=" + getFlightId() + ", getAirlinesName()=" + getAirlinesName() + ", getFlightNo()="
				+ getFlightNo() + ", getSourceAirport()=" + getSourceAirport() + ", getDestinationAirport()="
				+ getDestinationAirport() + ", getFlyingDate()=" + getFlyingDate() + ", getTotalAvailableTkt()="
				+ getTotalAvailableTkt() + ", getTicketPrice()=" + getTicketPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public double getNoOfpassangerBooking() {
		return noOfpassangerBooking;
	}

	public void setNoOfpassangerBooking(double noOfpassangerBooking) {
		this.noOfpassangerBooking = noOfpassangerBooking;
	}


	public int getFlightId() {
		return flightId;
	}




	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}




	public String getAirlinesName() {
		return airlinesName;
	}




	public void setAirlinesName(String airlinesName) {
		this.airlinesName = airlinesName;
	}




	public String getFlightNo() {
		return flightNo;
	}




	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}




	public String getSourceAirport() {
		return sourceAirport;
	}




	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}




	public String getDestinationAirport() {
		return destinationAirport;
	}




	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}




	public Date getFlyingDate() {
		return flyingDate;
	}




	public void setFlyingDate(Date flyingDate) {
		this.flyingDate = flyingDate;
	}




	public int getTotalAvailableTkt() {
		return totalAvailableTkt;
	}




	public void setTotalAvailableTkt(int totalAvailableTkt) {
		this.totalAvailableTkt = totalAvailableTkt;
	}




	public double getTicketPrice() {
		return ticketPrice;
	}




	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}




	public Flight() {
		super();
	}

	

	
    
   
}
