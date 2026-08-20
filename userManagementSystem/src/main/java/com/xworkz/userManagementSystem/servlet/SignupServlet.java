package com.xworkz.userManagementSystem.servlet;

import com.xworkz.userManagementSystem.dto.SignupDTO;
import com.xworkz.userManagementSystem.service.SignupService;
import com.xworkz.userManagementSystem.service.SignupServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/signup")
public class SignupServlet extends HttpServlet {

    public SignupServlet() {
        System.out.println("SignupServlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Running doPost in SignupServlet");

        // Get data from form
        String userId = req.getParameter("userId");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        System.out.println("User ID : " + userId);
        System.out.println("Email : " + email);

        // Create DTO
        SignupDTO signupDTO = new SignupDTO(userId, email, password, confirmPassword);

        // Invoke service
        SignupService signupService = new SignupServiceImpl();
       boolean saved = signupService.validateAndSave(signupDTO);

        // Set DTO in request
        req.setAttribute("signupDTO", signupDTO);
        if (saved) {

            // Success message
            String msg = userId + " Account created successfully..";
            req.setAttribute("message", msg);

            // Servlet chaining
            RequestDispatcher dispatcher = req.getRequestDispatcher("/Signup.jsp");
            dispatcher.forward(req, resp);
        }else {
            // Failure message
            String msg = userId + " Account creation failed..";
            req.setAttribute("message", msg);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/SignIn.jsp");
            dispatcher.forward(req, resp);
        }

    }
}