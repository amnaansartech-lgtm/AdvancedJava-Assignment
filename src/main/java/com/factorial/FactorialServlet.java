package com.factorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int number = Integer.parseInt(request.getParameter("number"));

        long fact = 1;

        for(int i=1; i<=number; i++)
        {
            fact = fact * i;
        }

        out.println("<html><body>");
        out.println("<h2>Factorial Result</h2>");
        out.println("<p>Number : " + number + "</p>");
        out.println("<p>Factorial : " + fact + "</p>");
        out.println("<a href='index.html'>Back</a>");
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.sendRedirect("index.html");
    }
}