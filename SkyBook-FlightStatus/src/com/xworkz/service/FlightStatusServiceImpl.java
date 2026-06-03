package com.xworkz.service;

import com.xworkz.dao.FlightStatusDAO;
import com.xworkz.dto.FlightStatusDTO;

import java.util.Objects;

public class FlightStatusServiceImpl implements FlightStatusService {
    private FlightStatusDAO flightStatusDAO;

    public FlightStatusServiceImpl(FlightStatusDAO flightStatusDAO) {
        this.flightStatusDAO = flightStatusDAO;
    }

    @Override
    public boolean validateAndGetStatus(FlightStatusDTO dto) {

        System.out.println("validateAndGetStatus in FlightStatusServiceImpl");

        if (Objects.nonNull(this.flightStatusDAO)) {
            System.out.println("flightStatusDAO is not null");
            if (Objects.nonNull(dto)) {
                System.out.println("DTO is not null");

                if (Objects.nonNull(dto.getPnr()) && dto.getPnr().length() >= 5 && Objects.nonNull(dto.getTravelDate())) {
                    System.out.println("DTO is valid");
                    return this.flightStatusDAO.getStatus(dto);
                }

                System.err.println("DTO is invalid");
            }
            else {
                System.err.println("DTO is null");
            }
        }
        else {
            System.err.println("flightStatusDAO is null");
        }

        return false;
    }
}
