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

        HotelSearchDTO dto = new HotelSearchDTO();

        dto.setDestination("Goa");
        dto.setCheckInDate(LocalDate.of(2026, 6, 3));
        dto.setCheckOutDate(LocalDate.of(2026, 6, 4));
        dto.setAdults(2);
        dto.setRooms(1);
        service.validateAndSearch(dto);
    }

}
