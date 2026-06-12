package com.xworkz.inventory;

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

        String sqlQuery = "select * from inventory_info";

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_db", "root", "4AI22CS005");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                System.out.println("Item ID : " + resultSet.getInt("item_id"));
                System.out.println("Item Name : " + resultSet.getString("item_name"));
                System.out.println("Quantity : " + resultSet.getInt("quantity"));
                System.out.println("Supplier Name : " + resultSet.getString("supplier_name"));
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