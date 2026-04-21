package com.xworkz.management.runner;

import com.xworkz.management.main.*;
import com.xworkz.management.store.CountryStore;

public class CountryRunner
{
        public static void main(String[] args) {

            CountryStore store = new CountryStore();

            Collector col1 = new Collector("Amruta", 2001);
            District d1 = new District("Belagavi", col1);
            City city1 = new City("Banglore", 1, new District[]{d1});
            State state1 = new State("Karnataka", 60000000, new City[]{city1});
            Address addr1 = new Address(108, 591235, state1);
            President p1 = new President("Draupadi Murmu", 61, addr1);
            Country c1 = new Country("India", p1, new State[]{state1});
            store.save(c1);


            Collector col2 = new Collector("Ali Khan", 2002);
            District d2 = new District("Lahore District", col2);
            District d3 = new District("Hydrabad District", col2);
            City city2 = new City("Lahore", 2, new District[]{d2,d3});
            City city2a = new City("Karachi", 2, new District[]{d2,d3});
            State state2 = new State("Punjab", 110000000, new City[]{city2,city2a});
            Address addr2 = new Address(102, 54000, state2);
            President p2 = new President("Asif Ali Zardari", 68, addr2);
            Country c2 = new Country("Pakistan", p2, new State[]{state2});
            store.save(c2);

            Collector col3a = new Collector("Li Wei", 2003);
            Collector col3b = new Collector("Zhang Min", 2004);
            District d3a = new District("Beijing District", col3a);
            District d3b = new District("Shanghai District", col3b);
            City city3a = new City("Beijing", 1, new District[]{d3a});
            City city3b = new City("Shanghai", 1, new District[]{d3b});
            State state3 = new State("Guangdong", 126000000, new City[]{city3a, city3b});
            Address addr3 = new Address(103, 100000, state3);
            President p3 = new President("Xi Jinping", 70, addr3);
            Country c3 = new Country("China", p3, new State[]{state3});
            store.save(c3);

            Collector col4a = new Collector("Kim Min-jun", 2014);
            Collector col4b = new Collector("Lee Ji-eun", 2015);
            District d4a = new District("Seoul District", col4a);
            District d4b = new District("Busan District", col4b);
            City city4a = new City("Seoul", 1, new District[]{d4a});
            City city4b = new City("Busan", 1, new District[]{d4b});
            State state4 = new State("Gyeonggi-do", 13500000, new City[]{city4a, city4b});
            Address addr4 = new Address(104, 04524, state4);
            President p4 = new President("Yoon Suk Yeol", 63, addr4);
            Country c4 = new Country("South Korea", p4, new State[]{state4});
            store.save(c4);


            Collector col5a = new Collector("Oliver Smith", 2008);
            Collector col5b = new Collector("Emily Johnson", 2006);
            District d5a = new District(" London District", col5a);
            District d5b = new District(" Manchester District", col5b);
            City city5a = new City("London", 1, new District[]{d5a});
            City city5b = new City("Manchester", 1, new District[]{d5b});
            State state5 = new State("England", 5600000, new City[]{city5a, city5b});
            Address addr5 = new Address(105, 10001, state5);
            President p5 = new President("Rishi Sunak", 44, addr5);
            Country c5 = new Country("United Kingdom", p5, new State[]{state5});
            store.save(c5);


            Collector col6 = new Collector("Nimal Perera", 2006);
            District d6 = new District("Colombo District", col6);
            City city6 = new City("Colombo", 1, new District[]{d6});
            State state6 = new State("Western Province", 5900000, new City[]{city6});
            Address addr6 = new Address(106, 10000, state6);
            President p6 = new President("Ranil Wickremesinghe", 75, addr6);
            Country c6 = new Country("Sri Lanka", p6, new State[]{state6});
            store.save(c6);

            Collector col7 = new Collector("Rahul", 2007);
            District d7 = new District("District7", col7);
            City city7 = new City("Reo", 1, new District[]{d7});
            State state7 = new State("Paulo State", 700000, new City[]{city7});
            Address addr7 = new Address(107, 560007, state7);
            President p7 = new President("James", 67, addr7);
            Country c7 = new Country("Brazil", p7, new State[]{state7});
            store.save(c7);


            Collector col8 = new Collector("Anita", 2008);
            District d8 = new District("Johannesburg District", col8);
            City city8 = new City("Johannesburg", 1, new District[]{d8});
            State state8 = new State("Gauteng", 800000, new City[]{city8});
            Address addr8 = new Address(678, 560008, state8);
            President p8 = new President("Cyril Ramaphosa", 68, addr8);
            Country c8 = new Country("South-Africa", p8, new State[]{state8});
            store.save(c8);


            Collector col9 = new Collector("Vijay", 2009);
            District d9 = new District("Kingston District", col9);
            City city9 = new City("Kingston", 1, new District[]{d9});
            State state9 = new State("Surrey", 900000, new City[]{city9});
            Address addr9 = new Address(134, 560009, state9);
            President p9 = new President("Andrew Holness", 69, addr9);
            Country c9 = new Country("West-Indies", p9, new State[]{state9});
            store.save(c9);


            Collector col10 = new Collector("Pooja", 2010);
            District d10 = new District("Moscow District", col10);
            City city10 = new City("Moscow ", 1, new District[]{d10});
            State state10 = new State("Moscow Oblast", 1000000, new City[]{city10});
            Address addr10 = new Address(125, 560010, state10);
            President p10 = new President("Vladimir Putin", 70, addr10);
            Country c10 = new Country("Russia", p10, new State[]{state10});
            store.save(c10);


            System.out.println("\n--- TEST ---");
            store.findByName("India");
            store.findStateByStateName("Punjab");
            store.findAllCityByStateName("Punjab");
            store.findNoOfDistrictsByCityName("Beijing");
            store.findByCollectorName("Amruta");
        }
}
