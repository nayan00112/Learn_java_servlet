<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a = 24; %>
<%
String name = request.getParameter("name");
String email = request.getParameter("email");
%>

Name : <%=name %><br>
Email: <%=email %><br>
number : <%=a %><br>

</body>
</html>