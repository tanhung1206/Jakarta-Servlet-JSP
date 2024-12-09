<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Implicit</title>
</head>
<body>
<%
    pageContext.setAttribute("weather","Rainy");
    String weather=(String)request.getAttribute("weather");
    String fcb=(String)session.getAttribute("favourite_football_club");
    String appName=(String)application.getAttribute("appName");

    String channelName= config.getInitParameter("channelName");
    String author= config.getInitParameter("Author");
    out.print(weather);

    System.out.println("---------PageContext-------------------");
    System.out.println(pageContext.getAttribute("weather"));//PageCope
    System.out.println(pageContext.getAttribute("weather",PageContext.REQUEST_SCOPE));
    System.out.println(pageContext.getAttribute("favourite_football_club",PageContext.SESSION_SCOPE));
    System.out.println(pageContext.getAttribute("appName",PageContext.APPLICATION_SCOPE));
    System.out.println("---------PageContext-------------------");

    pageContext.setAttribute("user","Hung",PageContext.SESSION_SCOPE);
%>
<p>Weather: <%=weather%></p>
<p>Football club: <%=fcb%></p>
<p>AppName: <%=appName%></p>
<p>Channel: <%=channelName%></p>
<p>Author: <%=author%></p>
</body>
</html>
