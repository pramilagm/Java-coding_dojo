<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Event</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			rel="stylesheet" 
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
			crossorigin="anonymous">
		<link rel="stylesheet" href="css/main.css" />
</head>
<body>
	<div class="new-event float float-left">
				<p>Plan an Event:</p>
				<form:form action="/events/${ event.id }/update" method="post" modelAttribute="event">
					<form:hidden value="${ user.id }" path="host"/>
					<div class="form-group">
						<form:label path="eventName">Name</form:label>
						<form:errors path="eventName"></form:errors>
						<form:input class="form-control" path="eventName"></form:input>
					</div>
					<div class="form-group">
						<form:label path="date">Date</form:label>
						<form:errors path="date"></form:errors>
						<form:input class="form-control" type="date" value="${ now }" path="date"></form:input>
					</div>
					 <div class="form-group">
				        <form:label path="city">City</form:label>
				        <form:errors path="city"/>
				        <form:input class="form-control" path="city" />
				    </div>
				    <div class="form-group">
				        <form:label path="state">State</form:label>
				        <form:errors path="state"/>
						<form:input class="form-control" path="state"/>
				    </div>
				    <button>Update Event</button>
			</form:form>
			</div>

</body>
</html>