<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users Management Portal | Home</title>
</head>
<body>
	<center>
		<br> <br> <br> <br> <br> <br> <br>
		<h2 style="font-weight: lighter;">
			<i>Welcome to Users Management Portal</i>
		</h2>
		<br>
		<table>
			<tr>
				<td><a href="admin/login">Login</a></td>
			</tr>
			<tr>
				<td><a href="admin/user">Add New User</a></td>
			</tr>
			<tr>
				<td><a href="admin/search">Search Users</a></td>
			</tr>
			<tr>
				<td><a href="admin/changePassword">Change Password</a></td>
			</tr>
			<tr>
				<td><a href="admin/login_failures">Failed Login Attempts</a></td>
			</tr>
		</table>
	</center>
</body>
</html>