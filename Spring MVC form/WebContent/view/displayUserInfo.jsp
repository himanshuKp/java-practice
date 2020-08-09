<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display user info</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>

Name: ${user.name}
<br>
Gender: ${user.gender}
<br>
Country: ${user.country}
<br>
Introduction: ${user.introduction}
<br>
Countries Visited: 
<br>
<ul>
	<c:forEach items="${user.visitedCountry}" var="iVisited">
		<li>
			${iVisited}
		</li>
	</c:forEach>
</ul>

</body>
</html>