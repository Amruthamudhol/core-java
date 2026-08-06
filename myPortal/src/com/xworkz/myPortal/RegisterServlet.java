package com.xworkz.myPortal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class RegisterServlet extends HttpServlet {
    public RegisterServlet() {
        System.out.println("RegisterServlet created by tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String first = req.getParameter("firstName");
        String last = req.getParameter("lastName");
        String msg = first + " " + last + " Registration is Successful";
        req.setAttribute("message", msg);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/register.jsp");

        dispatcher.forward(req, resp);

    }
}
