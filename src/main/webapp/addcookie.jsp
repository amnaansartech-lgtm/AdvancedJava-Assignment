<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%
String cname = request.getParameter("cname");
String domain = request.getParameter("domain");
int age = Integer.parseInt(request.getParameter("age"));

// Create Cookie
Cookie ck = new Cookie(cname, domain);

// Set Max Age
ck.setMaxAge(age);

// Add cookie to browser
response.addCookie(ck);
%>

<!DOCTYPE html>
<html>
<head>
<title>Cookie Added</title>
</head>
<body>

<h2>Cookie Set Successfully</h2>

Cookie Name : <%= cname %><br>
Cookie Domain : <%= domain %><br>
Cookie Expiry Age : <%= age %> sec<br><br>

<a href="showcookies.jsp">Go to Active Cookie List</a>

</body>
</html>