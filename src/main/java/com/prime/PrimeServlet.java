/*6c. Build a servlet program to check the given number is prime number or not using HTML with step by
step procedure.*/

package com.prime;

// Step 1: Required imports
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

// Step 2: Map servlet URL
@WebServlet("/PrimeServlet")

public class PrimeServlet extends HttpServlet {

    // Step 3: Handle form request using doPost()
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        // Step 4: Set response type
        response.setContentType("text/html");

        // Step 5: Create PrintWriter object
        PrintWriter out = response.getWriter();

        // Step 6: Read input number from HTML form
        int n = Integer.parseInt(request.getParameter("num"));

        boolean prime = true;

        // Step 7: Check prime logic
        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        // Step 8: Display result
        out.println("<html><body>");
        out.println("<h2>Prime Number Result</h2>");

        if (prime)
            out.println("<h3>" + n + " is a Prime Number</h3>");
        else
            out.println("<h3>" + n + " is Not a Prime Number</h3>");

        // Step 9: Back link
        out.println("<br><a href='index.html'>Check Another Number</a>");

        out.println("</body></html>");
    }
}