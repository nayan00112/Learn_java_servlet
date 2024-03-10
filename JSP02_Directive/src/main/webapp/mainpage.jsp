<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP file</title>
</head>
<body>

<% 

ArrayList al = new ArrayList();
al.add(0, "zero");
al.add(1, "one");
al.add(2, "two");

out.print(al.get(0));

String a = al.get(2).toString();
%>


<h3>JSP Directive</h3>
<ul>
<li>@page</li>
<li>@include</li>
<li>@taglib</li>
</ul>

<%=a %><br>
<%=al.get(1) %>
</body>
</html>