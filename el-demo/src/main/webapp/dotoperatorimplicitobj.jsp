<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>firstThing is EL Implicit Obj</title>
</head>
<body>
<%
    pageContext.setAttribute("username","Trung Kien");
%>

<p>Page Scope: ${pageScope.username}</p>
<p>Request Scope: ${requestScope.username}</p>
<p>Session Scope: ${sessionScope.username}</p>
<p>Application Scope: ${applicationScope.username}</p>
</body>
</html>
