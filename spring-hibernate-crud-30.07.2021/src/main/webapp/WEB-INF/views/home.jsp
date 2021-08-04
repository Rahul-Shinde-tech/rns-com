<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Screen</title>
</head>
<body>
	<div align="center">
		<h1>Product List</h1>
		<h3><a href="newProduct">NEW Product</a></h3>
		<table border="1">
		<th>Product ID</th>
		<th>Product Name</th>
		<th>Product Quantity</th>
		<c:forEach var="product" items="${prodList}">
			<tr>
			<td>${product.productId}</td>
			<td>${product.productName}</td>		
			<td>${product.productQuantity}</td>
			<td><a href="editProduct?productId=${product.productId}">Edit</a>
			<a href="deleteProduct?productId=${product.productId}">delete</a></td>			
			</tr>
			
		 </c:forEach>
		</table>
	</div>
</body>
</html>