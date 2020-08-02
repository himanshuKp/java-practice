<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Expression</title>
</head>
<body>

<jsp:useBean id="user" class="org.himanshu.beans.User"></jsp:useBean>

First name from bean: <c:out value="${user.firstName}"></c:out>
<br>
Last name from bean: ${user.getLastName()}
<br>
first name without c:out tag : ${user.firstName}

</body>
</html>