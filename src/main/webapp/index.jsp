<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Form</title>
</head>
<body>

<h2>Enter Student Details</h2>

<form action="ResultServlet" method="post">

Roll No:
<input type="number" name="rollno" required><br><br>

Student Name:
<input type="text" name="sname" required><br><br>

Sub1:
<input type="number" name="sub1" required><br><br>

Sub2:
<input type="number" name="sub2" required><br><br>

Sub3:
<input type="number" name="sub3" required><br><br>

Sub4:
<input type="number" name="sub4" required><br><br>

Sub5:
<input type="number" name="sub5" required><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>