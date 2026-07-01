package com.xworkz.laptop.runner;

import com.xworkz.laptop.dto.LaptopDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LaptopRunner {
    public static void main(String[] args) {
        List<LaptopDTO> laptopDTOs = new ArrayList<>();

        laptopDTOs.add(new LaptopDTO("Dell", "Inspiron 15", "Intel i5", 16, 512, 15.6, "Windows 11", 64999, false, LocalDate.of(2023, 5, 10)));

        laptopDTOs.add(new LaptopDTO("HP", "Pavilion", "Intel i7", 16, 1024, 14.0, "Windows 11", 78999, true, LocalDate.of(2024, 2, 20)));

        laptopDTOs.add(new LaptopDTO("Lenovo", "ThinkPad E14", "AMD Ryzen 7", 16, 512, 14.0, "Windows 11", 72999, false, LocalDate.of(2023, 8, 15)));

        laptopDTOs.add(new LaptopDTO("Apple", "MacBook Air M3", "Apple M3", 16, 512, 13.6, "macOS", 124900, false, LocalDate.of(2024, 3, 8)));

        laptopDTOs.add(new LaptopDTO("Asus", "Vivobook 15", "Intel i5", 8, 512, 15.6, "Windows 11", 58999, false, LocalDate.of(2023, 11, 25)));

        for (LaptopDTO laptop : laptopDTOs) {
            System.out.println(laptop);
        }


        laptopDTOs.add(2, new LaptopDTO("Acer", "Aspire 7", "Intel i5", 16, 512, 15.6, "Windows 11", 62999, false, LocalDate.of(2024, 1, 15)));
        System.out.println("After add:");
        for (LaptopDTO laptop : laptopDTOs) {
            System.out.println(laptop);
        }
        System.out.println("-----");


        List<LaptopDTO> anotherLaptopList = new ArrayList<>();
        anotherLaptopList.add(new LaptopDTO("MSI", "Modern 15", "Intel i7", 16, 512, 15.6, "Windows 11", 74999, false, LocalDate.of(2023, 10, 20)));
        anotherLaptopList.add(new LaptopDTO("Samsung", "Galaxy Book 4", "Intel i5", 16, 512, 15.6, "Windows 11", 69999, true, LocalDate.of(2024, 2, 18)));
       // Add all laptops from anotherLaptopList to laptopDTOs
        laptopDTOs.addAll(anotherLaptopList);
        System.out.println("After addAll():");
        for (LaptopDTO laptop : laptopDTOs) {
            System.out.println(laptop);
        }

        LaptopDTO laptop = laptopDTOs.get(2);
        System.out.println("Laptop at index 2:");
        System.out.println(laptop);


        LaptopDTO oldLaptop = laptopDTOs.set(1,
        new LaptopDTO("LG", "Gram 16", "Intel Core Ultra 7", 16, 1024, 16.0, "Windows 11", 109999, false, LocalDate.of(2024, 4, 15)));
        System.out.println("Replaced Laptop:");
        System.out.println(oldLaptop);
        System.out.println("\nUpdated List:");

        for (LaptopDTO laptop1: laptopDTOs) {
            System.out.println(laptop1);
        }


        LaptopDTO removedLaptop = laptopDTOs.remove(2);
        System.out.println("Removed Laptop:");
        System.out.println(removedLaptop);

        System.out.println("Updated List:");

        for (LaptopDTO laptop2 : laptopDTOs) {
            System.out.println(laptop2);
        }


        LaptopDTO laptop3 = laptopDTOs.get(1);
        int index = laptopDTOs.indexOf(laptop3);
        System.out.println("First Index: " + index);


        LaptopDTO duplicateLaptop = laptopDTOs.get(0);
        laptopDTOs.add(duplicateLaptop);
        int lastIndex = laptopDTOs.lastIndexOf(duplicateLaptop);
        System.out.println("Last Index: " + lastIndex);


        ListIterator<LaptopDTO> iterator = laptopDTOs.listIterator();
        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------");


        ListIterator<LaptopDTO> iterator1 = laptopDTOs.listIterator(2);

        System.out.println("Traversal From Index 2:");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }


        ListIterator<LaptopDTO> iterator2 = laptopDTOs.listIterator(3);
        System.out.println("Backward Traversal:");
        while (iterator2.hasPrevious()) {
            System.out.println(iterator2.previous());
        }
    }
}
