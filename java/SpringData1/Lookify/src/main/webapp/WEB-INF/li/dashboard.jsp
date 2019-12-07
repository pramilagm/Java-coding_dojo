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
		<a href="/dashboard/new">Add new</a>
		<a href="/dashboard/song/top10">Top songs</a>
		
		<form action="/dashboard/search" method="post">
		    <input type="text" name="search">
		    <input type="submit" value="search Artist">
		</form>
		  
		<h1>All Songs</h1>
		<table class="table">
		    <thead>
		        <tr>
		            <th>Name</th>
		            <th>Artist</th>
		            <th>Rating</th>
		            <th>Action</th>
		        </tr>
		    </thead>
		    <tbody>
        		<c:forEach items="${songs}" var="song">
			        <tr>
			            <td><a href ="/dashboard/${song.id}"><c:out value="${song.title}"/></a></td>
			            <td><c:out value="${song.artist}"/></td>
			            <td><c:out value="${song.rating}"/></td>
			            <td><a href= "dashboard/${song.id}/delete">Delete</a></td>
			        </tr>
        		</c:forEach>
    		</tbody>
		</table>
	

	</body>
</html>