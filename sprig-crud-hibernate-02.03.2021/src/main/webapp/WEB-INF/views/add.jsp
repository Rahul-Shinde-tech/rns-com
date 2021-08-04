<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Car Details</title>
</head>
<body>
	<div align="center">
		<h2 align="center">
			<b>ADD CAR DETAILS </b>
		</h2>
		<form:form action="save" modelAttribute="car" method="post">
			<table align="center" cellpadding="1" border="1">
				<tr>
					<td><b>CAR NO</b></td>
					<td><form:input path="carId" /></td>
				</tr>
				<tr>
					<td><b>CAR NAME</b></td>
					<td><form:input path="carName" /></td>
				</tr>
				<tr>
					<td><b>CAR COLOR</b></td>
					<td><form:input path="carColor" /></td>
				</tr>
				<tr>
					<td><b>CAR PRICE</b></td>
					<td><form:input path="carPrice" /></td>
				</tr>
				<tr>
					<td><b>CAR QUANTITY</b></td>
					<td><form:input path="carQuantity" /></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit" value="save" /></td>
					
				</tr>
			</table>


		</form:form>
	</div>
</body>
</html>