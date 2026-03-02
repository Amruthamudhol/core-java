class TestUtility {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        UtilityMethods.findEvenOddSum(arr1);

        UtilityMethods.reverseString("hello");

        UtilityMethods.checkPalindrome(121);
        UtilityMethods.checkPalindrome(122);

        int[] arr2 = {1, 2, 3, 4, 5};
        UtilityMethods.findArraySum(arr2);
    }
}