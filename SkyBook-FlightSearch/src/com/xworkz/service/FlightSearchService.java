package com.xworkz.service;

import com.xworkz.dto.PlaneSearchDTO;

public interface FlightSearchService {
    boolean validateAndSave(PlaneSearchDTO dto);
}
