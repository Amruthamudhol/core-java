package com.xworkz.exception.own.unchecked;

public class SingleCatch {
    static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException();
        }
        System.out.println("Valid Age");
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        }
        catch (InvalidAgeException e)
        {
            System.err.println("InvalidAgeException Handled");
        }
    }
}
