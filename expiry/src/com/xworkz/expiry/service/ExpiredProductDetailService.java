package com.xworkz.expiry.service;

import com.xworkz.expiry.dto.ExpiredProductDetailDTO;

public interface ExpiredProductDetailService {

    boolean validateAndSave(ExpiredProductDetailDTO dto);
}
