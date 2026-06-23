package com.xworkz.exception.inbuilt.unchecked;

public class SingleCatch {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException Handled");
        }
    }
}
