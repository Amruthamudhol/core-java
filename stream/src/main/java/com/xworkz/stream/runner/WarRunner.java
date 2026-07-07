package com.xworkz.stream.runner;

import com.xworkz.stream.dto.WarDTO;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WarRunner {
    public static void main(String[] args) {
        List<WarDTO> wars = new LinkedList<>();

        wars.add(new WarDTO("World War I", LocalDate.of(1914,7,28), LocalDate.of(1918,11,11), "Europe", Arrays.asList("Germany","France","United Kingdom","Russia"), 17000000, "Allied Victory", 1567, "Douglas Haig", "Alliance Conflict"));

        wars.add(new WarDTO("World War II", LocalDate.of(1939,9,1), LocalDate.of(1945,9,2), "Europe", Arrays.asList("Germany","United Kingdom","USA","Japan"), 70000000, "Allied Victory", 2194, "Dwight Eisenhower", "Expansionism"));

        wars.add(new WarDTO("Kargil War", LocalDate.of(1999,5,3), LocalDate.of(1999,7,26), "Asia", Arrays.asList("India","Pakistan"), 1300, "India Victory", 85, "Ved Prakash Malik", "Territorial Dispute"));

        wars.add(new WarDTO("Vietnam War", LocalDate.of(1955,11,1), LocalDate.of(1975,4,30), "Asia", Arrays.asList("Vietnam","USA"), 3000000, "North Vietnam Victory", 7119, "Vo Nguyen Giap", "Ideological Conflict"));

        wars.add(new WarDTO("Korean War", LocalDate.of(1950,6,25), LocalDate.of(1953,7,27), "Asia", Arrays.asList("North Korea","South Korea","USA","China"), 2500000, "Armistice", 1128, "Douglas MacArthur", "Territorial Dispute"));

        wars.add(new WarDTO("American Civil War", LocalDate.of(1861,4,12), LocalDate.of(1865,5,9), "North America", Arrays.asList("USA"), 620000, "Union Victory", 1488, "Ulysses Grant", "Slavery"));

        wars.add(new WarDTO("Napoleonic Wars", LocalDate.of(1803,5,18), LocalDate.of(1815,11,20), "Europe", Arrays.asList("France","United Kingdom","Austria","Russia"), 3500000, "Coalition Victory", 4569, "Napoleon", "Expansionism"));

        wars.add(new WarDTO("Crimean War", LocalDate.of(1853,10,16), LocalDate.of(1856,3,30), "Europe", Arrays.asList("Russia","France","United Kingdom","Turkey"), 750000, "Allied Victory", 896, "Lord Raglan", "Territorial Dispute"));

        wars.add(new WarDTO("Indo China War", LocalDate.of(1946,12,19), LocalDate.of(1954,8,1), "Asia", Arrays.asList("France","Vietnam"), 500000, "Vietnam Victory", 2782, "Vo Nguyen Giap", "Independence"));

        wars.add(new WarDTO("Six Day War", LocalDate.of(1967,6,5), LocalDate.of(1967,6,10), "Middle East", Arrays.asList("Israel","Egypt","Jordan","Syria"), 25000, "Israel Victory", 6, "Moshe Dayan", "Territorial Dispute"));

        wars.add(new WarDTO("Gulf War", LocalDate.of(1990,8,2), LocalDate.of(1991,2,28), "Middle East", Arrays.asList("Iraq","USA","Kuwait"), 50000, "Coalition Victory", 210, "Norman Schwarzkopf", "Invasion"));

        wars.add(new WarDTO("Russo Japanese War", LocalDate.of(1904,2,8), LocalDate.of(1905,9,5), "Asia", Arrays.asList("Russia","Japan"), 150000, "Japan Victory", 575, "Oyama Iwao", "Territorial Dispute"));

        wars.add(new WarDTO("Iran Iraq War", LocalDate.of(1980,9,22), LocalDate.of(1988,8,20), "Middle East", Arrays.asList("Iran","Iraq"), 1000000, "Ceasefire", 2890, "Saddam Hussein", "Border Dispute"));

        wars.add(new WarDTO("Boer War", LocalDate.of(1899,10,11), LocalDate.of(1902,5,31), "Africa", Arrays.asList("United Kingdom","South Africa"), 75000, "British Victory", 963, "Lord Roberts", "Colonial Expansion"));

        wars.add(new WarDTO("First Kashmir War", LocalDate.of(1947,10,22), LocalDate.of(1948,12,31), "Asia", Arrays.asList("India","Pakistan"), 6000, "Ceasefire", 436, "K. M. Cariappa", "Territorial Dispute"));


        System.out.println("Wars Starting with W");
        wars.stream()
                .filter(war -> war.getWarName().startsWith("W"))
                .forEach(war -> System.out.println(war));
        System.out.println("------------------");


        System.out.println("Wars in Europe");
        wars.stream()
                .filter(war -> war.getLocation().equalsIgnoreCase("Europe"))
                .forEach(war -> System.out.println(war));
        System.out.println("-------------");


        System.out.println("Wars with Victory");

        wars.stream()
                .filter(war -> war.getOutcome().contains("Victory"))
                .forEach(war -> System.out.println(war));
        System.out.println("==================");

        System.out.println("Wars with Victory");

        wars.stream()
                .filter(war -> war.getOutcome().contains("Victory"))
                .forEach(war -> System.out.println(war));
        System.out.println("================");

        System.out.println("Territorial Dispute Wars");

        wars.stream()
                .filter(war -> war.getReason().equalsIgnoreCase("Territorial Dispute"))
                .forEach(war -> System.out.println(war));
        System.out.println("-------------");

        System.out.println("Started After 1900");
        wars.stream()
                .filter(war -> war.getStartDate().isAfter(LocalDate.of(1900,1,1)))
                .forEach(war -> System.out.println(war));
        System.out.println("****************");


        System.out.println("Ended Before 1800");

        wars.stream()
                .filter(war -> war.getEndDate().isBefore(LocalDate.of(1800,1,1)))
                .forEach(war -> System.out.println(war));
        System.out.println("----------------");

        System.out.println("20th Century Wars");

        wars.stream()
                .filter(war -> war.getStartDate().getYear() >= 1901 && war.getStartDate().getYear() <= 2000)
                .forEach(war -> System.out.println(war));
        System.out.println("============");

        System.out.println("Duration Greater Than 365");
        wars.stream()
                .filter(war -> war.getDurationDays() > 365)
                .forEach(war -> System.out.println(war));
        System.out.println("===========");

        System.out.println("Duration Less Than 30");
        wars.stream()
                .filter(war -> war.getDurationDays() < 30)
                .forEach(war -> System.out.println(war));
        System.out.println("-----------");

        System.out.println("Casualties Greater Than 100000");

        wars.stream()
                .filter(war -> war.getCasualties() > 100000)
                .forEach(war -> System.out.println(war));
        System.out.println("***********");

        System.out.println("Casualties Less Than 10000");
        wars.stream()
                .filter(war -> war.getCasualties() < 10000)
                .forEach(war -> System.out.println(war));
        System.out.println("#############");

        System.out.println("Casualties Between 50000 and 500000");
        wars.stream()
                .filter(war -> war.getCasualties() >= 50000 && war.getCasualties() <= 500000)
                .forEach(war -> System.out.println(war));
        System.out.println("===========");

        System.out.println("Duration Divisible By 7");
        wars.stream()
                .filter(war -> war.getDurationDays() % 7 == 0)
                .forEach(war -> System.out.println(war));
        System.out.println("----------------");

        System.out.println("Wars Involving India");
        wars.stream()
                .filter(war -> war.getCountriesInvolved().contains("India"))
                .forEach(war -> System.out.println(war));
        System.out.println("=============");

        System.out.println("More Than 3 Countries");
        wars.stream()
                .filter(war -> war.getCountriesInvolved().size() > 3)
                .forEach(war -> System.out.println(war));
        System.out.println("$$$$$$$$$$$$$$$$$$");


        System.out.println("Exactly 2 Countries");
        wars.stream()
                .filter(war -> war.getCountriesInvolved().size() == 2)
                .forEach(war -> System.out.println(war));
        System.out.println("---------------------");

        System.out.println("Multiple Conditions");
        wars.stream()
                .filter(war -> war.getCasualties() > 50000 && war.getDurationDays() > 100)
                .forEach(war -> System.out.println(war));

        System.out.println("----------------------------------");

        System.out.println("Commander Contains Douglas");
        wars.stream()
                .filter(war -> war.getCommander().contains("Douglas"))
                .forEach(war -> System.out.println(war));
        System.out.println("=========================");

        System.out.println("Asia + Victory + Casualties > 10000");
        wars.stream()
                .filter(war -> war.getLocation().equalsIgnoreCase("Asia") && war.getOutcome().contains("Victory")
                        && war.getCasualties() > 10000)
                .forEach(war -> System.out.println(war));
    }
}
