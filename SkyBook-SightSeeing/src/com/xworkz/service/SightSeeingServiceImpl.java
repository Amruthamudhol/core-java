package com.xworkz.service;

import com.xworkz.dao.SightSeeingDAO;
import com.xworkz.dto.SightSeeingDTO;

import java.util.Objects;

public class SightSeeingServiceImpl implements SightSeeingService{
    private SightSeeingDAO sightSeeingDAO;

    public SightSeeingServiceImpl(SightSeeingDAO sightSeeingDAO) {
        this.sightSeeingDAO = sightSeeingDAO;
    }

    @Override
    public boolean validateAndSearch(SightSeeingDTO dto) {

        System.out.println("validateAndSearch in SightSeeingServiceImpl");

        if (Objects.nonNull(this.sightSeeingDAO)) {
            System.out.println("DAO is not null");
            if (Objects.nonNull(dto)) {

                String placeName = dto.getPlaceName();

                if (Objects.nonNull(placeName) && placeName.length() >= 3 && Objects.nonNull(dto.getTripDate())) {
                    System.out.println("DTO is valid");

                    return this.sightSeeingDAO.search(dto);
                }

                System.err.println("DTO is invalid");

            }
            else {
                System.err.println("DTO is null");
            }

        }
        else {
            System.err.println("DAO is null");
        }

        return false;
    }
}
