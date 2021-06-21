<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,com.entities.*,org.hibernate.*,org.hibernate.cfg.*"%>
<%! int productId;String productName; int productStock;int productPrice; Session session1 = null; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyStore: List of Products</title>
</head>
<body>
	<c:if test="${!empty Product}">
		<h2>List Product</h2>
		<table align="left" border="1">
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Product Stock</th>
				<th>Product Price</th>
			</tr>

<%  
			Configuration cf=new Configuration();  
			cf.configure();  
			SessionFactory sf = cf.buildSessionFactory();  
			session1 =sf.openSession();  
			//Using from Clause  
			String SQL_QUERY ="from Product";  
			Query query = session1.createQuery(SQL_QUERY);  
			Iterator iterator=query.iterate();  
			while(iterator.hasNext())  
			{  
				Product product=(Product)iterator.next();  
				productId=product.getProductId();  
				productName=product.getProductName();
				productStock =product.getProductStock();
				productPrice = product.getPrice();
%>
			<tr>
				<td><%=productId%></td>
				<td><%=productName%></td>
				<td><%=productStock%></td>
				<td><%=productPrice%></td>
			</tr>
<%  
}  
session1.close();  
%>
		</table>
	</c:if>
</body>
</html>