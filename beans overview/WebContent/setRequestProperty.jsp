<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>set request property</title>
</head>
<body>

	<jsp:useBean id="user" class="org.himanshu.beans.User" scope="request"></jsp:useBean>

	<jsp:setProperty property="firstName" name="user" value="Pratibha" />
	<jsp:setProperty property="lastName" name="user" value="Kandpal" />

	Your values have been set.

	<%
	
		request.getRequestDispatcher("getRequestProperty.jsp").forward(request, response);
	
	%>

</body>
</html>