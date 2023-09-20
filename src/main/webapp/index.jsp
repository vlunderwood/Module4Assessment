<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Kayak Sales</h1>
	
	New Kayak Price $230.00 <br>

	
	<br>
	<br>
	
	<form action="getKayakPrice" method="post">
		Enter how many kayaks would you like to buy? <input
			type="text" name="userBuyNumber" size="25"> 
		<input type ="submit" value="Kayak Price Quote"/>	
	</form>
	<br>
	<br>
	<form action="getKayakInventory" method="post">
		Check availability of Kayaks. <br>
		Enter Amount of Kayaks you want to buy: <input
			type="text" name="userNumber" size="25"> <br>
		Enter # for Color. 1 = Blue, 2 = Red, & 3 = Green
			<input
			type="text" name="userColor" size="25"> 
		<input type ="submit" value="Kayak Availability"/>	
	</form>
</body>
</html>