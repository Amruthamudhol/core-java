package com.xworkz.runner;

import com.xworkz.constants.Currency;
import com.xworkz.constants.TripType;
import com.xworkz.dao.PlaneDAO;
import com.xworkz.dao.PlaneDAOimpl;
import com.xworkz.dto.PlaneSearchDTO;
import com.xworkz.service.FlightSearchService;
import com.xworkz.service.impl.FlightSearchServiceimpl;


import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {

        PlaneDAO planeDAO = new PlaneDAOimpl();

        FlightSearchService planeService = new FlightSearchServiceimpl(planeDAO);

        PlaneSearchDTO planeSearchDTO = new PlaneSearchDTO(TripType.ONE_WAY, Currency.INR,
                "Delhi", "Bangalore",
                LocalDate.of(2026, 6, 3),
                LocalDate.of(2026, 6, 10),
                1
        );

        planeService.validateAndSave(planeSearchDTO);
    }
}
