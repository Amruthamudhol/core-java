package com.xworkz.dao;

import com.xworkz.dto.FlightStatusDTO;

public interface FlightStatusDAO {
    boolean getStatus(FlightStatusDTO dto);
}
