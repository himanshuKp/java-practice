<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL foreach</title>
</head>
<body>

<c:forEach var="i" begin="0" end="30" step="3">
${i} <br>
</c:forEach>

<!-- scriptlet containing an array of names -->
<%
	String[] names = {"Himanshu","Pari","Kandpal"};
%>
<c:forEach items="<%= names %>" var="name">
	${name}
	<br>
</c:forEach>

</body>
</html>