<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Life Cycle Demo</title>
</head>
<body>
<p>JSP life cycle</p>
<%!
    public void jspInit(){
        System.out.println("Init ... called only once entire life cycle of this JSP page.");
    }
    public void jspDestroy(){
        System.out.println("Destroy... called on once entire life cycle of this JSP page.");
    }
%>
</body>
</html>
