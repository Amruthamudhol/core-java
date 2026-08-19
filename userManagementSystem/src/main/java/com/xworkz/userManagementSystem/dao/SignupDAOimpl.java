package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.SignupEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignupDAOimpl implements SignupDAO {

    @Override
    public boolean save(SignupEntity signupEntity) {

        System.out.println("Running save in SignupDAOimpl");
        System.out.println("signupEntity : " + signupEntity);

        boolean isSaved = false;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_management_system", "root", "4AI22CS005");
            System.out.println("Database connected successfully");
            String insertQuery = "insert into signup(userid,email,password,confirmpassword) values(?,?,?,?)";


            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, signupEntity.getUserId());
            preparedStatement.setString(2, signupEntity.getEmail());
            preparedStatement.setString(3, signupEntity.getPassword());
            preparedStatement.setString(4, signupEntity.getConfirmPassword());

            int result = preparedStatement.executeUpdate();

            System.out.println("Rows inserted: " + result);

            if (result > 0) {
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
}