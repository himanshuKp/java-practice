<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jstl demo</title>
</head>
<body>

<c:set var="name" value="himanshu"></c:set>

<c:out value="${name}"></c:out> <br>
<c:out value="name"></c:out> <br>
<c:remove var="name"/>
<br>
${name}
<br>
<!-- read and output by reading var from url -->
${param.msg}

</body>
</html>