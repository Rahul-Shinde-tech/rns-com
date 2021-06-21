<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyStore: Add Products Page</title>
<style>
<%@include file ="css/style.css"%>
#myaddform table tr td input {
	font-size: 15px;
}
</style>
</head>
<body>
	<div class="myadddiv">
		<h3>MyStore Web: Add Product</h3>

	</div>
	<br>
	<div class="addcontainer">
		<form action="addproducts" id="myaddform" method="post">
			<table>
				<tr>
					<td>Enter the details of the Product :</td>
				</tr>
				
				<tr>
					<td>Enter the Name of the Product:</td>
					<td><input type="text" name="product_name"
						placeholder="Enter here details"></td>
				</tr>
				<tr>
					<td>Enter the Available Product Stock :</td>
					<td><input type="text" name="product_stock"
						placeholder="Enter here details"></td>
				</tr>
				<tr>
					<td>Enter the Product Price:</td>
					<td><input type="text" name="product_price"
						placeholder="Enter here details"></td>
				</tr>
				<tr>
					<td><button type="submit">ADD PRODUCT</button></td>
					<td><button type="reset">CLEAR CONTENT</button></td>
				</tr>
			</table>
		</form>

	</div>
</body>
</html>