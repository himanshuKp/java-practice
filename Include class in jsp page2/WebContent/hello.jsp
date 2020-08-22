<%@page import="org.himanshu.UserDefined"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>include class</title>
</head>
<body>

<% out.print(new Date()); %>

<% out.print(new UserDefined().Demo()); %>

</body>
</html>