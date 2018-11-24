package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "CarController", value = "/car")
public class CarController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String brand = httpServletRequest.getParameter("brand");

        if (brand == null){
            httpServletResponse.getWriter().println("Brak podanej marki");
        } else {
            if (brand.equals("audi")) {
                httpServletResponse.getWriter().println("A1\nA2\nA3\nA4");
            } else if (brand.equals("fiat")) {
                httpServletResponse.getWriter().println("Punto\nSeicento\nPanda");
            }
        }
    }
}
