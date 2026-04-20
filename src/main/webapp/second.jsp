<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second Page</title>
</head>
<body>

<h1>Display Session Value</h1>

<%
String name = (String)session.getAttribute("user");

if(name == null)
    out.print("Sorry! Session has ended.");
else
    out.print("Hello " + name);
%>

</body>
</html>