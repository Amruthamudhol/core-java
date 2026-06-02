package com.xworkz.dao;

import com.xworkz.dto.HotelSearchDTO;

public interface HotelDAO {
    boolean search(HotelSearchDTO dto);
}
