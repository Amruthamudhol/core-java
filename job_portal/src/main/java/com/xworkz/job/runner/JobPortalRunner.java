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

        JobPortalDTO insertDto = new JobPortalDTO();

        insertDto.setCandidateName("Ananya");
        insertDto.setSkill("Python");
        insertDto.setCompanyName("TCS");
        insertDto.setExpectedSalary(500000.0);

        boolean insertResult = dao.insert(insertDto);
        System.out.println("Insert Result : " + insertResult);


        JobPortalDTO updateDto = new JobPortalDTO();
        updateDto.setCandidateName("Amruta");
        updateDto.setExpectedSalary(800000.0);
        boolean updateResult = dao.update(updateDto);
        System.out.println("Update Result : " + updateResult);


        JobPortalDTO deleteDto = new JobPortalDTO();
        deleteDto.setCandidateName("Ananya");
        boolean deleteResult = dao.delete(deleteDto);
        System.out.println("Delete Result : " + deleteResult);


        dao = new JobPortalDAOImpl();
        JobPortalDTO dto = dao.select("Amruta");
    }
}