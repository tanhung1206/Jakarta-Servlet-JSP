<%@ page import="tan.hung.model.Employee" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP EL [] Operator Demo</title>
</head>
<body>
<%
    pageContext.setAttribute("emp",new Employee("1003","Trung","Hieu"));
    pageContext.setAttribute("foo.bar","Sunday");
    pageContext.setAttribute("countries", Arrays.asList("US","VN","Singapore"));
    pageContext.setAttribute("families", Map.of(
            "ba", "Duc Chinh",
            "me", "Bich Lieu",
            "chi", "Quynh Nhi"
    ));
%>

<p>Employee Info: ${emp["empId"]} - ${emp["firstName"]} - ${emp["lastName"]}</p>
<p>Today: ${pageScope["foo.bar"]}</p>
<%--<p>${["foo.bar"]}</p>--%> <%--Not Word--%>
<p>${countries[0]} - ${countries["1"]} - ${countries[2]}</p>
<p>${families.ba}</p>
</body>
</html>
