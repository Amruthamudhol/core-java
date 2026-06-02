package com.xworkz.dao;

import com.xworkz.dto.PlaneSearchDTO;

public class PlaneDAOimpl implements PlaneDAO{
    @Override
    public boolean searnch(PlaneSearchDTO dto) {
        System.out.println("search  in planeDAO ");
        return true;
    }
}
