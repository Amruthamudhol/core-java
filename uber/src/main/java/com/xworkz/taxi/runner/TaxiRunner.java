package com.xworkz.taxi.runner;

import com.xworkz.taxi.dao.TaxiDAOImpl;
import com.xworkz.taxi.dto.TaxiDetailsDTO;

public class TaxiRunner {

    public static void main(String[] args) {

        TaxiDAOImpl dao = new TaxiDAOImpl();

        TaxiDetailsDTO dto = new TaxiDetailsDTO();

        dto.setDriverName("Amruta");
        dto.setCarModel("BMW");
        dto.setLicensePlate("KA-01-AB-1234");
        dto.setFarePerKm(15.0);

        boolean saved = dao.save(dto);
        System.out.println("Taxi details saved: " + saved);

        dto.setFarePerKm(25.0);
        boolean updated = dao.update(dto);
        System.out.println("Taxi details updated: " + updated);

        boolean deleted = dao.delete(dto);
        System.out.println("Taxi details deleted: " + deleted);
    }

}