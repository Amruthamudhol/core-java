package com.xworkz.dao;

import com.xworkz.dto.SightSeeingDTO;

public class SightSeeingDAOImpl implements SightSeeingDAO{

    @Override
    public boolean search(SightSeeingDTO dto) {

        System.out.println("Sight Seeing Search Details");
        System.out.println("Place Name : " + dto.getPlaceName());
        System.out.println("Trip Date  : " + dto.getTripDate());

        return true;
    }
}
