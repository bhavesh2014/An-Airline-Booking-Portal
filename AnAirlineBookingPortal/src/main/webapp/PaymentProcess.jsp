<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<h1> Check your Details</h1>
</head>
<body>
<form action="reserveFlight">
       
 
  <input type="hidden" id="totalAvailableTkt" name="totalAvailableTkt" value="${requestScope.totalAvailableTkt}"> 
  <input type="hidden" id="noOfpassanger" name="noOfpassanger" value="${requestScope.noOfpassanger}"> 
  <input type="hidden" id="flightId" name="flightId" value="${requestScope.flightId}"> 
   &nbsp;&nbsp;&nbsp;<input type = "submit" value= ""/>
 </form>
</body>
</html>