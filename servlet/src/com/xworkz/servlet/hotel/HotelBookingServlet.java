package com.xworkz.servlet.hotel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 1,urlPatterns = "/booking")
public class HotelBookingServlet extends HttpServlet {
    public HotelBookingServlet() {
        System.out.println("created HotelBookingServlet construtor");
    }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

            System.out.println("Running doPost() in BookingServlet");

            String guestName = req.getParameter("gname");
            String checkInDate = req.getParameter("cidate");
            String checkOutDate = req.getParameter("codate");
            String roomType = req.getParameter("room");
            String guestNo = req.getParameter("guestno");
            String amount = req.getParameter("amount");

            System.out.println("Guest Name : " + guestName);
            System.out.println("Check In Date : " + checkInDate);
            System.out.println("Check Out Date : " + checkOutDate);
            System.out.println("Room Type : " + roomType);
            System.out.println("Guest Count : " + guestNo);
            System.out.println("Amount : " + amount);

            LocalDate inDate = LocalDate.parse(checkInDate);
            LocalDate outDate = LocalDate.parse(checkOutDate);

            int guests = Integer.parseInt(guestNo);
            double totalAmount = Double.parseDouble(amount);

            boolean validGuest = false;

            if (roomType.equals("Single") && guests == 1) {
                validGuest = true;
            }

            if (roomType.equals("Double") && guests <= 2) {
                validGuest = true;
            }

            if (roomType.equals("Family") && guests <= 5) {
                validGuest = true;
            }

            PrintWriter out = resp.getWriter();

            out.println("<html>");
            out.println("<body>");

            if (!guestName.isEmpty()
                    && inDate.isBefore(outDate)
                    && validGuest
                    && totalAmount > 0) {

                System.out.println("Booking Successful");

                out.println("<h2>Booking Successful</h2>");
                out.println("<h3>Booking Details</h3>");
                out.println("<p>Guest Name : " + guestName + "</p>");
                out.println("<p>Room Type : " + roomType + "</p>");
                out.println("<p>Guests : " + guests + "</p>");
                out.println("<p>Check In : " + inDate + "</p>");
                out.println("<p>Check Out : " + outDate + "</p>");
                out.println("<p>Total Amount : " + totalAmount + "</p>");

            } else {

                System.out.println("Booking Failed");

                out.println("<h2>Booking Failed</h2>");
                out.println("<p>Invalid Booking Details</p>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }
