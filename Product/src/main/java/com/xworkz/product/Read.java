package com.xworkz.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sqlQuery = "select * from product_info";

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db", "root", "4AI22CS005");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                System.out.println("Product ID : " + resultSet.getInt("product_id"));
                System.out.println("Product Name : " + resultSet.getString("product_name"));
                System.out.println("Company Name : " + resultSet.getString("company_name"));
                System.out.println("Price : " + resultSet.getDouble("price"));
                System.out.println("----------");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (resultSet != null)
                    resultSet.close();

                if (statement != null)
                    statement.close();

                if (connection != null)
                    connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}