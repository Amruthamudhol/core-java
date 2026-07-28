package com.xworkz.pizza.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(loadOnStartup = 1,urlPatterns = "/person")
public class PersonServlet extends GenericServlet {
    public PersonServlet() {
        System.out.println("PersonServlet object is created");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("Service() called in PersonServlet");

        String name = servletRequest.getParameter("name");
        System.out.println("Name : " + name);
    }
}