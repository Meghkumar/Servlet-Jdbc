<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>The First JSP page</h1>

	<!-- Declaration tag [when want to solve the problem then use this tag with '!' at start] -->
	<%!
	
	int a = 5;
	int b = 8;
	String name = "JSP_pratice";

	public int dosum() {

		return a + b;

	}

	public String reverse() {
		StringBuffer br = new StringBuffer(name);
		return br.reverse().toString();
	}
	%>
	
	
	<!-- Scriplet tag [For printing] -->
	<%
	out.println(a);
	out.println("<br>");
	out.println(b);
	out.println("<br>");
	out.println("Sum is "+dosum());
	out.println("<br>");
	out.println(reverse());
	%>

	<!-- Expression tag [when u want to print the particular in a format or 
	need mention something in between the html tag from the java programm] -->
	
	<h1>Sum is :<%=dosum() %></h1>




</body>
</html>