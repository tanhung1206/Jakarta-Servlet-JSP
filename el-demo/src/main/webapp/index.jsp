<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/9/2024
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="true" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<a href="/employee">Display Employee Info</a><br>
<a href="/operator">Demo for - ${something}</a><br>
<a href="/implicitObject">Demo for - ${firstThing.secondThing}- firstThing is EL Implicit Object</a><br>
<a href="/paramimpliticobj.jsp?username=UJ&password=123456">Demo for - EL param Implicit OBJ</a><br>
<a href="/cookie">Demo for - Cookie</a><br>
<a href="/employee">Display Employee Info</a><br>
<a href="/collectionaccessoperator.jsp">JSP EL [] Operator Demo</a><br>
<a href="/arithmeticlogicalrelationaloperators.jsp">JSP EL Arithmetic, Logical, Relational Operators Demo</a><br>
<a href="/reservewords.jsp">JSP EL Reserved Word Demo</a><br>
</body>
</html>
