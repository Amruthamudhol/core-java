package com.xworkz.myPortal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
    public ContactServlet() {
        System.out.println("ContactServlet created by tomcat");
    }

    @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {

            System.out.println("Running ContactServlet");

            String name=req.getParameter("name");
            String email=req.getParameter("email");
            String phone=req.getParameter("phone");
            String message=req.getParameter("message");

            System.out.println(name);
            System.out.println(email);
            System.out.println(phone);
            System.out.println(message);

            String msg=name + " Contact was sent Successfully..";
            req.setAttribute("message",msg);

            RequestDispatcher dispatcher=req.getRequestDispatcher("/contact.jsp");
            dispatcher.forward(req,resp);

        }
}
