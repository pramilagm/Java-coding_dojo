<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
       <%@ page isErrorPage="true" %>  
      
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	
		<h1>New Book</h1>
		<a class="btn btn-warning mt-2" href="/">HOME</a>
		<form:form action="/ninjas/process" method="post" modelAttribute="ninja">
		<p>
		     <form:label path="dojo">Person :</form:label>
		     <form:errors path="dojo"/>
		    <form:select path="dojo">
					<c:forEach items="${dojos}" var="dojo">
						<form:option value="${dojo.id}">
							<c:out value="${dojo.name}"/> 
						</form:option>
					</c:forEach>
				</form:select>
		     
		     
		 </p>
		 <p>
	        <form:label path="firstName">First Name </form:label>
	        <form:errors path="firstName"/>
	        <form:input path="firstName"/>
    	</p>
    	<p>
    	<form:label path="lastName">Last Name:</form:label>
				<form:errors path="lastName" />
				<form:input  path="lastName" />
		</p>
		<p>
    	<form:label path="age">Age:</form:label>
				<form:errors path="age" />
				<form:input  path="age" />
		</p>
    	<input type="submit" value="Create" />
		</form:form>   

	</body>
</html>