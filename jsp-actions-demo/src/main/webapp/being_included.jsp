<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/10/2024
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This page is included inside jsp_include.jsp</title>
</head>
<body>
<%
    out.print(2+4);
    out.print("<p>The answer is 6</p>");
    System.out.println("being_included_jsp is executed......");
%>

<p>${param.channel} ----- ${param.author}</p>
</body>
</html>
