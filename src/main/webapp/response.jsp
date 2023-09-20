<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Total Kayak Quote</title>
</head>
<body>
	<h1>Quote</h1>
	<p>Purchase of ${buyKayaks.getAmount()} New Kayaks
	</p>
	<p>SubTotal - $<fmt:formatNumber type="number" minFractionDigits="2" value="${buyKayaks.getOutPrice()}" /> 
	</p>
	<p>Iowa SalesTax - 0.06
	</p>
	<p>Total - $<fmt:formatNumber type="number" minFractionDigits="2" value="${buyKayaks.getOutTotal()}" /> 

	
		
	</p>
	<a href="index.jsp">Home</a>
</body>
</html>