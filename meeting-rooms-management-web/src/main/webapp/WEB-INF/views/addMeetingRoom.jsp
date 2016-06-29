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
<title>Add Meeting Room</title>
</head>
<body>
	<center>
		<br> <br> <br> <br>
		<h2>
			<i>Add Meeting Room</i>
		</h2>
		<c:if test="${error ne null}">
			<div>${error}</div>
		</c:if>
		<br>
		<form action="addMeetingRoom" method="post">
			<table>
				<tr>
					<td>Room name:</td>
					<td><input type="text" name="roomName" /></td>
				</tr>
				<tr>
					<td>Location:</td>
					<td><textarea rows="4" cols="50" name="location"></textarea></td>
				</tr>
				<tr>
					<td>Capacity:</td>
					<td><input type="text" name="capacity" /></td>
				</tr>
				<tr>
					<td>Equipment:</td>
					<td><textarea rows="4" cols="50" name="equipment"></textarea></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Add Room" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>