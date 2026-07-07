package com.xworkz.stream.runner;

import com.xworkz.stream.dto.CityDTO;

import java.util.LinkedList;
import java.util.List;

public class CityRunner {
    public static void main(String[] args) {
        List<CityDTO> cities = new LinkedList<>();

        cities.add(new CityDTO("Bengaluru", 560001));
        cities.add(new CityDTO("Mysuru", 570001));
        cities.add(new CityDTO("Dharwad", 580001));
        cities.add(new CityDTO("Hubballi", 580020));
        cities.add(new CityDTO("Belagavi", 590001));
        cities.add(new CityDTO("Mumbai", 400001));
        cities.add(new CityDTO("Delhi", 110001));
        cities.add(new CityDTO("Chennai", 600001));
        cities.add(new CityDTO("Hyderabad", 500001));
        cities.add(new CityDTO("Pune", 411001));
        cities.add(new CityDTO("Nagpur", 440001));
        cities.add(new CityDTO("Jaipur", 302001));
        cities.add(new CityDTO("Ahmedabad", 380001));
        cities.add(new CityDTO("Surat", 395001));
        cities.add(new CityDTO("Kolkata", 700001));
        cities.add(new CityDTO("Patna", 800001));
        cities.add(new CityDTO("Lucknow", 226001));
        cities.add(new CityDTO("Bhopal", 462001));
        cities.add(new CityDTO("Madurai", 625001));
        cities.add(new CityDTO("Davangere", 577001));
        cities.add(new CityDTO("Mangaluru", 575001));
        cities.add(new CityDTO("Shivamogga", 577201));
        cities.add(new CityDTO("Ballari", 583101));
        cities.add(new CityDTO("Vijayapura", 586101));
        cities.add(new CityDTO("Raichur", 584101));
        cities.add(new CityDTO("Kalaburagi", 585101));
        cities.add(new CityDTO("Udupi", 576101));
        cities.add(new CityDTO("Manipal", 576104));
        cities.add(new CityDTO("Tumakuru", 572101));
        cities.add(new CityDTO("Bidar", 585401));
        cities.add(new CityDTO("Kochi", 682001));
        cities.add(new CityDTO("Thiruvananthapuram", 695001));
        cities.add(new CityDTO("Coimbatore", 641001));
        cities.add(new CityDTO("Visakhapatnam", 530001));
        cities.add(new CityDTO("Vijayawada", 520001));
        cities.add(new CityDTO("Guntur", 522001));
        cities.add(new CityDTO("Warangal", 506001));
        cities.add(new CityDTO("Nashik", 422001));
        cities.add(new CityDTO("Aurangabad", 431001));
        cities.add(new CityDTO("Noida", 201301));

        // Pincode between 500000 and 599999
        System.out.println("Pincode Between 500000-599999");
        cities.stream()
                .filter(city -> city.getPincode() >= 500000 && city.getPincode() <= 599999)
                .forEach(c -> System.out.println(c.getCityName()+" : "+c.getPincode()));

        System.out.println("-----------------------");

        // City name length greater than 6
        System.out.println("City Name Length > 6");
        cities.stream()
                .filter(city -> city.getCityName().length() > 6)
                .forEach(c -> System.out.println(c.getCityName()));

        System.out.println("------------------");

        //  Pincode contains digit 1
        System.out.println("Pincode Contains Digit 1");
        cities.stream()
                .filter(city -> String.valueOf(city.getPincode()).contains("1"))
                .forEach(c -> System.out.println(c.getCityName()+" : "+c.getPincode()));

        System.out.println("==========");

        // Even pincodes
        System.out.println("Even Pincodes");
        cities.stream()
                .filter(city -> city.getPincode() % 2 == 0)
                .forEach(c -> System.out.println(c.getCityName()+": "+c.getPincode()));

        System.out.println("===================");

        // Odd pincodes
        System.out.println("Odd Pincodes");
        cities.stream()
                .filter(city -> city.getPincode() % 2 != 0)
                .forEach(c -> System.out.println(c.getCityName()+" :"+c.getPincode()));

        System.out.println("==============");

        //  City starts with M or D
        System.out.println("City Starts With M or D");
        cities.stream()
                .filter(city -> city.getCityName().startsWith("M") || city.getCityName().startsWith("D"))
                .forEach(c -> System.out.println(c.getCityName()));

        System.out.println("----------------------");

        // Pincode divisible by 3
        System.out.println("Pincode Divisible By 3");
        cities.stream()
                .filter(city -> city.getPincode() % 3 == 0)
                .forEach(c -> System.out.println(c.getCityName()+" : "+c.getPincode()));

        System.out.println("==========================");

        //  Sum of pincode digits > 20
        System.out.println("Sum Of Pincode Digits > 20");
        cities.stream()
                .filter(city -> {
                    int pin = city.getPincode();
                    int sum = 0;
                    while (pin > 0) {
                        sum += pin % 10;
                        pin /= 10;
                    }
                    return sum > 20;
                })
                .forEach(c -> System.out.println(c.getCityName()+" : "+c.getPincode()));

        System.out.println("===========");

        //  City contains 'a'
        System.out.println("City Contains Letter 'a'");
        cities.stream()
                .filter(city -> city.getCityName().toLowerCase().contains("a"))
                .forEach(c -> System.out.println(c.getCityName()));

        System.out.println("==========================");

        //  Pincode ends with 001
        System.out.println("Pincode Ends With 001");
        cities.stream()
                .filter(city -> String.valueOf(city.getPincode()).endsWith("001"))
                .forEach(c -> System.out.println(c.getCityName()+" : "+c.getPincode()));

    }
}
