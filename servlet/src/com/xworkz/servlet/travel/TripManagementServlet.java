package com.xworkz.servlet.travel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 1, urlPatterns = "/trip")
public class TripManagementServlet extends HttpServlet {

    public TripManagementServlet() {
        System.out.println("Calling TripManagementServlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String destination = req.getParameter("destination");
        String travelDate = req.getParameter("travelDate");
        String returnDate = req.getParameter("returnDate");
        String travellers = req.getParameter("travellers");
        String budget = req.getParameter("budget");
        String transport = req.getParameter("transport");

        System.out.println("Destination : " + destination);
        System.out.println("Travel Date : " + travelDate);
        System.out.println("Return Date : " + returnDate);
        System.out.println("Travellers : " + travellers);
        System.out.println("Budget : " + budget);
        System.out.println("Transport : " + transport);

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Trip Result</title>");
        out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css'>");
        out.println("</head>");
        out.println("<body style='background:linear-gradient(135deg,#74ebd5,#ACB6E5);'>");

        out.println("<div class='container mt-5'>");
        out.println("<div class='card shadow p-4'>");

        try {

            if (destination == null || destination.trim().isEmpty()
                    || travelDate == null || travelDate.trim().isEmpty()
                    || returnDate == null || returnDate.trim().isEmpty()
                    || travellers == null || travellers.trim().isEmpty()
                    || budget == null || budget.trim().isEmpty()
                    || transport == null || transport.trim().isEmpty()) {

                out.println("<h2 class='text-danger'>All fields are mandatory.</h2>");
                out.println("<a href='trip.html' class='btn btn-primary'>Back</a>");
                out.println("</div></div></body></html>");
                return;
            }

            LocalDate tDate = LocalDate.parse(travelDate);
            LocalDate rDate = LocalDate.parse(returnDate);

            int travellerCount = Integer.parseInt(travellers);
            double totalBudget = Double.parseDouble(budget);

            TransportMode mode = TransportMode.valueOf(transport);

            boolean validDate = rDate.isAfter(tDate);
            boolean validTraveller = travellerCount > 0;
            boolean validBudget = totalBudget > 0;

            if (validDate && validTraveller && validBudget) {

                out.println("<h2 class='text-success'>Trip Booking Successful</h2>");
                out.println("<hr>");
                out.println("<p><b>Destination :</b> " + destination + "</p>");
                out.println("<p><b>Travel Date :</b> " + tDate + "</p>");
                out.println("<p><b>Return Date :</b> " + rDate + "</p>");
                out.println("<p><b>Travellers :</b> " + travellerCount + "</p>");
                out.println("<p><b>Budget :</b> ₹" + totalBudget + "</p>");
                out.println("<p><b>Transport Mode :</b> " + mode + "</p>");

            } else {

                out.println("<h2 class='text-danger'>Trip Booking Failed</h2>");

                if (!validDate) {
                    out.println("<p>Return date must be after Travel date.</p>");
                }

                if (!validTraveller) {
                    out.println("<p>Traveller count must be greater than 0.</p>");
                }

                if (!validBudget) {
                    out.println("<p>Budget must be greater than 0.</p>");
                }
            }

        } catch (NumberFormatException e) {

            out.println("<h2 class='text-danger'>Invalid Number Format</h2>");
            out.println("<p>Please enter valid numbers for Travellers and Budget.</p>");

        } catch (IllegalArgumentException e) {

            out.println("<h2 class='text-danger'>Invalid Transport Mode</h2>");
            out.println("<p>Please select a valid transport mode.</p>");

        } catch (Exception e) {

            out.println("<h2 class='text-danger'>Error</h2>");
            out.println("<p>" + e.getMessage() + "</p>");
        }

        out.println("<br>");
        out.println("<a href='trip.html' class='btn btn-primary'>Book Another Trip</a> ");
        out.println("<a href='index.html' class='btn btn-secondary ms-2'>Home</a>");

        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}