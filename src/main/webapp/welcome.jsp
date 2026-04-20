<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<%
String name = request.getParameter("uname");

out.print("Welcome! " + name);
out.print("<br>Session has started... " + name);

session.setAttribute("user", name);

out.print("<br>Your name stored in session object");

session.setMaxInactiveInterval(60);

out.print("<br>One minute session expiry set.");

out.print("<br><br>Click below within 1 minute:");
%>

<br><br>

<a href="second.jsp">Display the value</a>

</body>
</html>