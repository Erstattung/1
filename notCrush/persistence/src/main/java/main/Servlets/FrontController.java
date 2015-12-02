package main.Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ActionFactory factory = AbstractActionFactory.getInstance();
            Action action = factory.getAction(request);

            String view = action.execute(request, response);
            getServletContext().getRequestDispatcher(view).forward(request, response);
        }
        catch (Exception e) {
            throw new ServletException("Executing action failed", e);
        }

    }
}