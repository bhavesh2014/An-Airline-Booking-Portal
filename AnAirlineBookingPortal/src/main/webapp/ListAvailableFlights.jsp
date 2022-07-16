<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List"%>
<!DOCTYPE html>
<% List eList = (List)request.getAttribute("flightList");%>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {
  background-image: url("https://www.thebritishcollege.edu.np/images/news/16527682911623567608result-3249597_1920%20(1).jpg");
  background-repeat: no-repeat;
}
</style>
<title>Manage Flight</title>
</head>
<body>
 <h1>List Of Available Flights</h1>
 
 <form action="reserveFlight"  >
<hr size="4" color="gray"/>
<table border="1">
 <tr>
            <th>airlinesName </th>
            <th>flightNo  </th> 
            <th>Select Flight </th>  
        </tr>
     <c:forEach var="flight" items="${requestScope.flightList}">
                <tr>
                    <td><c:out value="${flight.airlinesName}"  /></td>
                    <td><c:out value="${flight.flightNo}" /></td>
                    <td><input type="checkbox" id="flightId" name="flightId" value="${flight.flightId}"></td>
                    <td style = "display:none" > <input type="hidden" id="totalAvailableTkt" name="totalAvailableTkt" value="${flight.totalAvailableTkt}"></td>
                    <td style = "display:none" > <input type="hidden" id="noOfpassanger" name="noOfpassanger" value="${requestScope.noOfpassanger}"></td>
                    
                </tr>
       </c:forEach>
   
</table> <br><br>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "submit" value= "Register Passenger Details"/>    
 </form>
</body>
</html>