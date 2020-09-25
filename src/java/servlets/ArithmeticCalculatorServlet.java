package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 813017
 */
//@WebServlet(urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String valueone = request.getParameter("valone");
        String valuetwo = request.getParameter("valtwo");
        
        
        int total = 0;
        
        /*
        *Checks for invalid/ null values
        */
        if(valueone == null || valueone == "" || valuetwo == null || valuetwo == "")
        {
            
            request.setAttribute("messagetwo", "Please enter a value.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
   
        /*
        * Add values
        */
        else if (request.getParameter("addition") != null)
        {
            try {
                int intone = Integer.parseInt(valueone);
                int inttwo = Integer.parseInt(valuetwo);
                total = intone + inttwo;
                request.setAttribute("messagetwo", intone + " + " + inttwo + " is " + total);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;    
                }
                catch(NumberFormatException e){
                request.setAttribute("messagetwo", "Invalid inputs. Try again.");     
                }
        }
        
        /*
        * Subtract values
        */
        else if (request.getParameter("subtract") != null)
        {
            try {
                int intone = Integer.parseInt(valueone);
                int inttwo = Integer.parseInt(valuetwo);
                total = intone - inttwo;
                request.setAttribute("messagetwo", intone + " - " + inttwo + " is " + total);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return; 
                }
                catch(NumberFormatException e){
                request.setAttribute("messagetwo", "Invalid inputs. Try again.");   
                }
        }
        
        /*
        * Multiply values
        */
        else if (request.getParameter("multiply") != null)
        {
            try {
                int intone = Integer.parseInt(valueone);
                int inttwo = Integer.parseInt(valuetwo);
                total = intone * inttwo;
                request.setAttribute("messagetwo", intone + " * " + inttwo + " is " + total);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;  
                }
                catch(NumberFormatException e){
                request.setAttribute("messagetwo", "Invalid inputs. Try again."); 
                }
        }
        
        /*
        * Divide values
        */
        else if (request.getParameter("divide") != null)
        {
            try {
                int intone = Integer.parseInt(valueone);
                int inttwo = Integer.parseInt(valuetwo);
                total = intone / inttwo;
                request.setAttribute("messagetwo", intone + " % " + inttwo + " is " + total);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return; 
                }
                catch(NumberFormatException e){
                request.setAttribute("messagetwo", "Invalid inputs. Try again."); 
                }
        }
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }
}