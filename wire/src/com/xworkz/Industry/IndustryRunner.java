package com.xworkz.Industry;

public class IndustryRunner {
    public static void main(String[] args) {

        Industry i1 = new Industry("Tata", "Steel", 5000);
        Industry i2 = new Industry("Tata", "Steel", 5000);
        Industry i3 = new Industry("Infosys", "IT", 3000);

        boolean check1 = i1.equals(i2);
        boolean check2 = i1.equals(i3);

        System.out.println("i1 is equal to i2?:"+check1);
        System.out.println("i1 is equal to i3?:"+check2);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

    }
}


