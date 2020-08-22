<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>For tokens</title>
</head>
<body>

<%
String URL = "www.google.com";
%>
<c:forTokens items="<%= URL %>" delims="." var="url">
${url} <br>
</c:forTokens>

</body>
</html>