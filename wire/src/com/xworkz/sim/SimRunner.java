package com.xworkz.sim;

public class SimRunner {
    public static void main(String[] args) {

        Sim s1 = new Sim("Airtel", "Prepaid", 199.0);
        Sim s2 = new Sim("Airtel", "Prepaid", 199.0);
        Sim s3 = new Sim("Jio", "Postpaid", 499.0);

        boolean check1 = s1.equals(s2);
        boolean check2 = s1.equals(s3);

        System.out.println("Is s1 and s2 are same ?: " + check1);
        System.out.println("Is s1 and s3 are same? : " + check2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
