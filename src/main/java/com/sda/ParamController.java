package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (
        name = "ParamController",
        urlPatterns = {"/param2"},
        initParams = {
                @WebInitParam(name = "city", value = "Warszawa"),
                @WebInitParam(name = "times", value = "3")
        },
        loadOnStartup = 1)
public class ParamController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String city = getInitParameter("city");
        String times = getInitParameter("times");

        httpServletResponse.getWriter().println("Miasto " + city + " odwiedziłem " + times + " razy.");
    }
}
