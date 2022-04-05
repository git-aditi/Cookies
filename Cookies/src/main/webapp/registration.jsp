<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="index.jsp"> Go back to Login !! </a>
	<form name="registration" action=register method="post">
		<label for="fname">First name:</label><br>
		<input type="text" id="fname" name="fname"><br>

		<label for="lname">Last name:</label><br>
		<input type="text" id="lname" name="lname"><br>
		
		<label for="uname">Choose Username:</label><br>
		<input type="text" id="uname" name="uname"><br>		
		
		<label for="password">Choose Password:</label><br>
		<input type="password" id="password" name="password"><br>	
		
		<label for="repeatPassword">Repeat your Password:</label><br>
		<input type="password" id="repeatPassword" name="repeatPassword"><br>
		
		<label for="address">Address:</label><br>
		<input type="text" id="address" name="address"><br>
		
		<label for="email">Email:</label><br>
		<input type="email" id="email" name="email"><br>
 		<input type="submit" value="Register Me!" name="Register"> 
		
<!-- 		<input type="button" onclick="doValidation()" value="Register Me!" name="Register"> -->
	
	</form>

</body>
</html>
