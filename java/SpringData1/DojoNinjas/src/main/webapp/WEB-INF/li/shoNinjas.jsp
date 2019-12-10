<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
	<!DOCTYPE html>
	<html>
		<head>
			<meta charset="ISO-8859-1">
			<title>All the songs </title>
			<link rel="stylesheet" type="text/css" href="css/style.css">
			<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		</head>
	<body>
		<a href="/">Home</a>
		
		
		  
		<h1>Ninja information</h1>
		<table class="table">
		    <thead>
		        <tr>
		            <th>First Name</th>
		            <th>Last Name</th>
		            <th>Age</th>
		        </tr>
		    </thead>
		    <tbody>
        		<c:forEach items="${dojo.ninjas}" var="ninja">
			        <tr>
			            <td><c:out value="${ninja.firstName}"/></td>
			            <td><c:out value="${ninja.lastName}"/></td>
			            <td><c:out value="${ninja.age}"/></td>
			        </tr>
        		</c:forEach>
    		</tbody>
		</table>
	

	</body>
</html>
	
	