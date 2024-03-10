<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- Bydefault session = true. If we false, then error happen in this code as we use session. -->
    
<%@ page session="true" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name= request.getParameter("name");

session.setAttribute("name", name);
%>
Hello <%=name %><br>
<a href="second.jsp" >click here</a>

</body>
</html>