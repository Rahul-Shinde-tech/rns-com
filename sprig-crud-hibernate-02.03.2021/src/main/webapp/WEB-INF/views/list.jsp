<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Cars</title>
</head>
<body>
	<div align="center">
		<h2>
			<b>LISTS OF CAR DETAILS</b>
		</h2>
		<table border="1">
			<tr>
				<th>CAR ID</th>
				<th>CAR NAME</th>
				<th>CAR COLOR</th>
				<th>CAR PRICE</th>
				<th>CAR QUANTITY</th>
			<tr>
				<c:forEach var="car" items="${listofcars}">
					<tr>
						<td>${car.carId}</td>
						<td>${car.carName}</td>
						<td>${car.carColor}</td>
						<td>${car.carPrice}</td>
						<td>${car.carQuantity}</td>
						<td><a href="editCar?carId=${car.carId}">Edit</a> <a
							href="deleteCar?carId=${car.carId}">delete</a></td>
					</tr>
			</tr>
			</c:forEach>
			</tr>
			</tr>
		</table>


	</div>

</body>
</html>