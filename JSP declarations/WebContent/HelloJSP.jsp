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

<!-- purpose is to declare a element -->

<%! 
	
	String message(){
	return "I love jSP";
}

%>

<%= message() %>

</body>
</html>