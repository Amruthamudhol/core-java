package com.xworkz.exception.inbuilt.checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Amruta");
            System.out.println("Connected");
        }
        catch (ClassNotFoundException | SQLException e) {
            System.err.println("Exception Handled");
        }
    }
}
