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
    <title>JSP include action demo</title>
</head>
<body>
<h1>JSP include action demo</h1>
<p>The included page cannot change response status code or set headers. the servlet container will ignore those attempts</p>
<jsp:include page="/being_included.jsp" flush="true">
    <jsp:param name="channel" value="Tan Hung"/>
    <jsp:param name="author" value="hung"/>
</jsp:include>

<jsp:forward page="/result.jsp">
    <jsp:param name="channel" value="tanhung"/>
    <jsp:param name="author" value="hung"/>
</jsp:forward>
<p>The servlet container includes response(not source code) of the included page.</p>
</body>
</html>
