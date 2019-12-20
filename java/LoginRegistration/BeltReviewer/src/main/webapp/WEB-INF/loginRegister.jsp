<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>
	<diV class="container-md">
		<div class="register">
		<h1>Register!</h1>
    <p><c:out value="${error}" /></p>
    <p><form:errors path="user.*"/></p>
    
    <form:form method="POST" action="/registration" modelAttribute="user">
    	<p>
    		<form:label path="firstName">First Name</form:label><br>
    		<form:input type ="text" path="firstName"/>
    		
    	</p>
    	<p>
    		<form:label path="lastName">Last Name</form:label><br>
    		<form:input type ="text" path="lastName"/>
    	</p>
        <p>
            <form:label path="email">Email:</form:label><br>
            <form:input type="email" path="email"/>
        </p>
        <p>
        	<form:label path="city">Location</form:label><br>
        	<form:input type="text" path="city"/>
        	<form:select path="state">
        			<form:option value="AL">Alabama</form:option>
                    <form:option value="AK">Alaska</form:option>
                    <form:option value="AZ">Arizona</form:option>
                    <form:option value="AR">Arkansas</form:option>
                    <form:option value="CA">California</form:option>
                    <form:option value="CO">Colorado</form:option>
                    <form:option value="CT">Connecticut</form:option>
                    <form:option value="DE">Delaware</form:option>
                    <form:option value="DC">District Of Columbia</form:option>
                    <form:option value="FL">Florida</form:option>
                    <form:option value="GA">Georgia</form:option>
                    <form:option value="HI">Hawaii</form:option>
                    <form:option value="ID">Idaho</form:option>
                    <form:option value="IL">Illinois</form:option>
                    <form:option value="IN">Indiana</form:option>
                    <form:option value="IA">Iowa</form:option>
                    <form:option value="KS">Kansas</form:option>
                    <form:option value="KY">Kentucky</form:option>
                    <form:option value="LA">Louisiana</form:option>
                    <form:option value="ME">Maine</form:option>
                    <form:option value="MD">Maryland</form:option>
                    <form:option value="MA">Massachusetts</form:option>
                    <form:option value="MI">Michigan</form:option>
                    <form:option value="MN">Minnesota</form:option>
                    <form:option value="MS">Mississippi</form:option>
                    <form:option value="MO">Missouri</form:option>
                    <form:option value="MT">Montana</form:option>
                    <form:option value="NE">Nebraska</form:option>
                    <form:option value="NV">Nevada</form:option>
                    <form:option value="NH">New Hampshire</form:option>
                    <form:option value="NJ">New Jersey</form:option>
                    <form:option value="NM">New Mexico</form:option>
                    <form:option value="NY">New York</form:option>
                    <form:option value="NC">North Carolina</form:option>
                    <form:option value="ND">North Dakota</form:option>
                    <form:option value="OH">Ohio</form:option>
                    <form:option value="OK">Oklahoma</form:option>
                    <form:option value="OR">Oregon</form:option>
                    <form:option value="PA">Pennsylvania</form:option>
                    <form:option value="RI">Rhode Island</form:option>
                    <form:option value="SC">South Carolina</form:option>
                    <form:option value="SD">South Dakota</form:option>
                    <form:option value="TN">Tennessee</form:option>
                    <form:option value="TX">Texas</form:option>
                    <form:option value="UT">Utah</form:option>
                    <form:option value="VT">Vermont</form:option>
                    <form:option value="VA">Virginia</form:option>
                    <form:option value="WA">Washington</form:option>
                    <form:option value="WV">West Virginia</form:option>
                    <form:option value="WI">Wisconsin</form:option>
                    <form:option value="WY">Wyoming</form:option>
                </form:select>
        </p>
        <p>
            <form:label path="password">Password:</form:label><br>
            <form:password path="password"/>
        </p>
        <p>
            <form:label path="passwordConfirmation">Password Confirmation:</form:label><br>
            <form:password path="passwordConfirmation"/>
        </p>
        <input type="submit" value="Register!"/>
    </form:form>
	
	</div>
	<div class="login">
		<h1>Login</h1>
    <p><c:out value="${error}" /></p>
    <form:form method="post" action="/login" modelAttribute="user">
        <p>
            <label for="email">Email</label>
            <input type="text" id="email" name="email"/>
        </p>
        <p>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>
        </p>
        <input type="submit" value="Login!"/>
    </form:form>
	</div>
	</diV>

</body>
</html>