package com.xworkz.exception.own.checked;

public class MultiCatch {
    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks > 100) {
            throw new InvalidMarksException();
        }
    }

    public static void main(String[] args) {
        try {
            validateMarks(120);
            int result = 10 / 0;
        }
        catch (InvalidMarksException | ArithmeticException e) {
            System.err.println("Exception Handled");
        }
    }
}
