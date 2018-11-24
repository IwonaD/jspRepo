package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet (name = "LotteryController", value = "/random")
public class LotteryController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        Random random = new Random();
        String guess = httpServletRequest.getParameter("guess");
        int resultInt = random.nextInt(10);
        String result = Integer.toString(resultInt);

        if (guess.equals(result)) {
            httpServletResponse.getWriter().println("You won!");
        } else {
            httpServletResponse.getWriter().println("Sorry, not this time :(");
        }
    }
}
