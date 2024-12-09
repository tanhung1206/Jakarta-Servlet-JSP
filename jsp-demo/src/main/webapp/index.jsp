<%@page import="java.time.LocalDateTime,java.time.LocalDate" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<p><a href="lifecycledemo.jsp">JSP Life cycle demo</a></p>

<%@include file="header.jsp" %>

<h2>Welcome to Tan Hung</h2>
<h2>Next video is about declaration</h2>
<h2>Declaration: used to insert instance variables and methods into generated servlet class</h2>
<%!
    int count = 0;

    public int getCount() {
        return count;
    }
%>

<h2>Scriptlet: all statements will be inserted into _jspService() </h2>
<%
    int count = 0;
    count++;
    System.out.println("count local: " + count);
    System.out.println("count in getCount(): " + getCount());
%>

<h2>Expression</h2>
<%=count%>
<%=getCount()%>

<h2>Directive: Page Directive</h2>
<%
    LocalDate currentDate = LocalDate.now();
    LocalDateTime currentTime = LocalDateTime.now();
%>

<p>Today is: <%=currentDate%>
</p>
<p>Current time is: <%=currentTime%>
</p>

<!--HTML Comment-->

<%--JSP Comment--%>
<%@include file="footer.jsp" %>

<%
    String name = (String) pageContext.getAttribute("user", PageContext.SESSION_SCOPE);
    out.print("User: "+name);
%>
</body>
</html>
