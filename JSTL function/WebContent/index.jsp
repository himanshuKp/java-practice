<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Function</title>
</head>
<body>

${fn:length("google.com")}

<br>

<!-- reading length of an array -->
<%
	String[] names = {"Hello", "Spring", "World"};
%>
<c:set var="namesArray" value="<%= names %>" />

Array length : ${fn:length(namesArray)}

<br>

<c:set var="we" value="studyeasy.org" />
${fn:startsWith(we,"s")}

<br>

<c:set var="string" value="${fn:split('www.google.com','.')}"></c:set>
<c:forEach var="element" items="${string}">
	${element} <br>
</c:forEach>
<br>
Join split elements : ${fn:join(string,'.')}

</body>
</html>