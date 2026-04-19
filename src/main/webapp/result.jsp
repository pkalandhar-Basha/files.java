<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>

<h2>User Details</h2>

<p><b>Username:</b> <%= request.getAttribute("username") %></p>
<p><b>Email:</b> <%= request.getAttribute("email") %></p>
<p><b>Designation:</b> <%= request.getAttribute("designation") %></p>

<br>
<a href="index.jsp">Go Back to Form</a>

</body>
</html>