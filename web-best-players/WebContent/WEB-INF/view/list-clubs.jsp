<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
<title>List of Clubs</title>

<link   type="text/css" 
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>List of Clubs</h2>
		</div>
	</div>
	<div id="container">

		<div id="content">
		<input type="button" value="Add Club"
				onclick="window.location.href='formForAdd'; return false;"
				class="add-button" />
			<table>
				<tr>
					<th>Id</th>
					<th>Clubs Name</th>
					<th>Best Player</th>
					<th>Value</th>
					<th>Action</th>
				</tr>

				<c:forEach var="club" items="${theClubs}">

					<c:url var="updateLink" value="/clubs/update">
						<c:param name="clubsId" value="${club.id}" />
					</c:url>

					<c:url var="deleteLink" value="/clubs/delete">
						<c:param name="clubsId" value="${club.id}" />
					</c:url>

					<tr>
						<td>${club.id}</td>
						<td>${club.name}</td>
						<td>${club.bestPlayer}</td>
						<td>${club.value}</td>
						<td>
							  <a href="${updateLink}">Update</a>
							| <a href="${deleteLink}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>




</html>