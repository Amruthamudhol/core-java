package com.xworkz.exception.own.checked;

public class SingleCatch {
    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks > 100) {
            throw new InvalidMarksException();
        }
        System.out.println("Valid Marks");
    }

    public static void main(String[] args) {
        try {
            validateMarks(120);
        } catch (InvalidMarksException e) {
            System.err.println("InvalidMarksException Handled");
        }
    }
}
