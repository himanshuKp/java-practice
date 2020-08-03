<%@page import="java.util.Date"%>
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

<br>
<c:set var="date" value="<%= new Date() %>"></c:set>
Date and Time: <c:out value="${date}"></c:out>
<br>
Time: <fmt:formatDate type="time" value="${date}"/>
<br>
Date: <fmt:formatDate type="date" value="${date}"/>
<br>
Date and time: <fmt:formatDate type="both" value="${date}"/>
<br>
Date and time (timezone): <fmt:formatDate type="both" value="${date}" timeZone="GMT -1"/>
<br>
<c:set var="somenumber" value="654321.123456"/>
Some number: <c:out value="${somenumber}"></c:out>
<br>
Max integer digits: <fmt:formatNumber type="number" maxIntegerDigits="3" value="${somenumber}"/>
<br>
Max fraction digits: <fmt:formatNumber type="number" maxFractionDigits="3" value="${somenumber}"/>
<br>
Currency: <fmt:formatNumber value="${somenumber}" type="currency"/>
<br>
<fmt:setLocale value="ru_RU"/>
Currency russian: <fmt:formatNumber value="${somenumber}" type="currency"/>


</body>
</html>