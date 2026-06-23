package com.xworkz.exception.inbuilt.checked;

public class SingleCatch {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
        }
        catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException Handled");
        }
    }
}
