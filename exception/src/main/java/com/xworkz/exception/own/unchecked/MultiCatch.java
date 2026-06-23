package com.xworkz.exception.own.unchecked;

public class MultiCatch {
    static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException();
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
            int result = 10 / 0;

        }
        catch (InvalidAgeException | ArithmeticException e) {
            System.err.println("Exception Handled");
        }
    }
}
