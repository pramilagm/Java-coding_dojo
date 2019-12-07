<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
	<!DOCTYPE html>
	<html>
		<head>
			<meta charset="ISO-8859-1">
			<title>Insert title here</title>
			<link rel="stylesheet" type="text/css" href="css/style.css">
			<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		</head>
	<body>
		  
		<h1>All Languages</h1>
		<table class="table">
		    <thead>
		        <tr>
		            <th>Name</th>
		            <th>Creator</th>
		            <th>Version</th>
		            <th>Action</th>
		        </tr>
		    </thead>
		    <tbody>
        		<c:forEach items="${languages}" var="language">
			        <tr>
			            <td><a href ="/languages/${language.id}"><c:out value="${language.name}"/></a></td>
			            <td><c:out value="${language.creator}"/></td>
			            <td><c:out value="${language.version}"/></td>
			            <td><a href= "languages/${language.id}/delete">Delete</a>||<a href ="languages/${language.id}/edit">Edit</a></td>
			        </tr>
        		</c:forEach>
    		</tbody>
		</table>
	<a href="/languages/new">New Book</a>

	</body>
</html>