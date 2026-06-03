package com.xworkz.runner;

import com.xworkz.constant.TripType;
import com.xworkz.dao.CabDAO;
import com.xworkz.dao.CabDAOImpl;
import com.xworkz.dto.CabSearchDTO;
import com.xworkz.service.CabSearchService;
import com.xworkz.service.CabSearchServiceImpl;

import java.time.LocalDate;

public class CabSearchRunner {

    public static void main(String[] args) {

        CabDAO cabDAO = new CabDAOImpl();
        CabSearchService cabService = new CabSearchServiceImpl(cabDAO);
        CabSearchDTO dto = new CabSearchDTO(TripType.CITY_TO_AIRPORT, "Bangalore", "Kempegowda Airport", LocalDate.of(2026, 6, 3), "11:00 AM");
        cabService.validateAndSearch(dto);
    }
}