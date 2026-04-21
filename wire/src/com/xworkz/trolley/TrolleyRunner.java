package com.xworkz.trolley;

public class TrolleyRunner {
    public static void main(String[] args) {

        Trolley t1 = new Trolley("Samsonite", "Hardshell", 75.0);
        Trolley t2 = new Trolley("Samsonite", "Hardshell", 75.0);
        Trolley t3 = new Trolley("American Tourister", "Softshell", 60.0);

        boolean check1 = t1.equals(t2);
        boolean check2 = t1.equals(t3);

        System.out.println("Is t1 and t2 are same ?: " + check1);
        System.out.println("Is t1 and t3 are same? : " + check2);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
