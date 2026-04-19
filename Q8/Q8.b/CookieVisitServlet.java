package com.cookievisit;

// Step 1: Imports
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

// Step 2: Servlet Mapping
@WebServlet("/CookieVisitServlet")

public class CookieVisitServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("uname");

        int count = 1;

        Cookie cookies[] = request.getCookies();

        // Step 3: Check previous cookies
        if(cookies != null)
        {
            for(Cookie c : cookies)
            {
                if(c.getName().equals("visitCount"))
                {
                    count = Integer.parseInt(c.getValue()) + 1;
                }
                if(c.getName().equals("user"))
                {
                    uname = c.getValue();
                }
            }
        }

        // Step 4: Create user cookie
        Cookie userCookie = new Cookie("user", uname);

        // expires in 60 sec
        userCookie.setMaxAge(60);

        response.addCookie(userCookie);

        // Step 5: Create visit count cookie
        Cookie visitCookie = new Cookie("visitCount",
                                        String.valueOf(count));

        visitCookie.setMaxAge(60);

        response.addCookie(visitCookie);

        // Step 6: Display Output
        out.println("<html><body>");

        out.println("<h2>Welcome back " + uname + "!</h2>");

        out.println("<h3>You have visited this page "
                     + count + " times.</h3>");

        out.println("<h3>Cookie List:</h3>");

        Cookie all[] = request.getCookies();

        if(all != null)
        {
            for(Cookie c : all)
            {
                out.println("Cookie Name : "
                + c.getName() + "<br>");

                out.println("Value : "
                + c.getValue() + "<br><br>");
            }
        }

        out.println("<br>Cookie expiry set to 60 seconds.");

        out.println("<br><br><a href='index.html'>Visit Again</a>");

        out.println("</body></html>");
    }
}