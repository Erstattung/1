package main.Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
// * Created by echerkas on 30.11.2015.
// */
public class Welcome extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("welcome.jsp").forward(req, resp);
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("user");
//        String email = req.getParameter("email");
//        String pass = req.getParameter("pass");
//
//        ClientServiceImpl clientService = new ClientServiceImpl();
//        ClientPO clientName = clientService.getClient(String "mail", "password");
//        req.setAttribute("message", "$user");
//    }
}
