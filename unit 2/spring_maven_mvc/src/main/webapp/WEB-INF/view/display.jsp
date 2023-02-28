<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Input Form</title>
<style>
	.error {
		color: red
	}
</style>
</head>
<body>
	<h2>User Input Form</h2>
	Asterisk (*) means required
	<form:form action="process" method="post" modelAttribute="user">
		<label for="userName">Name(*)</label>
		<form:input type="text" path="userName" placeholder="enter your name" />
		<form:errors path="userName" cssClass="error"></form:errors>
		<br>
		<br>
		
		<label for="userRoll">Roll No.</label>
		<form:input type="text" path="rollNo"
			placeholder="enter your roll no." />
			<form:errors path="rollNo" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="userPass">Password</label>
		<form:input type="password" path="password"
			placeholder="enter password" />
		<form:errors path="password" cssClass="error"></form:errors>
		<br>
		<br>
		<label>Email(*)</label>
		<form:input path="email" placeholder="enter your email"/>
		<form:errors path="email" cssClass="error"></form:errors>
		<br><br>
		
		<label>DOB(*)</label>
		<form:input type = "date" path="date" placeholder="enter your dob"/>
		<form:errors path="date" cssClass="error"></form:errors> <br><br>
		
		<label>Course Code</label>
		<form:input path="courseCode" placeholder="enter your course code"/>
		<form:errors path="courseCode" cssClass="error"></form:errors> <br><br>
		<input type="submit" />
	</form:form>
</body>
</html>