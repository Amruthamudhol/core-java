package com.xworkz.runner;

import com.xworkz.dao.HotelDAO;
import com.xworkz.dao.HotelDAOImpl;
import com.xworkz.dto.HotelSearchDTO;
import com.xworkz.service.HotelSearchService;
import com.xworkz.service.HotelSearchServiceImpl;

import java.time.LocalDate;

public class HotelRunner {

    public static void main(String[] args) {

        HotelDAO hotelDAO = new HotelDAOImpl();

        HotelSearchService service = new HotelSearchServiceImpl(hotelDAO);

        HotelSearchDTO dto = new HotelSearchDTO("Goa", LocalDate.of(2026, 6, 3), LocalDate.of(2026, 6, 4),
                2, 1, "PNR12345");

        service.validateAndSearch(dto);
    }
}