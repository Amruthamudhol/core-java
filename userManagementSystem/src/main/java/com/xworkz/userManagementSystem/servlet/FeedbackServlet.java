package com.xworkz.userManagementSystem.servlet;

import com.xworkz.userManagementSystem.dto.FeedbackDTO;
import com.xworkz.userManagementSystem.service.FeedbackService;
import com.xworkz.userManagementSystem.service.FeedbackServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/feedback")
public class FeedbackServlet extends HttpServlet {
    public FeedbackServlet() {
        System.out.println("FeedbackServlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost in FeedbackServlet");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String comment = req.getParameter("comment");

        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Mobile : " + mobile);
        System.out.println("Comment : " + comment);

        // DTO creation
        FeedbackDTO feedbackDTO = new FeedbackDTO(name, email, mobile, comment);

        //invoking service
        FeedbackService feedbackService = new FeedbackServiceImpl();
        feedbackService.validateAndSave(feedbackDTO);

        // Servlet chaining
        req.setAttribute("feedbackDTO", feedbackDTO);

        // Success message
        String msg = name + " Feedback was sent Successfully..";
        req.setAttribute("message", msg);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/Feedback.jsp");

        dispatcher.forward(req, resp);
    }
}
