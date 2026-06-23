package com.xworkz.exception.inbuilt.unchecked;

public class MultiCatch {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.err.println("Exception Handled");
        }
    }
}
