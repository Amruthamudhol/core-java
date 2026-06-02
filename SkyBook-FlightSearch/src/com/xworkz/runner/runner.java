package com.xworkz.runner;

import com.xworkz.dao.PlaneDAO;
import com.xworkz.dao.PlaneDAOimpl;
import com.xworkz.dto.PlaneSearchDTO;
import com.xworkz.service.FlightSearchService;
import com.xworkz.service.impl.FlightSearchServiceimpl;

import java.time.LocalDate;

public class runner {

    public static void main(String[] args) {

        PlaneDAO planeDAO = new PlaneDAOimpl();

        FlightSearchService planeService = new FlightSearchServiceimpl(planeDAO);

        PlaneSearchDTO planeSearchDTO = new PlaneSearchDTO();

        planeSearchDTO.setFrom("Delhi");
        planeSearchDTO.setTo("Bangalore");
        planeSearchDTO.setPassengers(1);
        planeSearchDTO.setDepartureDate(LocalDate.now());

        planeService.validateAndSave(planeSearchDTO);
    }
}