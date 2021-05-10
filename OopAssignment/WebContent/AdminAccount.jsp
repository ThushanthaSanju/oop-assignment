<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="ca" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: coral;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<table>
		<ca:forEach var="Admin" items="${AdminDetails}">





			<tr>
				<td>Administrator ID :</td>
				<td>${Admin.id}</td>
			</tr>
			<tr>
				<td>Administrator Name :</td>
				<td>${Admin.nameString}</td>
			</tr>


			<tr>
				<td>Administrator Username :</td>
				<td>${Admin.userNameString}</td>
			</tr>
			<tr>
				<td>Administrator Password :</td>
				<td>${Admin.passwordString}</td>
			</tr>




		</ca:forEach>

	</table>

</body>
</html>