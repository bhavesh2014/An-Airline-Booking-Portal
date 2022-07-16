<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<h1> Confirm your details...</h1>
</head>
<body>
<form action="reserveFlight" method="post">
        Flight No:&nbsp;&nbsp;&nbsp;<input type="text" name="flightNo" id="flightNo" value="${requestScope.flightSelected.flightNo}" disabled="disabled"/><br/><br/> 
        Source:&nbsp;&nbsp;&nbsp;<input type="text" name="sourceAirport" id="sourceAirport" value="${requestScope.flightSelected.sourceAirport}" disabled="disabled"/><br/><br/>        
        destinationAirport:&nbsp;&nbsp;&nbsp;<input type="text" name="destinationAirport" id="destinationAirport" value="${requestScope.flightSelected.destinationAirport}" disabled="disabled"/><br/><br/>        
        Flying Date:&nbsp;&nbsp;&nbsp;<input type="text" name="flyingDate" id="flyingDate" value="${requestScope.flightSelected.flyingDate}" disabled="disabled"/><br/><br/>        
         Total Available Tickets:&nbsp;&nbsp;&nbsp;<input type="text" name="totalAvailableTkt" id="totalAvailableTkt" value="${requestScope.flightSelected.totalAvailableTkt}" disabled="disabled"/><br/><br/>        
         Ticket Price:&nbsp;&nbsp;&nbsp;<input type="text" name="ticketPrice" id="ticketPrice" value="${requestScope.flightSelected.ticketPrice}" disabled="disabled"/><br/><br/>        
 
  <input type="hidden" id="totalAvailableTkt" name="totalAvailableTkt" value="${requestScope.totalAvailableTkt}"> 
  <input type="hidden" id="noOfpassanger" name="noOfpassanger" value="${requestScope.noOfpassanger}"> 
  <input type="hidden" id="flightId" name="flightId" value="${requestScope.flightId}"> 
   &nbsp;&nbsp;&nbsp;<input type = "submit" value= "Confirm"/>
 </form>
</body>
</html>