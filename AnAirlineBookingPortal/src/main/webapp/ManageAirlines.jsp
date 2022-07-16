<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Airlines</title>
</head>
<body>
  <h1>This page is to manage Airlines Master Data by the Admin</h1>
  
  
   
   <form action="sucessfulinsertionairlines" method="post">

   <legend> New Place </legend>
    <!--  User ID:<input type="text"  name="User_Id"/> <br/>-->
      Enter New Airlines Name:<input type="text" name="airlinesname" id="airlinesname"/><br/><br/>  
         <input type = "submit" value= "Save"/>
 </form>
</body>
</html>