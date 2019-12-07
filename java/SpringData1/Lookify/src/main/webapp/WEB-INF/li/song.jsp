<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Top Ten rating Songs</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		
	</head>
	<body>
		<p> Top 10 Songs </p>
		 <div class="container">
		 <c:forEach items="${songs}" var="song">
		 	 <p><c:out value="${song.rating}"/>
		 	 <a href ="/dashboard/${song.id}"><c:out value="${song.title}"/></a>
			 <c:out value="${song.artist}"/></p>
			
		
			        
        		
		 </c:forEach>
		 </div>
	
	
	</body>
</html>