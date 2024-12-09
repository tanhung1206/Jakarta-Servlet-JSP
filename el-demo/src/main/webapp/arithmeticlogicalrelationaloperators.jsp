<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP EL Arithmetic, Logical, Relational Operators Demo</title>
</head>
<body>
<%
    pageContext.setAttribute("isLoggedIn", true);
    pageContext.setAttribute("isAdmin", true);
%>
<p>EL Arithmetic Operators: ${2+2}, ${7*8}</p>
<p>EL Logical Operators: ${isLoggedIn&&isAdmin}</p>
<p>EL Relational Operators: ${2>5}</p>
</body>
</html>
