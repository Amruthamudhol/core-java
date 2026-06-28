package com.xworkz.collection.runner;

import com.xworkz.collection.dto.SupplierDTO;

import java.util.Collection;
import java.util.LinkedList;

public class SupplierRunner {
    public static void main(String[] args) {

        Collection<SupplierDTO> supplierDTOs = new LinkedList<>();

        supplierDTOs.add(new SupplierDTO(101, "ABC Traders", "Bangalore", "Ramesh", "9876543210"));
        supplierDTOs.add(new SupplierDTO(102, "XYZ Suppliers", "Mysore", "Suresh", "9876543211"));
        supplierDTOs.add(new SupplierDTO(103, "Global Distributors", "Hubli", "Mahesh", "9876543212"));
        supplierDTOs.add(new SupplierDTO(104, "Prime Enterprises", "Belagavi", "Anita", "9876543213"));
        supplierDTOs.add(new SupplierDTO(105, "Sri Agencies", "Dharwad", "Kiran", "9876543214"));

        System.out.println(supplierDTOs);
    }
}
