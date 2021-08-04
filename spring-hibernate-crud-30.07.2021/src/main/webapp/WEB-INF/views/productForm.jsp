<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit Employee</h1>
		<form:form action="saveProduct" method="post" modelAttribute="product">
			<table>
				<tr>
					<td>Product ID:</td>
					<td><form:input path="productId" /></td>
				</tr>
				<tr>
					<td>Product Name:</td>
					<td><form:input path="productName" /></td>
				</tr>
				<tr>
					<td>Product Quantity</td>
					<td><form:input path="productQuantity" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>