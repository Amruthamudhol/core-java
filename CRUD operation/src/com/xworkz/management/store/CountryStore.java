package com.xworkz.management.store;

import com.xworkz.management.main.City;
import com.xworkz.management.main.Country;
import com.xworkz.management.main.District;
import com.xworkz.management.main.State;

public class CountryStore {
    Country[] countries = new Country[10];
    int index = 0;

    public void save(Country country) {

        System.out.println("\n------ SAVE COUNTRY ------");

        if (country != null && this.countries != null) {

            if (index < countries.length) {

                countries[index] = country;
                System.out.print(country.name + " stored at index " + index);
                index++;

            } else {
                System.out.println("No space for more countries");
            }

        } else {
            System.out.println("Country object is null");
        }

    }



    public Country findByName(String name) {

        System.out.println("=== Searching Country By Name ===");
        System.out.println("Search Query : " + name);

        if (countries != null) {
            for (int i = 0; i < countries.length; i++) {

                Country c = countries[i];

                if (c != null && c.name != null &&
                        c.name.equalsIgnoreCase(name)) {

                    System.out.println(">>> Match Found! <<<");
                    System.out.println("Country: " + c.name + " at index " + i);
                    System.out.println("----------------");
                    return c;
                }
            }
        }

        System.out.println("No country found with name " + name);
        return null;
    }
    public State findStateByStateName(String name) {
        System.out.println("findStateByStateName");
        System.out.println("Search Query : " + name);

        if (this.countries != null)
        {
            for (Country c : this.countries) {
                if (c != null && c.states != null) {
                    for (State s : c.states)
                    {
                        if (s != null && s.name.equals(name)) {
                            System.out.println(">>> Match Found! <<<");
                            System.out.println("State Name: " + s.name);
                            System.out.println("----------------");
                            return s;
                        }
                    }
                }
            }
        }

        System.out.println("No state found with name " + name);

        return null;
    }

   public City[] findAllCityByStateName(String name) {
        System.out.println("findAllCityByStateName");
        System.out.println("Search Query : " + name);

        if (this.countries != null)
        {
            for (Country c : this.countries) {
                if (c != null && c.states != null) {
                    for (State s : c.states) {
                        if (s != null && s.name.equals(name))
                        {

                            System.out.println(">>> Match Found! <<<");
                            System.out.println("Cities in State: " + s.name);

                            if (s.cities != null) {
                                for (City city : s.cities)
                                {
                                    if (city != null) {
                                        System.out.println("City: " + city.name);
                                    }
                                }
                                System.out.println("----------------");
                                return s.cities;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("No cities found for state " + name);
        System.out.println("----------------");
        return null;
    }

   public int findNoOfDistrictsByCityName(String name)
    {
        System.out.println("findNoOfDistrictsByCityName");
        System.out.println("Search Query : " + name);
        System.out.println("----------------");

        if (this.countries != null)
        {
            for (Country c : this.countries) {
                if (c != null && c.states != null) {
                    for (State s : c.states) {
                        if (s != null && s.cities != null) {
                            for (City city : s.cities) {
                                if (city != null && city.name.equals(name))
                                {

                                    System.out.println(">>> Match Found! <<<");
                                    System.out.println("City: " + city.name);
                                    System.out.println("No of Districts: " + city.noOfDistricts);
                                    System.out.println("----------------");
                                    return city.noOfDistricts;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("No city found with name " + name);

        return 0;
    }

    public Country findByCollectorName(String collectorName) {

        System.out.println("=== Searching Country By Collector ===");
        System.out.println("Search Query : " + collectorName);

        if (countries != null) {
            for (Country c : countries) {
                if (c != null && c.states != null)
                {

                    for (State s : c.states) {
                        if (s != null && s.cities != null) {

                            for (City city : s.cities) {
                                if (city != null && city.districts != null)
                                {

                                    for (District d : city.districts) {
                                        if (d != null &&
                                                d.collector != null && d.collector.name != null && d.collector.name.equals(collectorName))
                                        {
                                            System.out.println("Country: " + c.name);
                                            return c;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("No country found for collector " + collectorName);
        System.out.println("----------");
        return null;
    }
}
