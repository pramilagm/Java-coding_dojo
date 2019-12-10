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
		<a href="/persons/new">Create a new  Person</a>
		<a href="/license/new">Create a new License</a>
		
		
		  
		<h1>Person's Information</h1>
		<table class="table">
		    <thead>
		        <tr>
		            <th>First Name</th>
		            <th>Last Name</th>
		            <th>License</th>
		            <th>State</th>
		            <th>Expiration Date</th>
		        </tr>
		    </thead>
		    <tbody>
        		<c:forEach items="${persons}" var="person">
			        <tr>
			            <td><a href ="/person/${person.id}"><c:out value="${person.firstName}"/></a></td>
			            <td><c:out value="${person.lastName}"/></td>
			            <td><c:out value="${person.license.number}"/></td>
			            <td><c:out value="${person.license.state}"/></td>
			            <td><c:out value="${person.license.expirationDate}"/></td>
			        </tr>
        		</c:forEach>
    		</tbody>
		</table>
	

	</body>
</html>
	
	