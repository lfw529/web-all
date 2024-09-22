package com.lfw.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BbsServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("BbsServlet init ....");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------------>> GET : BbsServlet find All ...... ");

        String value = req.getServletContext().getInitParameter("tomcat_war_exploded");
        System.out.println(value);


        String id = req.getSession().getId();
        System.out.println("sessionId: " + id);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------------>> POST : BbsServlet find All ...... ");
    }
}
