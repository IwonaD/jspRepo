package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "PersonController", value = "/person")
public class PersonController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        Person person = new Person ("Bob", "Bobowski", 77);
        httpServletRequest.setAttribute("person", person);

        httpServletRequest.getRequestDispatcher("person.jsp")
                .forward(httpServletRequest, httpServletResponse);
    }
}
