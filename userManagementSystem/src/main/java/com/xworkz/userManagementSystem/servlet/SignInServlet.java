package com.xworkz.userManagementSystem.servlet;

import com.xworkz.userManagementSystem.dto.SignInDTO;
import com.xworkz.userManagementSystem.service.SignInService;
import com.xworkz.userManagementSystem.service.SignInServiceImpl;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/signin")
public class SignInServlet extends HttpServlet {
    public SignInServlet() {
        System.out.println("SignInServlet created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Running doPost in SignInServlet");

        String userId = req.getParameter("userId");
        String password = req.getParameter("password");

        System.out.println("User ID : " + userId);

        // DTO creation
        SignInDTO signInDTO = new SignInDTO(userId, password);
        req.setAttribute("signInDTO", signInDTO);

       //invoking service
        SignInService signInService = new SignInServiceImpl();
        signInService.validateAndSave(signInDTO);

        // Success message
        String msg = userId + " signed in successfully..";
        req.setAttribute("message", msg);

        // Servlet chaining
        RequestDispatcher dispatcher = req.getRequestDispatcher("/SignIn.jsp");
        dispatcher.forward(req, resp);
    }
}
