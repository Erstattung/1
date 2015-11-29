package main.Servlets;

import main.PO.ClientPO;
import main.Services.ClientServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by echerkas on 28.11.2015.
 */
public class LoginScreen extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("login.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        ClientServiceImpl clientService = new ClientServiceImpl();
        ClientPO client = clientService.getClient(email, pass);

        if(client != null)
        {
            RequestDispatcher rs;
            if (client.getAdminRole()) {
                rs = req.getRequestDispatcher("Welcome Admin");
            } else {
                rs = req.getRequestDispatcher("Welcome");
            }
            rs.forward(req, resp);
        }
        else
        {
            req.setAttribute("message", "Username or Password incorrect");
            RequestDispatcher rs = req.getRequestDispatcher("login.jsp");
            rs.forward(req, resp);
        }
    }
}
