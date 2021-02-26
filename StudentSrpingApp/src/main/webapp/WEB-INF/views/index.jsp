<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="createStudent" style="align-content: center;">
	<h2> Student Registration APP!!!</h2><br>
	<label>Student Identity: </label>
	<input type="text" style="border-radius: 10px" name="studentId"> <br>
	<label>First Name: </label>
	<input type="text" style="border-radius: 10px" name="StudentFirstName"> <br>
	<label>Last Name: </label>
	<input type="text" style="border-radius: 10px" name="StudentLastName"><br><br>
	<input  style="color: blue;" type="submit" value="Register Student"> 
	</form>
</body>
</html>