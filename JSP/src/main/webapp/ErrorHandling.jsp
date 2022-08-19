<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%@page isErrorPage="true" %>
    
    <%@page errorPage="ErrorHandlerPage.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Error Handling</h1>
	<hr>
	
	<p:out value="${34+35 }"></p:out>
	<%!
	int n1 =20;
	int n2 =0;
	%>
	
	<%
	
	int division = n1/n2;
	
	%>
	
	<h1>Division is : <%=division %></h1>
	
	
	
</body>
</html>