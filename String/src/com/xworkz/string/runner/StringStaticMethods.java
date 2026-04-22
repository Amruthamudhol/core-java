package com.xworkz.string.runner;

public class StringStaticMethods {
    public static void main(String[] args) {

        int i = 10;
        double d = 25.5;
        boolean b = true;
        char c = 'A';
        char[] charArray = {'J', 'a', 'v', 'a'};

        System.out.println("int to String: " + String.valueOf(i));
        System.out.println("double to String: " + String.valueOf(d));
        System.out.println("boolean to String: " + String.valueOf(b));
        System.out.println("char to String: " + String.valueOf(c));
        System.out.println("char[] to String: " + String.valueOf(charArray));


        String str1 = String.copyValueOf(charArray);
        System.out.println("copyValueOf full: " + str1);

        String str2 = String.copyValueOf(charArray, 1, 2);
        System.out.println("copyValueOf : " + str2);


        String formatted1 = String.format("Name: %s, Age: %d", "Amruta", 21);
        System.out.println("Formatted String: " + formatted1);

        String formatted2 = String.format("Decimal: %.2f", 45.6789);
        System.out.println("Formatted Decimal: " + formatted2);

        String joined2 = String.join(" || ", "HTML", "CSS", "JS");
        System.out.println("Joined with pipe: " + joined2);

        String[] subjects = {"Math", "Science", "English"};
        String joined3 = String.join(", ", subjects);
        System.out.println("Joined array: " + joined3);

    }
}
