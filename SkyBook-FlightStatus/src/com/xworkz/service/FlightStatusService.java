package com.xworkz.service;

import com.xworkz.dto.FlightStatusDTO;

public interface FlightStatusService {
    boolean validateAndGetStatus(FlightStatusDTO dto);
}
