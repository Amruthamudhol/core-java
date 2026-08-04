package com.xworkz.servlet.event;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 1, urlPatterns = "/event")
public class EventManagementServlet extends HttpServlet {
    public EventManagementServlet() {
        System.out.println("calling EventManagementServlet constructor ");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Running doPost()");

        String eventName = req.getParameter("eventName");
        String organizer = req.getParameter("organizer");
        String eventDate = req.getParameter("eventDate");
        String venue = req.getParameter("venue");
        String capacity = req.getParameter("capacity");
        String fee = req.getParameter("fee");

        System.out.println("Event Name : " + eventName);
        System.out.println("Organizer : " + organizer);
        System.out.println("Event Date : " + eventDate);
        System.out.println("Venue : " + venue);
        System.out.println("Capacity : " + capacity);
        System.out.println("Registration Fee : " + fee);

        LocalDate date = LocalDate.parse(eventDate);
        int cap = Integer.parseInt(capacity);
        double registrationFee = Double.parseDouble(fee);

        boolean futureDate = date.isAfter(LocalDate.now());
        boolean validCapacity = cap > 0;
        boolean validFee = registrationFee >= 0;

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");

        if (!eventName.isEmpty() && !organizer.isEmpty() && !venue.isEmpty() && futureDate && validCapacity && validFee) {

            System.out.println("Event Registration Successful");

            out.println("<h2>Event Registered Successfully</h2>");
            out.println("<p>Event Name : " + eventName + "</p>");
            out.println("<p>Organizer : " + organizer + "</p>");
            out.println("<p>Event Date : " + date + "</p>");
            out.println("<p>Venue : " + venue + "</p>");
            out.println("<p>Capacity : " + cap + "</p>");
            out.println("<p>Registration Fee : " + registrationFee + "</p>");

        } else {

            System.out.println("Event Registration Failed");

            out.println("<h2>Registration Failed</h2>");
            out.println("<p>Invalid Event Details</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
