<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

It's main page.

<a href="<%= request.getContextPath() %>/Controller?page=login">Login</a><br/>
<a href="<%= request.getContextPath() %>/Controller?page=signup">Sign up</a><br/>
<a href="<%= request.getContextPath() %>/Controller?page=about">About</a>

</body>
</html>