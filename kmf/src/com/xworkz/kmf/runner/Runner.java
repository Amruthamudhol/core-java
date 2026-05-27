package com.xworkz.kmf.runner;

import com.xworkz.kmf.dto.KMFDetailsDTO;
import com.xworkz.kmf.service.KMFDetailsService;
import com.xworkz.kmf.service.KMFDetailsServiceImpl;

public class Runner {

    public static void main(String[] args) {

        KMFDetailsService kmfDetailsService = new KMFDetailsServiceImpl();

        KMFDetailsDTO kmfDetailsDTO = new KMFDetailsDTO(1, "Nandini Dairy", "Bangalore", 5000.0, "Ramesh");

        kmfDetailsService.validateAndSave(kmfDetailsDTO);
    }
}
