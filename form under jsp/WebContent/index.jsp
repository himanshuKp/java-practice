<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>basic form</title>
</head>
<body>

	<form action="<%= request.getContextPath() %>/Controller" method="post">

		Full name: 
		<input type="text" name="name" required="required"/><br> 
		Gender: 
		<input type="radio" name="gender" value="male" checked="checked"> Male 
		<input type="radio" name="gender" value="female"> Female <br>
		Language: 
		<input type="checkbox" name="language" value="english"> English 
		<input type="checkbox" name="language" value="french"> French 
		<input type="checkbox" name="language" value="hindi"> Hindi <br> 
		Country: 
		<select name="country">
			<option value="india">India</option>
			<option value="usa">USA</option>
			<option value="uk">UK</option>
			<option value="finland">Finland</option>
			<option value="fiji">Fiji</option>
		</select>
		
		<input type="submit" value="submit">

	</form>

</body>
</html>