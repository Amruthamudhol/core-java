class DifferentArraysDecrement {
    public static void main(String[] args) {

        int[] intArr = {1, 2, 3};
        float[] floatArr = {1.1f, 2.2f, 3.3f};
        double[] doubleArr = {10.5, 20.5, 30.5};
        char[] charArr = {'A', 'B', 'C'};
        boolean[] boolArr = {true, false, true};
        String[] strArr = {"Java", "Python", "C++"};
        byte[] byteArr = {10, 20, 30};
        short[] shortArr = {100, 200, 300};
        long[] longArr = {1000L, 2000L, 3000L};
        Object[] objArr = {10, "Hello", 25.5, true};

        System.out.println("Int Array:");
        for (int i = intArr.length - 1; i >= 0; i--)
            System.out.println(intArr[i]);

        System.out.println("\nFloat Array:");
        for (int i = floatArr.length - 1; i >= 0; i--)
            System.out.println(floatArr[i]);

        System.out.println("\nDouble Array:");
        for (int i = doubleArr.length - 1; i >= 0; i--)
            System.out.println(doubleArr[i]);

        System.out.println("\nChar Array:");
        for (int i = charArr.length - 1; i >= 0; i--)
            System.out.println(charArr[i]);

        System.out.println("\nBoolean Array:");
        for (int i = boolArr.length - 1; i >= 0; i--)
            System.out.println(boolArr[i]);

        System.out.println("\nString Array:");
        for (int i = strArr.length - 1; i >= 0; i--)
            System.out.println(strArr[i]);

        System.out.println("\nByte Array:");
        for (int i = byteArr.length - 1; i >= 0; i--)
            System.out.println(byteArr[i]);

        System.out.println("\nShort Array:");
        for (int i = shortArr.length - 1; i >= 0; i--)
            System.out.println(shortArr[i]);

        System.out.println("\nLong Array:");
        for (int i = longArr.length - 1; i >= 0; i--)
            System.out.println(longArr[i]);

        System.out.println("\nObject Array:");
        for (int i = objArr.length - 1; i >= 0; i--)
            System.out.println(objArr[i]);
    }
}
