<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Flight</title>
</head>
<body>
 <h1>This page is to manage Flights Master Data by the Admin.</h1>
 
 <form action="saveFlight" method="post">
 
 
 Airlines id :&nbsp;&nbsp;&nbsp; 
  <select name="airlinesName">
            <c:forEach items="${airlinesList}" var="airline"> 
                  <option value="${airline.airlinesName}">
                       ${airline.airlinesName}
                </option>
            </c:forEach> 
        </select>      
        <br/><br/>
Flight No:&nbsp;&nbsp;&nbsp;<input type="text" name="flightNo" id="flightNo"/><br/><br/>
Source Airport:&nbsp;&nbsp;&nbsp;
		  		<select name="sourceAirport">
		            <c:forEach items="${masterPlaceList}" var="place"> 
		                  <option value="${place.airportName}">
		                       ${place.airportName}
		                </option>
		            </c:forEach> 
		        </select>     <br/><br/> 
        
Destination Airport:&nbsp;&nbsp;&nbsp;
		  		<select name="destinationAirport">
		            <c:forEach items="${masterPlaceList}" var="place"> 
		                  <option value="${place.airportName}">
		                       ${place.airportName}
		                </option>
		            </c:forEach> 
		        </select>     <br/><br/>         
                
        
 <br>Flying Date: <input type="date" name="flyingDate" id="flyingDate"  step="1"/><br/><br/>  
  
 Ticket Price:<input type="text" name="ticketprice" id="ticketprice"/><br/><br/>  
 Available Tickets :<input type="text" name="totalAvailableTkt" id="totalAvailableTkt"/><br/><br/>
         
&nbsp;&nbsp;&nbsp;<input type = "submit" value= "Save"/>
 </form>
</body>
</html>