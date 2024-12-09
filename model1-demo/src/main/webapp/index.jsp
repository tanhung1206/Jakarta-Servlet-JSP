<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Signup for our application</title>
</head>
<body>
<h1>Signup</h1>
<form action="/signup.jsp" method="post">
    Username: <input name="username"><br>
    Password: <input type="password" name="password"><br>
    Email: <input name="email"><br>
    <input type="submit" value="Sign Up">
</form>
</body>
</html>
