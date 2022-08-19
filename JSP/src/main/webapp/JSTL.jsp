<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	 <h1>Taglib Directive tutorial</h1>
	<hr>
	
	<c:set var="name" value="MeghKumar"></c:set>
	<c:out value="${name }"></c:out>
	<c:if test="${3>2 }">
	<h2>This is true 3>2</h2>
	</c:if>
	
	
	
</body>
</html>