<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventory</title>
</head>
<body>
	<h1>Inventory</h1>
	<p>Inventory of ${availability2.getColor()} Kayaks is: ${availability.getInventory()} 
	</p>You can receive ${availability.getAmount()} kayaks.
	
		
	</p>
	<a href="index.jsp">Home</a>
</body>
</html>