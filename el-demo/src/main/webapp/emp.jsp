<%@ page import="tan.hung.model.Employee" %>
<%@ page import="tan.hung.model.Address" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Info</title>
</head>
<body>
<h1>1. Scriptlet</h1>
<%
    Employee emp = (Employee) request.getAttribute("emp");
    out.print("First Name:" + emp.getFirstName());
    out.print("<br>");
    out.print("Last Name: " + emp.getLastName());
    out.print("<br>");
    Address address = emp.getAddress();
    out.print(address.getStreet()+" "+address.getCity()+" "+address.getState());
%>

<h1>2. JSP Expression</h1>
<p>FirstName: <%=emp.getLastName()%></p>
<p>LastName: <%=emp.getLastName()%></p>
<p>Address:</p>
<p>Street: <%=((Employee)request.getAttribute("emp")).getAddress().getStreet()%></p>
<p>City: <%=((Employee)request.getAttribute("emp")).getAddress().getCity()%></p>
<p>State: <%=((Employee)request.getAttribute("emp")).getAddress().getState()%></p>

<h1>3. Express Language in JSP</h1>
<p>FirstName: ${emp.firstName}</p>
<p>LastName: ${emp.lastName}</p>
<p>Address: </p>
<p>Street: ${emp.address.street}</p>
</body>
</html>
