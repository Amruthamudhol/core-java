package com.xworkz.movie.runner;

import com.xworkz.movie.dao.MovieDAOImpl;
import com.xworkz.movie.dao.MovieDetailsDAO;
import com.xworkz.movie.dto.MovieDetailsDTO;

public class MovieRunner {

    public static void main(String[] args) {

        MovieDetailsDAO dao = new MovieDAOImpl();
        MovieDetailsDTO saveDto = new MovieDetailsDTO();

        saveDto.setMovieName("Kantara");
        saveDto.setDirectorName("Rishab Shetty");
        saveDto.setLanguage("Kannada");
        saveDto.setTicketPrice(250.0);

        boolean saveResult = dao.save(saveDto);
        System.out.println("Save Result : " + saveResult);

        MovieDetailsDTO updateDto = new MovieDetailsDTO();

        updateDto.setMovieName("Kantara");
        updateDto.setTicketPrice(300.0);
        boolean updateResult = dao.update(updateDto);
        System.out.println("Update Result : " + updateResult);

        MovieDetailsDTO deleteDto = new MovieDetailsDTO();
        deleteDto.setMovieName("Kantara");
        boolean deleteResult = dao.delete(deleteDto);
        System.out.println("Delete Result : " + deleteResult);
    }
}