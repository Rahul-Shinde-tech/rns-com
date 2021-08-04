<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Display page</title>
</head>
<body>
	<form action="hm" >
	<h1>Inside the display Page</h1>
	<%
		String name = (String) request.getAttribute("name");	
	%>
	<h2>My Name Is: <%=name %></h2>
	<button name="SUBMIT" type="button"/>
	</form>
</body>
</html>