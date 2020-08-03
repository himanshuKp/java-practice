<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
View website in
<a href="?locale=en_US">English(US)</a>
<a href="?locale=es_AR">Spanish</a>
<a href="?locale=ru_RU">Russian</a>
<a href="?locale=hi_IN">Hindi</a>
<br>
<hr>

<fmt:setLocale value="${param.locale}"/>
<fmt:bundle basename="com.himanshu.i18n/welcome">
<p><fmt:message key="label.hello" /> John</p> 
<p><fmt:message key="label.welcome" /></p>
<p><fmt:message key="label.message" /></p>
<p><fmt:message key="label.thanks" /></p>
</fmt:bundle>
<br>
Locale: ${param.locale}

</body>
</html>