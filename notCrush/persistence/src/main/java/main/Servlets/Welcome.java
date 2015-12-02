package main.Servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
// * Created by echerkas on 30.11.2015.
// */
public class Welcome implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "/pages/welcome.jsp";
    }
}
