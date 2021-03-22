<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login done</title>
</head>
<body>
<div align="center">
<% 
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");

if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}

%>
<h1>Login successfully done</h1>
<form action="GetEmail" method="get">
	<h1>${gmail}</h1>
	<input type="submit" value="getEmail">
</form>

<form action="logout">
	<input type="submit" value="logout">
</form>
</div>

</body>
</html>