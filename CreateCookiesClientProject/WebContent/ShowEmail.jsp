<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="entity.ejb.Customer"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show email</title>
</head>
<body>
	<h2>Email:</h2>
	<p>
		<%
			Customer c = (Customer) request.getAttribute("eMail");
		%>
		<input type="text" name="txtEmail" value="<%=c.getcEmail()%>">
	</p>
	<form action="/CreateCookiesClientProject/MainServlet" method="post">
		<input type="submit" name="submit" value="Tillbaka"> <input
			name="operation" value="searchemail" type="hidden">
	</form>
</body>
</html>