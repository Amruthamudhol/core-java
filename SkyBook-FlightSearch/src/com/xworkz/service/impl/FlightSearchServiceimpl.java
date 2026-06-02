package com.xworkz.service.impl;

import com.xworkz.dao.PlaneDAO;
import com.xworkz.dto.PlaneSearchDTO;
import com.xworkz.service.FlightSearchService;

import java.time.LocalDate;
import java.util.Objects;

public class FlightSearchServiceimpl implements FlightSearchService {
    private PlaneDAO planeDAO;

    public FlightSearchServiceimpl(PlaneDAO planeDAO) {
        this.planeDAO=planeDAO;
    }

    @Override
    public boolean validateAndSave(PlaneSearchDTO dto) {
        System.out.println("validateAndSave in FlightSearchServiceimpl");

        if (Objects.nonNull(this.planeDAO)) {

            System.out.println("planeDAO is not null");

            if (Objects.nonNull(dto)) {

                String from = dto.getFrom();
                String to = dto.getTo();
                LocalDate departureDate = dto.getDepartureDate();
                int passengers = dto.getPassengers();

                if (Objects.nonNull(from) && from.length() >= 3 && Objects.nonNull(to) && to.length() >= 3 && Objects.nonNull(departureDate) && passengers > 0) {

                    System.out.println("DTO is valid");

                    return this.planeDAO.searnch(dto);
                }

                System.err.println("DTO is invalid");

            }
            else {
                System.err.println("DTO is null");
            }

        } else
        {
            System.err.println("planeDAO is null");
        }

        return false;
    }
}
