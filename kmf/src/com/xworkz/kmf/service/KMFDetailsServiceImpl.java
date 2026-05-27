package com.xworkz.kmf.service;

import com.xworkz.kmf.dto.KMFDetailsDTO;

public class KMFDetailsServiceImpl implements KMFDetailsService{
    @Override
    public boolean validateAndSave(KMFDetailsDTO dto) {
        System.out.println("KMF Details are :" + dto);
        return false;
    }
}
