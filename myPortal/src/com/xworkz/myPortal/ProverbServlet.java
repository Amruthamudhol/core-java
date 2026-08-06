package com.xworkz.myPortal;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/proverb")
public class ProverbServlet extends HttpServlet {
    public ProverbServlet() {
        System.out.println("ProverbServlet created by tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String author = req.getParameter("author");
        String category = req.getParameter("category");
        String language = req.getParameter("language");
        String proverb = req.getParameter("proverb");

        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Language: " + language);
        System.out.println("Proverb: " + proverb);

        req.setAttribute("message", "Proverb saved successfully!");
        req.setAttribute("proverb", proverb);

        RequestDispatcher rd = req.getRequestDispatcher("/proverb.jsp");
        rd.forward(req, resp);
    }
}