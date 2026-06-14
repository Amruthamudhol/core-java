package com.xworkz.hospital.dao;

import com.xworkz.hospital.dto.HospitalDetailsDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HospitalDAOImpl implements HospitalDetailsDAO {

    @Override
    public boolean save(HospitalDetailsDTO hospitalDetailsDTO) {
        System.out.println("Saving hospital details : " + hospitalDetailsDTO);
        boolean isSaved = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db", "root", "4AI22CS005");

            String insertQuery = "insert into hospital_details(patient_name,doctor_name,disease,consultation) values(?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, hospitalDetailsDTO.getPatientName());
            preparedStatement.setString(2, hospitalDetailsDTO.getDoctorName());
            preparedStatement.setString(3, hospitalDetailsDTO.getDisease());
            preparedStatement.setDouble(4, hospitalDetailsDTO.getConsultation());

            boolean result = preparedStatement.execute();

            if (!result) {
                isSaved = true;
                System.out.println("Data Saved Successfully");
            }

            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return isSaved;
    }

    @Override
    public boolean update(HospitalDetailsDTO hospitalDetailsDTO) {

        System.out.println("Update method : " + hospitalDetailsDTO);

        boolean isUpdated = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db", "root", "4AI22CS005");

            String updateQuery = "update hospital_details set consultation_fee=? where patient_name=?";

            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setDouble(1, hospitalDetailsDTO.getConsultation());
            preparedStatement.setString(2, hospitalDetailsDTO.getPatientName());

            boolean result = preparedStatement.execute();

            if (!result) {
                isUpdated = true;
                System.out.println("Data Updated Successfully");
            }

            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return isUpdated;
    }

    @Override
    public boolean delete(HospitalDetailsDTO hospitalDetailsDTO) {

        System.out.println("Delete method : " + hospitalDetailsDTO);

        boolean isDeleted = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db", "root", "4AI22CS005");

            String deleteQuery = "delete from hospital_details where patient_name=?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1, hospitalDetailsDTO.getPatientName());

            boolean result = preparedStatement.execute();

            if (!result) {
                isDeleted = true;
                System.out.println("Data Deleted Successfully");
            }

            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return isDeleted;
    }
}