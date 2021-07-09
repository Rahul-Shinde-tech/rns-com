<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit Book</h1>
<form:form method="POST" action="/SpringMVCCRUDSimple/editsave">
	<table>
		<tr>
			<td></td>
			<td><form:hidden path="id" /></td>
		</tr>
		<tr>
			<td>Book Name :</td>
			<td><form:input path="bookname" /></td>
		</tr>
		<tr>
			<td>Book Price :</td>
			<td><form:input path="bookprice" /></td>
		</tr>
		<tr>
			<td>Book Publisher :</td>
			<td><form:input path="bookpublisher" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="Edit Save" /></td>
		</tr>
	</table>
</form:form>
