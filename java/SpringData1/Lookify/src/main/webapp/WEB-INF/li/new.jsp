<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isErrorPage="true" %>     
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add a new song</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	</head>
	<body>
		<a href ="/dashboard">Dashboard</a>
	
		<h1>New Song</h1>
		<form:form action="/dashboard/new" method="post" modelAttribute="song">
		<p>
		     <form:label path="title">Name</form:label>
		     <form:errors path="title"/>
		     <form:input path="title"/>
		 </p>
		 <p>
	        <form:label path="artist">Artist</form:label>
	        <form:errors path="artist"/>
	        <form:textarea path="artist"/>
    	</p>
    	<p>
	        <form:label path="rating">Rating</form:label>
	        <form:errors path="rating"/>
	        <form:input path="rating"/>
   		</p>
    	
    	<input type="submit" value="Submit" />
		</form:form>   

	</body>
</html>