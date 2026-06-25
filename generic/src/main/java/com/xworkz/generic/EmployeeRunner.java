package com.xworkz.generic;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee<Integer, String, Double> emp = new Employee<>();
        emp.id = 101;
        emp.name = "Amruta";
        emp.salary = 45000.0;

        System.out.println(emp.id);
        System.out.println(emp.name);
        System.out.println(emp.salary);

        Employee<String, String, Integer> emp1 = new Employee<>();
        emp1.id = "E102";
        emp1.name = "Rachan";
        emp1.salary = 50000;

        System.out.println(emp1.id);
        System.out.println(emp1.name);
        System.out.println(emp1.salary);
    }
}
