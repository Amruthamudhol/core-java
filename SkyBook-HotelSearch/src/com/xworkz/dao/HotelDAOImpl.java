package com.xworkz.dao;

import com.xworkz.dto.HotelSearchDTO;

public class HotelDAOImpl implements HotelDAO{
    @Override
    public boolean search(HotelSearchDTO dto) {
        System.out.println("Searching Hotels");
        System.out.println("Destination : " + dto.getDestination());
        System.out.println("Check-In Date : " + dto.getCheckInDate());
        System.out.println("Check-Out Date : " + dto.getCheckOutDate());
        System.out.println("Adults : " + dto.getAdults());
        System.out.println("Rooms : " + dto.getRooms());
        System.out.println("PNR : " + dto.getPnr());

        return false;
    }
}
