package com.xworkz.stream.runner;

import com.xworkz.stream.dto.CountryDTO;

import java.util.LinkedList;
import java.util.List;

public class CountryRunner {
    public static void main(String[] args) {

        List<CountryDTO> countries = new LinkedList<>();

        countries.add(new CountryDTO("India"));
        countries.add(new CountryDTO("Indonesia"));
        countries.add(new CountryDTO("Australia"));
        countries.add(new CountryDTO("America"));
        countries.add(new CountryDTO("South Africa"));
        countries.add(new CountryDTO("Sri Lanka"));
        countries.add(new CountryDTO("Canada"));
        countries.add(new CountryDTO("China"));
        countries.add(new CountryDTO("Russia"));
        countries.add(new CountryDTO("United States"));
        countries.add(new CountryDTO("United Kingdom"));
        countries.add(new CountryDTO("New Zealand"));
        countries.add(new CountryDTO("Nepal"));
        countries.add(new CountryDTO("Japan"));
        countries.add(new CountryDTO("Italy"));
        countries.add(new CountryDTO("Germany"));
        countries.add(new CountryDTO("France"));
        countries.add(new CountryDTO("Brazil"));
        countries.add(new CountryDTO("Argentina"));
        countries.add(new CountryDTO("Mexico"));
        countries.add(new CountryDTO("Pakistan"));
        countries.add(new CountryDTO("Bangladesh"));
        countries.add(new CountryDTO("Afghanistan"));
        countries.add(new CountryDTO("Saudi Arabia"));
        countries.add(new CountryDTO("United Arab Emirates"));
        countries.add(new CountryDTO("South Korea"));
        countries.add(new CountryDTO("North Korea"));
        countries.add(new CountryDTO("Thailand"));
        countries.add(new CountryDTO("Singapore"));
        countries.add(new CountryDTO("Malaysia"));
        countries.add(new CountryDTO("Vietnam"));
        countries.add(new CountryDTO("Philippines"));
        countries.add(new CountryDTO("Turkey"));
        countries.add(new CountryDTO("Egypt"));
        countries.add(new CountryDTO("Nigeria"));
        countries.add(new CountryDTO("Kenya"));
        countries.add(new CountryDTO("Norway"));
        countries.add(new CountryDTO("Sweden"));
        countries.add(new CountryDTO("Switzerland"));
        countries.add(new CountryDTO("Netherlands"));

        //  Countries starting with I
        System.out.println("Countries  Starting with I");
        countries.stream()
                .filter(country -> country.getCountryName().startsWith("I"))
                .forEach(c -> System.out.println(c.getCountryName()));

        System.out.println("=================");

        //  Countries ending with A
        System.out.println("Countries Ending with A");
        countries.stream()
                .filter(country -> country.getCountryName().endsWith("a"))
                .forEach(c -> System.out.println(c.getCountryName()));

        System.out.println("================");

        //Countries with two or more words
        System.out.println("Countries with Two or More Words");
        countries.stream()
                .filter(country -> country.getCountryName().contains(" "))
                .forEach(c -> System.out.println(c.getCountryName()));

        System.out.println("========================");

        // length greater than 10
        System.out.println("Countries Length Greater Than 10");
        countries.stream()
                .filter(country -> country.getCountryName().length() > 10)
                .forEach(c -> System.out.println(c.getCountryName()));

        System.out.println("=================");

        // length less than or equal to 5
        System.out.println("Countries Length Less Than or Equal to 5");
        countries.stream()
                .filter(country -> country.getCountryName().length() <= 5)
                .forEach(c -> System.out.println(c.getCountryName()));

        System.out.println("=======================");

        //  Print all Countries
        System.out.println("All Countries");
        countries.stream()
                .forEach(c -> System.out.println(c.getCountryName()));
    }
}
