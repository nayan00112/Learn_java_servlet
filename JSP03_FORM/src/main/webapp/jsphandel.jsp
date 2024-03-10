<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<H1>Welcome</H1>
<%
String name = request.getParameter("name");
String email = request.getParameter("email");

String[] hobbies = request.getParameterValues("hobbies");

out.println("<ol>");
out.println("<li>Name: " + name + "</li>");
out.println("<li>Email: " + email + "</li>");
out.println("<li>Hobbies: </li>");
out.println("<ul>");

for (String n : hobbies) {
	out.print("<li>" + n + "</li>");
}
out.println("</ul>");
out.println("</ol>");

out.println("<hr><ol>");

Enumeration<String> en = request.getParameterNames();

while(en.hasMoreElements()) {
	String pr = en.nextElement().toString();
	String[] val = request.getParameterValues(pr);
	out.println("<li>" + pr + "</li><ul>");
	for (String i : val) {
		out.println("<li>"+i+"</li>");
	}
	out.println("</li></ul>");
}
out.println("</ol>");
%>


<hr>
<hr>

<%
//request.setAttribute("name", name);
//Cookie ck = new Cookie("name", name);
//ck.getMaxAge(60*10);
//response.addCookie(ck);
%>

name: ${name}
<br>
<a href="secondjsp.jsp">Click here</a>
</body>
</html>