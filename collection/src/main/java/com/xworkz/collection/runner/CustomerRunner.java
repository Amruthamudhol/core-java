package com.xworkz.collection.runner;

import com.xworkz.collection.dto.CustomerDTO;

import java.util.ArrayList;
import java.util.Collection;

public class CustomerRunner {
    public static void main(String[] args) {

        CustomerDTO customerDTO1 = new CustomerDTO("C101", "Amruta", "amruta@gmail.com", 9876543210L, "Bengaluru");
        CustomerDTO customerDTO2 = new CustomerDTO("C102", "Rahul", "rahul@gmail.com", 9876501234L, "Mysuru");
        CustomerDTO customerDTO3 = new CustomerDTO("C103", "Sneha", "sneha@gmail.com", 9988776655L, "Hubli");
        CustomerDTO customerDTO4 = new CustomerDTO("C104", "Kiran", "kiran@gmail.com", 9123456789L, "Dharwad");
        CustomerDTO customerDTO5 = new CustomerDTO("C105", "Priya", "priya@gmail.com", 9012345678L, "Belagavi");

        Collection<CustomerDTO> customerDTOs = new ArrayList<>(2);
        customerDTOs.add(customerDTO1);
        customerDTOs.add(customerDTO2);
        customerDTOs.add(customerDTO3);
        customerDTOs.add(customerDTO4);
        customerDTOs.add(new CustomerDTO("C106", "Anil", "anil@gmail.com", 9090909090L, "Vijayapura"));
        customerDTOs.add(customerDTO5);

        System.out.println("Total Customers : " + customerDTOs.size());

        for (CustomerDTO customer : customerDTOs) {
            System.out.println(customer);
        }
    }
}
