package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1, urlPatterns = "/order")
public class OrderServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service() in OrderServlet");

        String orderFrom = servletRequest.getParameter("orderFrom");
        String item = servletRequest.getParameter("item");
        String quantity = servletRequest.getParameter("quantity");
        String address = servletRequest.getParameter("address");

        System.out.println("Order From : " + orderFrom);
        System.out.println("Item : " + item);
        System.out.println("Quantity : " + quantity);
        System.out.println("Address : " + address);

        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>" + orderFrom + "</h1> your order, " + item + " is placed");
        out.println("</body>");
        out.println("</html>");
    }
}
