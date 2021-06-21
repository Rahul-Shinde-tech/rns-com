<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyStore : Home Page</title>
<style>
<%@include file="css/style.css"%>
#myform table tr td input {
	font-size: 20px; }
</style>
</head>
<body>
	<div class="mydiv">
		<h2>MyStore Web</h2>
		
	</div>
	<div class="container">
		<form action="AddWorker" id="myform" method="post">
			<table>
				<tr>
					<td>Add Products into List:</td>
					<td><a href="addproducts.jsp">Click here for add Products into list</a></td>
				</tr>
				<tr>
					<td>Check the List of Products:</td>
					<td><a href="listproducts.jsp">Click here for list of Products</a></td>
				</tr>
				
			</table>
		</form>

	</div>
</body>
</html>