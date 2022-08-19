<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
}
</style>
</head>
<body>

	<div style="font-size: 40px; color: maroon; padding: 20px;">
		<h1>This is a header Page</h1>
		<p>Include Directive used</p>
		<p>
			Current Date is :
			<%=new Date().toString()%>
			
		</p>


	</div>

</body>
</html>