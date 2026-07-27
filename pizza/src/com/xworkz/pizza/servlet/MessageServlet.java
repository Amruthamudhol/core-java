package com.xworkz.pizza.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/message")
public class MessageServlet extends GenericServlet {

    public MessageServlet() {
        System.out.println("MessageServlet object created");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        System.out.println("service() method called");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        String message = request.getParameter("message");

        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        System.out.println("Age     : " + age);
        System.out.println("Message : " + message);
    }
}