<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>

<form:form action="displayUserInfo" modelAttribute="user">
	Name: <form:input path="name"/>
	<p/>
	Gender: <form:radiobuttons path="gender" items="${genders}"/>
	<p/>		
	Country: <form:select path="country" items="${countryName}"/>
	<p/>
	Introduction: <form:textarea path="introduction" />
	<p/>
	Country Visited:
	<p/> 
	China: <form:checkbox path="visitedCountry" value="China"/>
	India: <form:checkbox path="visitedCountry" value="India"/>
	USA: <form:checkbox path="visitedCountry" value="USA"/>
	Britain: <form:checkbox path="visitedCountry" value="Britain"/>
	<p />
	<input type="submit" value="submit">
</form:form>

</body>
</html>