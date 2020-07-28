<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>

	<h1>Hello JSP</h1>

<!-- declaration element -->
	<%! public int x = 22; %>

<!--  expression element -->
	<%= x %>
	
	<!-- deprecated since java 9 -->
	<%= new Integer(234) %>
	
	<%= new String("Himanshu") %>
	
	<%= new Date() %>
	
	<%= 24*5 %>
	
	<%= 25>5 %>

</body>
</html>