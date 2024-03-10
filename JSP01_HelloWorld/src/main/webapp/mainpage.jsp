<!-- Directive -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- end of Directive  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
// Declaration
String pagename = "superpage";
%>


<%
// Scriptlet
String name = request.getParameter("name");
request.setAttribute("user_name", name);
%>

<h1>Hello World</h1>
<h1>Hello <%= name %></h1>  <!-- Expression -->
<h1>Hello ${user_name} (As attribute)</h1> 
<h1>Page name= <%= pagename %></h1> <!-- Expression --> 
or
<h1>Page name= <% out.println(pagename); %></h1>

<ol>
<li>Directive</li>
<ul>
<li>@page</li>
<li>@include</li>
<li>@taglib</li>
</ul>
<li>Declaration</li>
<li>Scriptlet</li>
<li>Expression</li>
</ol>

</body>
</html>