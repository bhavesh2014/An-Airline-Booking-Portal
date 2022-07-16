<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<h1> Enter Passanger Details</h1>
</head>
<body>
<form action="confirmReservation" method="post">
 First Name:<input type="text" name="name" id="name"/><br/><br/>  
 Last Name :<input type="text" name="adharnum" id="adharnum"/><br/><br/>
 Date Of Birth : <input type="date" name="flyingDate" id="flyingDate"  step="1"/><br/><br/>  
		 <label for="gender">Gender:</label>
			<select name="gender" id="gender">
			  <option value="Male">Male</option>
			  <option value="Female">Female</option>
			</select><br/><br/>
 Adhar Number :<input type="text" name="adharnum" id="adharnum" /><br/><br/>
 Email Id :<input type="text" name="email" id="email"/><br/><br/>
 Phone Number :<input type="text" name="phone" id="phone"/><br/><br/>
 Address :<textarea name="address" id="address"/></textarea><br/><br/>
 
  <input type="hidden" id="totalAvailableTkt" name="totalAvailableTkt" value="${requestScope.totalAvailableTkt}"> 
  <input type="hidden" id="noOfpassanger" name="noOfpassanger" value="${requestScope.noOfpassanger}"> 
  <input type="hidden" id="flightId" name="flightId" value="${requestScope.flightId}"> 
    
                    &nbsp;&nbsp;&nbsp;<input type = "submit" value= "Book Ticket"/>
 </form>
</body>
</html>