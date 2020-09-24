package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 813017
 */
@WebServlet(urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        
        request.setAttribute("fname", firstname);
        request.setAttribute("lname", lastname);
        
        if (firstname == null || firstname.equals("") ||
                lastname == null || lastname.equals("")) {
            request.setAttribute("message", "Please enter both values.");
            getServletContext().getRequestDispatcher("/WEB-INF/helloWorldJSP.jsp").forward(request, response);
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp").forward(request, response);   
    }
}