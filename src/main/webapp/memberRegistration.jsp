<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<a href="login.jsp">Login</a>

<div align="center">
<form action="Register" method="post">
<table>
<tr><td>User Name: </td><td><input type="text" name="uname"></td></tr>
<tr><td>Password: </td><td><input type="password" name="password"></td></tr>
<tr><td>Email: </td><td><input type="text" name="email"></td></tr>
<tr><td></td><td><input type="submit" value="register"></td></tr>
</table>
</form>
</div>

</body>
</html>