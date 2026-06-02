package com.xworkz.service;

import com.xworkz.dao.HotelDAO;
import com.xworkz.dto.HotelSearchDTO;
import com.xworkz.service.HotelSearchService;
import java.util.Objects;


public class HotelSearchServiceImpl implements HotelSearchService {
    private HotelDAO hotelDAO;

    public HotelSearchServiceImpl(HotelDAO hotelDAO) {
        this.hotelDAO = hotelDAO;
    }

    @Override
    public boolean validateAndSearch(HotelSearchDTO dto) {

        if (Objects.nonNull(this.hotelDAO)) {

            if (Objects.nonNull(dto)) {

                if (Objects.nonNull(dto.getDestination()) && dto.getDestination().length() >= 3 && Objects.nonNull(dto.getCheckInDate())
                        && Objects.nonNull(dto.getCheckOutDate()) && dto.getAdults() > 0 && dto.getRooms() > 0) {

                    return this.hotelDAO.search(dto);
                }

                System.err.println("DTO is invalid");
            }
            else {
                System.err.println("DTO is null");
            }
        }
        else {
            System.err.println("HotelDAO is null");
        }

        return false;
    }

}
