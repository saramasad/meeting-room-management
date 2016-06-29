<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@include file="/WEB-INF/includes/header.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
	border-collapse: collapse;
}

th, td {
	padding: 15px;
}

table#t01 tr:nth-child(even) {
	background-color: #eee;
}

table#t01 tr:nth-child(odd) {
	background-color: #fff;
}

table#t01 th {
	background-color: #A9A9A9;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Users</title>
</head>
<body>
	<center>
		<br> <br> <br> <br>
		<h2>
			<i>List Users</i>
		</h2>
		<br>
		<c:if test="${fn:length(users) eq 0 }">
					No users found.
		</c:if>
		<c:if test="${fn:length(users) ne 0 }">
			<table id="t01" border="1">
				<thead>
					<tr>
						<th>Username</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Title</th>
						<th>Role</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users}" var="user">
						<tr>
							<td>${user.username}</td>
							<td>${user.firstName}</td>
							<td>${user.lastName}</td>
							<td>${user.title}</td>
							<td>${user.role}</td>
							<td><form action="deleteUser?username=${user.username}"
									method="post">
									<input type="submit" value="Delete">
								</form>
								<form action="updateUser"
									method="get">
									<input type="hidden" name="username" value="${user.username}" />
									<input type="submit" value="Update">
								</form></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</center>
</body>
</html>