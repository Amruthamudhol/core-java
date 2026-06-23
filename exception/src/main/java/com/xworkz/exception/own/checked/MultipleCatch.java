package com.xworkz.exception.own.checked;

public class MultipleCatch {
    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks > 100) {
            throw new InvalidMarksException();
        }
    }

    public static void main(String[] args) {
        try {
            validateMarks(120);
            String str = null;
        }
        catch (InvalidMarksException e) {
            System.err.println("InvalidMarksException Handled");
        }
        catch (NullPointerException e) {
            System.err.println("NullPointerException Handled");
        }
    }
}
