package com.xworkz.kmf.service;

import com.xworkz.kmf.dto.KMFDetailsDTO;

public interface KMFDetailsService {

    boolean validateAndSave(KMFDetailsDTO dto);
}
