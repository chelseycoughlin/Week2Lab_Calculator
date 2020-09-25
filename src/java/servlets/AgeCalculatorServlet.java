package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageCalc = request.getParameter("age");
        
                if(ageCalc == null || ageCalc == "")
        {
            
            request.setAttribute("message", "Please enter a value.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
   
                else if (request.getParameter("calcAge") != null)
        {
            if(ageCalc != null || ageCalc != ""){
                try
                {
                int ageint = Integer.parseInt(ageCalc);
                ageint +=1;
                request.setAttribute("message", "You will be " + ageint + " next year!");
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
                }
                catch(NumberFormatException e){
                        request.setAttribute("messagetwo", "Invalid input. Try again."); 
                        }
               } 
        }
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
}
