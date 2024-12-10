<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forward to Another Page</title>
</head>
<body>
<%
    System.out.println("Before JSP forward action............");
%>

<h1>JSP forward action home page</h1>
<jsp:forward page="/result.jsp">
    <jsp:param name="channel" value="tanhung"/>
    <jsp:param name="author" value="hung"/>
</jsp:forward>

<%
    System.out.println("After JSP forward action............");
%>
</body>
</html>
