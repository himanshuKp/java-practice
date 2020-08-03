<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<c:import url="/Users.xml" var="XMLfile" />
	<x:parse xml="${XMLfile}" var="XMLdoc" />
	<table border="1">

		<thead>
			<tr>
				<td>Name</td>
				<td>Gender</td>
				<td>Age</td>
			</tr>
		</thead>
		<tbody>
			<x:forEach select="$XMLdoc/users/user">
				<x:if select="age > 27">
					<tr>
						<td><x:out select="name" /></td>
						<td><x:out select="gender" /></td>
						<td><x:out select="age" /></td>
					</tr>
				</x:if>
			</x:forEach>
		</tbody>

	</table>
</body>
</html>