<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display name</title>
</head>
<body>
Hello ${firstname}
<br>
Date: ${date}
<br>
Team list:
<br>
<c:forEach var="teamMember" items="${team}">
${teamMember} 
<br>
</c:forEach>
</body>
</html>