<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get request property</title>
</head>
<body>

	<jsp:useBean id="user" class="org.himanshu.beans.User" scope="request"></jsp:useBean>

	<jsp:getProperty property="firstName" name="user" />
	<br>
	<jsp:getProperty property="lastName" name="user" />

</body>
</html>