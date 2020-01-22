<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Adding Club</title>
</head>

<body>
	<div id="container">
		<form:form action="addClub" modelAttribute="club" method="POST">
		
		<!-- need to associate this data with club id -->
		<form:hidden path="id"/>
			<table>
				<tbody>
				<tr>
						<td><label>Id:</label></td>
						<td><form:input path="id" /></td>
					</tr>
	
					<tr>
						<td><label>Name:</label></td>
						<td><form:input path="name" /></td>
					</tr>

					<tr>
						<td><label>BestPlayer:</label></td>
						<td><form:input path="bestPlayer" /></td>
					</tr>
					<tr>
						<td><label>Value:</label></td>
						<td><form:input path="value" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>				
				</tbody>
			</table>
				
		</form:form>	
		<p>
			<a href="${pageContext.request.contextPath}/clubs/show">Back to List</a>
		</p>
		</div>
	



</body>




</html>