<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class ="container" style="margin-top:15px"]>
	<div class="float float-left">
			<h2 class="display-6 text-success"><c:out value="${event.eventName }"></c:out></h2>
			<h5 class="display-6 text-success"><c:out value="${event.host.firstName}"></c:out> <c:out value="${event.host.lastName}"></c:out></h5>
			<h5 class="display-6 text-success"><c:out value="${event.city}"/>, <c:out value="${event.state}"/></h5>
			<h5 class="display-6 text-success">Number of People who are Attending  <c:out value="${event.attendees.size() }"></c:out></h5>
			
			<table class="table table-hover">
					<thead>
						<tr>
							<th>Name</th>
							
							<th>Location</th>
							
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${ event.attendees}" var ="attendees">
					
							<tr>
							   <td >${attendees.firstName}</td>
								<td><c:out value="${attendees.city }"/> ,<c:out value="${attendees.state }"/> </td>
								
								</tr>
						
					</c:forEach>

	
			</tbody>
		</table>
</div>
	<div class="comment" style="float:right ">
		<a href="/events/logout"  class="btn btn-outline-warning">Logout</a>
		<a href="/events" class="btn btn-outline-success">Home</a>
		<h2 class="display-4 text-success">Message Wall</h2>
		
		<c:forEach items="${event.comments }" var= "message">
		<p> <c:out value="${message.author.firstName }"/> says :<c:out value="${message.message }"/>
		</p>
			<p>-----------------------------------------------------</p>
		</c:forEach>
		
		<form:form method ="post" action="/events/comment/create" modelAttribute="comment">
			<form:hidden path="author" value="${user.id }"/>
			<form:hidden path="event" value ="${event.id }"/>
			<p>
				<form:label path="message" class="col-sm-4 col-form-label lead" >Add Comment:</form:label>
			 	<form:textarea path="message" class="form-control col-sm-12" type="text"/>
			</p>
					        
			<input class="btn btn-outline-success" type="submit" value="Submit"/>
		</form:form>
	
	</div>
</div>
</body>
</html>