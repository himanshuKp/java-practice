<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>

	<!-- scriptlet element -->
	<%
		int x = 25;
		out.println(x);
		
		if(x>30){
			out.println("X is greater than 30");
		}else {
			out.println("X is not greater than 30");
		}
		
	%>
	
	<%
		for(int i=0;i<10;i++){
			out.print(i);
			out.print("<br>");
		}
	%>

</body>
</html>