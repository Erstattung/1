package main.Servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainPage implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)  {
        return "/pages/index.jsp";
    }
}