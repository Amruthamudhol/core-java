package com.xworkz.runner;

import com.xworkz.dao.FlightStatusDAO;
import com.xworkz.dao.FlightStatusDAOImpl;
import com.xworkz.dto.FlightStatusDTO;
import com.xworkz.service.FlightStatusService;
import com.xworkz.service.FlightStatusServiceImpl;

import java.time.LocalDate;

public class FlightStatusRunner {
    public static void main(String[] args) {

        FlightStatusDTO dto = new FlightStatusDTO();

        dto.setPnr("PNR12345");
        dto.setTravelDate(LocalDate.now());

        FlightStatusDAO dao = new FlightStatusDAOImpl();

        FlightStatusService service = new FlightStatusServiceImpl(dao);

        boolean result = service.validateAndGetStatus(dto);

        System.out.println("Result : " + result);
    }
}
