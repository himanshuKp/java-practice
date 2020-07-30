<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<body>

	NAME: <%= request.getParameter("name") %> <br>
	GENDER: <%= request.getParameter("gender") %> <br>
	LANGUAGE: 
	<%
	
	String[] languages = request.getParameterValues("language");
	
	if(languages!=null){
		for(int i=0;i<languages.length;i++){
			out.print("<br>");
			out.print(languages[i]);
		}
	}else {
		out.print("No know language");
	}
		
	%> <br>
	COUNTRY: <%= request.getParameter("country") %>

</body>
</html>