class UtilityMethods {

    static void findEvenOddSum(int[] arr) {

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Odd Sum => " + oddSum);
        System.out.println("Even Sum => " + evenSum);
    }

    static void reverseString(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed String => " + reversed);
    }

    static void checkPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome => true");
        } else {
            System.out.println("Palindrome => false");
        }
    }

    static void findArraySum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Total Sum => " + sum);
    }
}