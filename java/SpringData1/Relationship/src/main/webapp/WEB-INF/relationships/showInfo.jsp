<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true" %>    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
	<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1><a href="/">Dashboard</a></h1>
		
	<h1><c:out value="${person.firstName}${person.lastName }"/></h1>
		<p>Description: <c:out value="${person.license.number}"/></p>
		<p>Language: <c:out value="${person.license.state}"/></p>
		<p>Number of pages: <c:out value="${person.license.expirationDate}"/></p>

	</body>
</html>