package com.xworkz.exception.inbuilt.checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
            System.out.println("Connected");
        } catch (SQLException e) {
            System.err.println("SQL Exception Handled");
        }
    }
}
