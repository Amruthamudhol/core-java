package com.xworkz.string.allrunner;

public class StringInstanceMethods {
    public static void main(String[] args) {

        String str = "  Java Programming  ";

        System.out.println("Length: " + str.length());

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Trimmed: '" + str.trim() + "'");

        System.out.println("Character at index 2: " + str.charAt(3));

        System.out.println("Substring: " + str.substring(2, 6));

        System.out.println("Contains 'Java': " + str.contains("Java"));

        String str2 = "java programming";
        System.out.println("Equals: " + str.equals(str2));

        System.out.println("Replace: " + str.replace("Java", "Python"));

        System.out.println("Starts with '  Ja': " + str.startsWith("  Ja"));

        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
        
        String emptyStr = "";
        System.out.println("Is empty: " + emptyStr.isEmpty());

        System.out.println("Concat: " + str.concat(" Language"));

        char[] chars = str.toCharArray();
        System.out.print("Char Array: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
    }
}
