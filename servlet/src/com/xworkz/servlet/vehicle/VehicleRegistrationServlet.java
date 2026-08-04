package com.xworkz.servlet.vehicle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 1, urlPatterns = "/vehicle")
public class VehicleRegistrationServlet extends HttpServlet {
    public VehicleRegistrationServlet() {
        System.out.println("calling  VehicleRegistrationServlet servlet ");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Running doPost()");

        String vehicleNo = req.getParameter("vehicleNo");
        String ownerName = req.getParameter("ownerName");
        String vehicleType = req.getParameter("vehicleType");
        String regDate = req.getParameter("regDate");
        String insuranceDate = req.getParameter("insuranceDate");
        String fuel = req.getParameter("fuel");

        System.out.println("Vehicle Number : " + vehicleNo);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Registration Date : " + regDate);
        System.out.println("Insurance Date : " + insuranceDate);
        System.out.println("Fuel Type : " + fuel);

        LocalDate registration = LocalDate.parse(regDate);
        LocalDate insurance = LocalDate.parse(insuranceDate);

        FuelType fuelType = FuelType.valueOf(fuel);

        boolean vehicleNumberValid = vehicleNo.matches("^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$");

        boolean insuranceValid = insurance.isAfter(LocalDate.now());

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");

        if (!ownerName.isEmpty()
                && !vehicleType.isEmpty()
                && vehicleNumberValid
                && insuranceValid
                && (fuelType == FuelType.PETROL
                || fuelType == FuelType.DIESEL
                || fuelType == FuelType.CNG
                || fuelType == FuelType.ELECTRIC)) {

            System.out.println("Vehicle Registration Successful");

            out.println("<h2>Vehicle Registered Successfully</h2>");
            out.println("<p>Vehicle Number : " + vehicleNo + "</p>");
            out.println("<p>Owner Name : " + ownerName + "</p>");
            out.println("<p>Vehicle Type : " + vehicleType + "</p>");
            out.println("<p>Registration Date : " + registration + "</p>");
            out.println("<p>Insurance Valid Till : " + insurance + "</p>");
            out.println("<p>Fuel Type : " + fuelType + "</p>");

        } else {

            System.out.println("Vehicle Registration Failed");

            out.println("<h2>Registration Failed</h2>");
            out.println("<p>Invalid Vehicle Details</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
