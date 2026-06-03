package com.xworkz.service;

import com.xworkz.dao.CabDAO;
import com.xworkz.dto.CabSearchDTO;

import java.util.Objects;

public class CabSearchServiceImpl implements CabSearchService{
    private CabDAO cabDAO;

    public CabSearchServiceImpl(CabDAO cabDAO) {
        this.cabDAO = cabDAO;
    }

    @Override
    public boolean validateAndSearch(CabSearchDTO dto) {

        System.out.println("validateAndSearch in CabSearchServiceImpl");

        if (Objects.nonNull(this.cabDAO)) {
            System.out.println("cabDAO is not null");
            if (Objects.nonNull(dto)) {
                System.out.println("DTO is not null");

                if (Objects.nonNull(dto.getTripType()) && Objects.nonNull(dto.getFrom())
                        && dto.getFrom().length() >= 3
                        && Objects.nonNull(dto.getTo())
                        && dto.getTo().length() >= 3)
                {
                    System.out.println("DTO is valid");
                    return this.cabDAO.search(dto);
                }

                System.err.println("DTO is invalid");
            }
            else {
                System.err.println("DTO is null");
            }
        }
        else {
            System.err.println("cabDAO is null");
        }

        return false;
    }
}
