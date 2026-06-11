package com.xworkz.dao;

import com.xworkz.dto.PlaneSearchDTO;

public class PlaneDAOimpl implements PlaneDAO{
    @Override
    public boolean search(PlaneSearchDTO dto) {
        System.out.println("search  in planeDAO ");

        System.out.println("Trip Type : " + dto.getTripType());
        System.out.println("Currency : " + dto.getCurrency());
        System.out.println("From : " + dto.getFrom());
        System.out.println("To : " + dto.getTo());
        System.out.println("Departure Date : " + dto.getDepartureDate());
        System.out.println("Return Date : " + dto.getReturnDate());
        System.out.println("Passengers : " + dto.getPassengers());
        return true;
    }
}
