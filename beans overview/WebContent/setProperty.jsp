<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set property</title>
</head>
<body>

	<jsp:useBean id="user" class="org.himanshu.beans.User" scope="session"></jsp:useBean>

	<%-- <jsp:setProperty property="firstName" name="user" value="Pratibha"/>
<jsp:setProperty property="lastName" name="user" value="Kandpal"/>

Your values have been set. --%>

	<form action="getProperty.jsp" method="post">
		First name: <input type="text" name="firstName" placeholder='<jsp:getProperty property="firstName" name="user"/>' required="required">
		<br>
		Last name: <input type="text" name="lastName" placeholder='<jsp:getProperty property="lastName" name="user"/>' required="required">
		<input type="submit" value="submit">
	</form>		

</body>
</html>