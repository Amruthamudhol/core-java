class DifferentArrays {
    public static void main(String[] args) {

        // 1. int array
        int[] intArr = {1, 2, 3};

        // 2. float array
        float[] floatArr = {1.1f, 2.2f, 3.3f};

        // 3. double array
        double[] doubleArr = {10.5, 20.5, 30.5};

        // 4. char array
        char[] charArr = {'A', 'B', 'C'};

        // 5. boolean array
        boolean[] boolArr = {true, false, true};

        // 6. String array
        String[] strArr = {"Java", "Python", "C++"};

        // 7. byte array
        byte[] byteArr = {10, 20, 30};

        // 8. short array
        short[] shortArr = {100, 200, 300};

        // 9. long array
        long[] longArr = {1000L, 2000L, 3000L};

        // 10. Object array
        Object[] objArr = {10, "Hello", 25.5, true};

        // Printing arrays

        System.out.println("Int Array:");
        for (int i = 0; i < intArr.length; i++)
            System.out.println(intArr[i]);

        System.out.println("\nFloat Array:");
        for (float f : floatArr)
            System.out.println(f);

        System.out.println("\nDouble Array:");
        for (double d : doubleArr)
            System.out.println(d);

        System.out.println("\nChar Array:");
        for (char c : charArr)
            System.out.println(c);

        System.out.println("\nBoolean Array:");
        for (boolean b : boolArr)
            System.out.println(b);

        System.out.println("\nString Array:");
        for (String s : strArr)
            System.out.println(s);

        System.out.println("\nByte Array:");
        for (byte b : byteArr)
            System.out.println(b);

        System.out.println("\nShort Array:");
        for (short s : shortArr)
            System.out.println(s);

        System.out.println("\nLong Array:");
        for (long l : longArr)
            System.out.println(l);

        System.out.println("\nObject Array:");
        for (Object o : objArr)
            System.out.println(o);
    }
}
