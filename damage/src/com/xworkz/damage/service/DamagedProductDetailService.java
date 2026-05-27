package com.xworkz.damage.service;

import com.xworkz.damage.dto.DamagedProductDetailDTO;

public interface DamagedProductDetailService {

    boolean validateAndSave(DamagedProductDetailDTO dto);
}
