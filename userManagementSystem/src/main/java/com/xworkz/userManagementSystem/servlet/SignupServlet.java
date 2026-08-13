package com.xworkz.userManagementSystem.servlet;

import com.xworkz.userManagementSystem.dto.SignupDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1,urlPatterns = "/signup")
public class SignupServlet extends HttpServlet {
    public SignupServlet() {
        System.out.println("SignupServlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Running doPost in SignupServlet");

        String userId = req.getParameter("userId");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        System.out.println("User ID : " + userId);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("Confirm Password : " + confirmPassword);

        // Servlet chaining
        SignupDTO signupDTO = new SignupDTO(userId, email, password, confirmPassword);
        req.setAttribute("signupDTO", signupDTO);

        String msg = userId + " Account created successfully..";
        req.setAttribute("message", msg);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/SignIn.jsp");
        dispatcher.forward(req, resp);
    }
}
