package com.xworkz.service;

import com.xworkz.dto.HotelSearchDTO;

public interface HotelSearchService {
    boolean validateAndSearch(HotelSearchDTO dto);
}
