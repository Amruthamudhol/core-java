package com.xworkz.exception.inbuilt.checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultipleCatch {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "1234");
            System.out.println("Connected");
        }

        catch (ClassNotFoundException e) {
            System.err.println("Driver Class Not Found");
        }
        catch (SQLException e) {
            System.err.println("failed connect database");
        }
    }
}
