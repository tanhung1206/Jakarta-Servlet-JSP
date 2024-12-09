<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP EL Reserved Word Demo</title>
</head>
<body>
<%
    pageContext.setAttribute("and","This is a value");
%>
<p>Reserve word: ${pageScope["and"]}</p>
</body>
</html>
