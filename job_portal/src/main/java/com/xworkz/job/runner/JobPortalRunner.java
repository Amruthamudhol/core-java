package com.xworkz.job.runner;

import com.xworkz.job.dao.JobPortalDAO;
import com.xworkz.job.dao.JobPortalDAOImpl;
import com.xworkz.job.dto.JobPortalDTO;

public class JobPortalRunner {

    public static void main(String[] args) {

        JobPortalDAO dao = new JobPortalDAOImpl();
        JobPortalDTO saveDto = new JobPortalDTO();

        saveDto.setCandidateName("Amruta");
        saveDto.setSkill("Java Full Stack");
        saveDto.setCompanyName("Infosys");
        saveDto.setExpectedSalary(600000.0);

        boolean saveResult = dao.save(saveDto);
        System.out.println("Save Result : " + saveResult);

        JobPortalDTO updateDto = new JobPortalDTO();
        updateDto.setCandidateName("Amruta");
        updateDto.setExpectedSalary(800000.0);

        boolean updateResult = dao.update(updateDto);
        System.out.println("Update Result : " + updateResult);


        JobPortalDTO deleteDto = new JobPortalDTO();
        deleteDto.setCandidateName("Amruta");
        boolean deleteResult = dao.delete(deleteDto);
        System.out.println("Delete Result : " + deleteResult);
    }
}