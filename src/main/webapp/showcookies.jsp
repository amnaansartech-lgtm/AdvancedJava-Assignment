<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Active Cookies</title>
</head>
<body>

<h2>Active Cookie List</h2>

<%
Cookie cookies[] = request.getCookies();

if(cookies != null)
{
    for(Cookie c : cookies)
    {
        out.println("Cookie Name : " + c.getName() + "<br>");
        out.println("Cookie Value : " + c.getValue() + "<br><br>");
    }
}
else
{
    out.println("No Active Cookies Found");
}
%>

</body>
</html>