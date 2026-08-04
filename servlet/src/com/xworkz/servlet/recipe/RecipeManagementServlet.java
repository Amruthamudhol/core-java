package com.xworkz.servlet.recipe;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1, urlPatterns = "/recipe")
public class RecipeManagementServlet extends HttpServlet {
    public RecipeManagementServlet() {
        System.out.println("calling RecipeManagementServlet constructor ");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String recipeName = req.getParameter("recipeName");
        String cuisine = req.getParameter("cuisine");
        String cookingTime = req.getParameter("time");
        String difficulty = req.getParameter("difficulty");
        String ingredients = req.getParameter("ingredients");
        String calories = req.getParameter("calories");

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        out.println("<html><body>");

        try {

            int time = Integer.parseInt(cookingTime);
            int ingredientCount = Integer.parseInt(ingredients);
            int calorieCount = Integer.parseInt(calories);

            if (difficulty == null || difficulty.trim().isEmpty()) {
                out.println("<h2>Please select Difficulty Level.</h2>");
                out.println("</body></html>");
                return;
            }

            DifficultyLevel level = DifficultyLevel.valueOf(difficulty.trim().toUpperCase());

            if (!recipeName.trim().isEmpty()
                    && !cuisine.trim().isEmpty()
                    && time > 0
                    && ingredientCount > 0
                    && calorieCount >= 50
                    && calorieCount <= 2000) {

                out.println("<h2 style='color:green'>Recipe Submitted Successfully</h2>");
                out.println("<hr>");
                out.println("<p><b>Recipe Name:</b> " + recipeName + "</p>");
                out.println("<p><b>Cuisine:</b> " + cuisine + "</p>");
                out.println("<p><b>Cooking Time:</b> " + time + " Minutes</p>");
                out.println("<p><b>Difficulty:</b> " + level + "</p>");
                out.println("<p><b>Ingredients:</b> " + ingredientCount + "</p>");
                out.println("<p><b>Calories:</b> " + calorieCount + "</p>");

            } else {

                out.println("<h2 style='color:red'>Invalid Recipe Details</h2>");

            }

        } catch (IllegalArgumentException e) {

            out.println("<h2 style='color:red'>Invalid Difficulty Level</h2>");

        }

        out.println("</body></html>");
    }
}
