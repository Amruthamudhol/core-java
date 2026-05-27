package com.xworkz.order.service;

import com.xworkz.order.dto.OrderDetailDTO;

public interface OrderDetailService {

    boolean validateAndSave(OrderDetailDTO dto);
}
