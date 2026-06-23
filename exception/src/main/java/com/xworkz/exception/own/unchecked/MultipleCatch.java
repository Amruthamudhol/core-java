package com.xworkz.exception.own.unchecked;

public class MultipleCatch {
    static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException();
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
            String str = null;

        }
        catch (InvalidAgeException e) {
            System.err.println("InvalidAgeException Handled");
        }
        catch (NullPointerException e) {
            System.err.println("NullPointerException Handled");
        }
    }
}
