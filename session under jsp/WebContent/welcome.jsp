<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

	<!-- handle session and cookie -->
	<%
		String username = null, sessionID = null;
			username = request.getSession().getAttribute("username").toString();
			sessionID = request.getSession().getId();
	
	%>

	Welcome, <%= username %>. <br>
	Your session id is: <%= sessionID %> <br>
	
	<!-- logout -->
	<form action="<%= request.getContextPath() %>/MemberAreaController" method="get">
		<input type="hidden" name="action" value="destroy" />
		<input type="submit" value="logout"/>
	</form>

</body>
</html>