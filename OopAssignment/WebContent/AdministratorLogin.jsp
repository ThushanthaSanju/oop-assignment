<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">
	<title>Administrator Login</title>
</head>

<body>
	<form action="loginadmin" method="post">
		Username of the administrator<input type = "text" name="username" placeholder="Enter Username"><br>
		Password of the administrator<input type = "password" name="password" placeholder="Enter Password"><br>
		
		<input type="submit" name="submit" value="Login">
	</form>
</body>

</html>