<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- [1] -->
    <!-- Now this is the method to import multiple packages -->
    <%@page import="java.util.Random,java.util.ArrayList,java.io.*" %>
    
    <!-- [2] -->
    <!-- If we want to create the page as an error page -->
    <%@page isErrorPage="true" %>
    
    <!-- [3] -->
    <!-- When we dont want to use session -->
    <%@page session="true" %>
    
    <!-- [4] -->
    <!-- When want to extend the particular class -->
    <%-- <%@page extends="" %> --%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	
		<!-- [5] -->
		<!-- INCLUDE tag is to include the file in the particular section -->
		<%@include file="header.jsp" %>
		
		<h1>Random Numbers : 
		
		<%
		
		Random r = new Random();
		int n=r.nextInt(6);
		
		%>
		
		<%= n %>
		
		</h1>


</body>
</html>