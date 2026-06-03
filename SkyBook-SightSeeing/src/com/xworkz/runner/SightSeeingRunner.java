package com.xworkz.runner;

import com.xworkz.dao.SightSeeingDAO;
import com.xworkz.dao.SightSeeingDAOImpl;
import com.xworkz.dto.SightSeeingDTO;
import com.xworkz.service.SightSeeingService;
import com.xworkz.service.SightSeeingServiceImpl;

import java.time.LocalDate;

public class SightSeeingRunner {

    public static void main(String[] args) {

        SightSeeingDAO dao = new SightSeeingDAOImpl();

        SightSeeingService service = new SightSeeingServiceImpl(dao);

        SightSeeingDTO dto = new SightSeeingDTO("Mysore Palace", LocalDate.of(2026, 6, 3));
        service.validateAndSearch(dto);
    }
}