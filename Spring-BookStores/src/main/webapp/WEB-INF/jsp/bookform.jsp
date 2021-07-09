<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Add New Book</h1>
<form:form method="post" action="save">
	<table>
		<tr>
			<td>Book Name :</td>
			<td><form:input path="bookName" /></td>
		</tr>
		<tr>
			<td>Book Price :</td>
			<td><form:input path="bookPrice" /></td>
		</tr>
		<tr>
			<td>Book Publisher :</td>
			<td><form:input path="bookPublisher" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Save" /></td>
		</tr>
	</table>
</form:form>
