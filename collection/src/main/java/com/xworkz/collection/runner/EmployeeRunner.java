package com.xworkz.collection.runner;

import com.xworkz.collection.dto.EmployeeDTO;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRunner {
    public static void main(String[] args) {

        EmployeeDTO employeeDTO1 = new EmployeeDTO("101", "Amruta", "Development", "Java Developer", 55000);
        EmployeeDTO employeeDTO2 = new EmployeeDTO("102", "Rahul", "Testing", "QA Engineer", 45000);
        EmployeeDTO employeeDTO3 = new EmployeeDTO("103", "Sneha", "HR", "HR ", 40000);
        EmployeeDTO employeeDTO4 = new EmployeeDTO("104", "Kiran", "Support", "Support Engineer", 38000);
        EmployeeDTO employeeDTO5 = new EmployeeDTO("105", "Priya", "Development", "Senior Developer", 70000);


        Set<EmployeeDTO> employeeDTOs = new HashSet<>();

        employeeDTOs.add(employeeDTO1);
        employeeDTOs.add(employeeDTO2);
        employeeDTOs.add(employeeDTO3);
        employeeDTOs.add(employeeDTO4);
        employeeDTOs.add(new EmployeeDTO("E106", "Anil", "Admin", "Administrator", 50000));
        employeeDTOs.add(employeeDTO5);

        System.out.println("Total Employees : " + employeeDTOs.size());

        for (EmployeeDTO employee : employeeDTOs) {
            System.out.println(employee);
        }
    }
}
