<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	</head>
	<body>
	<h1>All Books</h1>
	<table class="table">
  		<thead class="thead-light">
    		<tr>
      			<th scope="col">Title</th>
      			<th scope="col">Description</th>
      			<th scope="col">Language</th>
     			 <th scope="col">Number of Pages</th>
    		</tr>
  		</thead>
  		<tbody>
  	 		<c:forEach items="${books}" var="book">
        	<tr>
            	<td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
            	<td><c:out value="${book.description}"/></td>
            	<td><c:out value="${book.language}"/></td>
            	<td><c:out value="${book.numberOfPages}"/></td>
       		 </tr>
        </c:forEach>
  	
   
  		</tbody>
  
	</table>
	<a href ='/books/new'>Add a new Book</a>


</body>
</html>