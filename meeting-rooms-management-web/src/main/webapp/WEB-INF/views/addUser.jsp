<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="/WEB-INF/includes/header.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table {
	border-style: solid;
	border-width: 5px;
}

td {
	padding: 5px;
}

div {
	color: #D8000C;
	background-color: #FFBABA;
	width: 400px;
	margin: 10px 0px;
	padding: 12px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<center>
		<br> <br> <br> <br>
		<h2>
			<i>Add User</i>
		</h2>
		<c:if test="${error ne null}">
			<div>${error}</div>
		</c:if>
		<br>
		<form action="addUser" method="post">
			<table>
				<tr>
					<td>Username:</td>
					<td><input type="text" name="username"
						value="${user.username}" pattern=".{6,30}" required
						title="6 to 30 characters" /></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="firstName"
						value="${user.firstName}" pattern=".{2,30}" required
						title="2 to 30 characters" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lastName"
						value="${user.lastName}" pattern=".{2,30}" required
						title="2 to 30 characters" /></td>
				</tr>
				<tr>
					<td>Title:</td>
					<td><input type="text" name="title"
						value="${user.title}" pattern=".{2,30}" required
						title="2 to 30 characters" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"
						value="${user.password}" pattern=".{8,30}" required
						title="8 to 30 characters" /></td>
				</tr>
				<tr>
					<td>Role:</td>
					<td><select name="role" value="${user.role}" required>
							<option>System Admin</option>
							<option>Normal User</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Add User" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>