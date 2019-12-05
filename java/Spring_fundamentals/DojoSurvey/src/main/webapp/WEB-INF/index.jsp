<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="contain">
<form method="POST" action="/login">
    <p>Your Name: <input type="text" name="name"></p>
    <p>Dojo location :
	    <select name="location">
		    <option value="san jose">San Hose</option>
		    <option value="new york">New York</option>
		    <option value="SF">San Franscisco</option>
	  	</select>
  	</p>
  <p>Favorite Language :
	  <select name="language">
	    <option value="python">Python</option>
	    <option value="java">Java</option>
	    <option value="javascript">JavaScript</option>
	    <option>Ruby</option>
	  </select>
  </p>
  <p><label>Comment(Optional)<br><textarea rows="6" cols="50" name="des"></textarea></label></p>
  <input type="submit" value="Submit"></label>
  
</form>
</div>

</body>
</html>