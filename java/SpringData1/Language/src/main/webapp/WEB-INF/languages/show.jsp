<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isErrorPage="true" %> 
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
</head>
<body>
	
		<h1>Name :<c:out value="${language.name}"/></h1>
		<p>Creator: <c:out value="${language.creator}"/></p>
		<p>Version: <c:out value="${language.version}"/></p>
		<a href="/languages/${language.id}/edit">Edit Book</a>
		<form action="/language/${language.id}" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <input type="submit" value="Delete">
		</form>

</body>
</html>