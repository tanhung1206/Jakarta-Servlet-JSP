<%@ page import="tan.hung.model.User" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thank you!</title>
</head>
<body>
<h1>Thank you for signup</h1>
<p>Below is your details:</p>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String email = request.getParameter("email");
    User user = new User(username, password, email);
%>
<p>Username: <%=user.getUsername()%></p>
<p>Password: <%=user.getPassword()%></p>
<p>Email: <%=user.getEmail()%></p>
<p>CreatedAt: <%=user.getCreatedAt()%></p>
</body>
</html>
