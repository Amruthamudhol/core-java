package com.xworkz.userManagementSystem.servlet;

import com.xworkz.userManagementSystem.dto.SignInDTO;
import com.xworkz.userManagementSystem.service.SignInService;
import com.xworkz.userManagementSystem.service.SignInServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/signin")
public class SignInServlet extends HttpServlet {

    public SignInServlet() {
        System.out.println("SignInServlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Running doPost in SignInServlet");

        // Get form data
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");

        System.out.println("User ID : " + userId);

        // DTO creation
        SignInDTO signInDTO = new SignInDTO(userId, password);

        // Create service object
        SignInService signInService = new SignInServiceImpl();

        // Validate login
        boolean valid = signInService.validateAndSave(signInDTO);
        // Request Scope
        req.setAttribute("reqData", "This is request scope data");

        // Session Scope
        HttpSession session = req.getSession();

        if (valid) {

            String msg = userId + " Signed in successfully..";
            session.setAttribute("userId", userId);
            session.setAttribute("message", msg);

            System.out.println("Login successful");

        } else {

            String msg = userId + " signed in failed..";
            session.setAttribute("message", msg);
            System.out.println("Login failed");
        }


        // Forward to SignIn.jsp
        RequestDispatcher dispatcher = req.getRequestDispatcher("/SignIn.jsp");
        dispatcher.forward(req, resp);
    }
}