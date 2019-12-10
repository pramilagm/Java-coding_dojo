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
		<form:form action="/license/process" method="post" modelAttribute="license">
		<p>
		     <form:label path="person">Person :</form:label>
		     <form:errors path="person"/>
		    <form:select path="person">
					<c:forEach items="${persons}" var="person">
						<form:option value="${person.id}">
							<c:out value="${person.firstName}"/> <c:out value="${person.lastName}"/>
						</form:option>
					</c:forEach>
				</form:select>
		     
		     
		 </p>
		 <p>
	        <form:label path="state">State </form:label>
	        <form:errors path="state"/>
	        <form:input path="state"/>
    	</p>
    	<form:label path="expirationDate">Expiration Date:</form:label>
				<form:errors path="expirationDate" />
				<form:input type="date" path="expirationDate" />
    	<input type="submit" value="Create" />
		</form:form>   

	</body>
</html>