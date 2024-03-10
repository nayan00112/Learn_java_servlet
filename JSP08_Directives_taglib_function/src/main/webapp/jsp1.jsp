<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="str" value="I am Nayan"></c:set>
${str}<br>
${fn:split(str, ' ')[0]}<br>
${fn:split(str, ' ')[1]}<br>
${fn:split(str, ' ')[2]}<br>

${fn:split(str, ' ')[6]}  <br>  
<br>

length: ${fn:length(str)}<br>
${fn:toUpperCase(str)}<br>
${fn:toLowerCase(str)}<br>
<hr>
</body>
</html>