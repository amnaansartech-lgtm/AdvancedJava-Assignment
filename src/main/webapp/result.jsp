<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Result</title>
</head>
<body>

<h2>Student Result</h2>

Roll No:
<%= request.getAttribute("roll") %><br><br>

Name:
<%= request.getAttribute("name") %><br><br>

Sub1:
<%= request.getAttribute("s1") %><br>

Sub2:
<%= request.getAttribute("s2") %><br>

Sub3:
<%= request.getAttribute("s3") %><br>

Sub4:
<%= request.getAttribute("s4") %><br>

Sub5:
<%= request.getAttribute("s5") %><br><br>

Result:
<%= request.getAttribute("result") %><br><br>

Average:
<%= request.getAttribute("avg") %><br><br>

<a href="index.jsp">Back</a>

</body>
</html>