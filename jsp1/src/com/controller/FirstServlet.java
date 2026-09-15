package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("we are in FirstServlet");
        System.out.println("ServletContext:" + getServletContext().getInitParameter("x"));
        System.out.println("Servletconfig:" + getServletConfig().getInitParameter("a"));
        
        System.out.println("t1=" + req.getParameter("t1"));
        System.out.println("t2=" + req.getParameter("t2"));
        System.out.println("b1=" + req.getParameter("b1"));
        
        // Note: Change 'res.' to 'resp.' to match the parameter name 'resp' defined above
        // resp.getWriter().println("Hello World"); 
    }
}