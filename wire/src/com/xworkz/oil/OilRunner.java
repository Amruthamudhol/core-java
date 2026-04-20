package com.xworkz.oil;

public class OilRunner {
    public static void main(String[] args) {

        Oil o1 = new Oil("Castrol", "Engine", 5.0);
        Oil o2 = new Oil("Castrol", "Engine", 5.0);
        Oil o3 = new Oil("Shell", "Olive", 2.5);

        boolean check1 = o1.equals(o2);
        boolean check2 = o1.equals(o3);

        System.out.println("is o1 equal to o2?:"+check1);
        System.out.println("is o1 equa; to o3:"+check2);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

    }
}
