<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {
  background-image: url("https://3dwarehouse.sketchup.com/warehouse/v1.0/publiccontent/d4c4749a-f683-420a-97aa-02b46940a171");
  background-repeat: no-repeat;
}
</style>
<title>Flight Search</title>
</head>
<body style="background-color:powderblue;">
 <h1>Search your flight here.</h1>
 
 <form action="SearchFlight" method="post">  

       <fieldset>
   <legend> Enter search Criteria</legend>
    <!--  User ID:<input type="text"  name="User_Id"/> <br/>-->
      
       Enter Your Origin:&nbsp;&nbsp;&nbsp;
		  		<select name="sourceAirport">
		            <c:forEach items="${masterPlaceList}" var="place"> 
		                  <option value="${place.airportName}">
		                       ${place.airportName}
		                </option>
		            </c:forEach> 
		        </select>     <br/><br/> 
        
 		Enter Your Destination:&nbsp;&nbsp;&nbsp;
		  		<select name="destinationAirport">
		            <c:forEach items="${masterPlaceList}" var="place"> 
		                  <option value="${place.airportName}">
		                       ${place.airportName}
		                </option>
		            </c:forEach> 
		        </select>     <br/><br/>  
	  Flying Date: <input type="date" name="flyingDate" id="flyingDate"  step="1"/><br/><br/>  
		        
      No Of Passengers:<input type="text" name="noOfpasnger" id=""noOfpasnger""/><br/><br/> <br/>


       <input type = "submit" value= "Search"/>
   </fieldset>
 </form>
 
</body>
</html>