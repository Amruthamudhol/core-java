package com.xworkz.service;

import com.xworkz.dto.CabSearchDTO;

public interface CabSearchService {
    boolean validateAndSearch(CabSearchDTO dto);
}
