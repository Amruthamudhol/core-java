package com.xworkz.hospital.runner;

import com.xworkz.hospital.dao.HospitalDAOImpl;
import com.xworkz.hospital.dto.HospitalDetailsDTO;

public class HospitalRunner {

    public static void main(String[] args) {

        HospitalDAOImpl dao = new HospitalDAOImpl();

        HospitalDetailsDTO saveDto = new HospitalDetailsDTO();
        saveDto.setPatientName("Ramesh");
        saveDto.setDoctorName("Dr. Priya");
        saveDto.setDisease("Fever");
        saveDto.setConsultation(500.0);

        boolean saveResult = dao.save(saveDto);
        System.out.println("Save Result : " + saveResult);

        HospitalDetailsDTO updateDto = new HospitalDetailsDTO();
        updateDto.setPatientName("Ramesh");
        updateDto.setConsultation(700.0);

        boolean updateResult = dao.update(updateDto);
        System.out.println("Update Result : " + updateResult);
        HospitalDetailsDTO deleteDto = new HospitalDetailsDTO();

        deleteDto.setPatientName("Ramesh");
        boolean deleteResult = dao.delete(deleteDto);
        System.out.println("Delete Result : " + deleteResult);
    }
}