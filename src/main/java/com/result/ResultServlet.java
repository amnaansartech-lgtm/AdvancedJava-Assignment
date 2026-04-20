package com.result;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ResultServlet")

public class ResultServlet extends HttpServlet {

 protected void doPost(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {

  int roll =
  Integer.parseInt(request.getParameter("rollno"));

  String name =
  request.getParameter("sname");

  int s1 =
  Integer.parseInt(request.getParameter("sub1"));

  int s2 =
  Integer.parseInt(request.getParameter("sub2"));

  int s3 =
  Integer.parseInt(request.getParameter("sub3"));

  int s4 =
  Integer.parseInt(request.getParameter("sub4"));

  int s5 =
  Integer.parseInt(request.getParameter("sub5"));

  String result;

  if(s1>40 && s2>40 && s3>40 && s4>40 && s5>40)
      result = "PASS";
  else
      result = "FAIL";

  double avg = (s1+s2+s3+s4+s5)/5.0;

  request.setAttribute("roll", roll);
  request.setAttribute("name", name);
  request.setAttribute("s1", s1);
  request.setAttribute("s2", s2);
  request.setAttribute("s3", s3);
  request.setAttribute("s4", s4);
  request.setAttribute("s5", s5);
  request.setAttribute("result", result);
  request.setAttribute("avg", avg);

  RequestDispatcher rd =
  request.getRequestDispatcher("result.jsp");

  rd.forward(request,response);
 }
}