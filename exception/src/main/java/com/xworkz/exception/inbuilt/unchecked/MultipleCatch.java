package com.xworkz.exception.inbuilt.unchecked;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);

            int result = 10 / 0;
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException Handled");

        } catch (ArithmeticException e)
        {
            System.err.println("ArithmeticException Handled");
        }
    }
}
