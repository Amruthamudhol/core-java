package com.xworkz.dao;

import com.xworkz.dto.FlightStatusDTO;

public class FlightStatusDAOImpl implements FlightStatusDAO {
    @Override
    public boolean getStatus(FlightStatusDTO dto) {

        System.out.println("Flight Status Details");
        System.out.println("PNR : " + dto.getPnr());
        System.out.println("Flight Number : " + dto.getFlightNumber());
        System.out.println("Travel Date : " + dto.getTravelDate());

        return true;
    }
}
