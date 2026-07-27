package com.xworkz.map.runner;

import com.xworkz.map.dto.AuthorDTO;
import com.xworkz.map.dto.BookDTO;

import java.util.HashMap;
import java.util.Map;

public class BookRunner {
    public static void main(String[] args) {
        Map<BookDTO, AuthorDTO> map = new HashMap<>();

        BookDTO b1 = new BookDTO(101, "Java Programming", 650.0);
        BookDTO b2 = new BookDTO(102, "Python Basics", 550.0);
        BookDTO b3 = new BookDTO(103, "Data Structures", 700.0);

        AuthorDTO a1 = new AuthorDTO(1, "James Gosling", "Canada");
        AuthorDTO a2 = new AuthorDTO(2, "Guido van Rossum", "Netherlands");
        AuthorDTO a3 = new AuthorDTO(3, "Mark Allen Weiss", "USA");

        // put()
        map.put(b1, a1);
        map.put(b2, a2);
        map.put(b3, a3);

        // get()
        System.out.println("get():");
        System.out.println(map.get(b1));

        // containsKey()
        System.out.println("\ncontainsKey():");
        System.out.println(map.containsKey(b2));

        // containsValue()
        System.out.println("\ncontainsValue():");
        System.out.println(map.containsValue(a3));

        // size()
        System.out.println("\nsize():");
        System.out.println(map.size());

        // keySet()
        System.out.println("\nkeySet():");
        for (BookDTO key : map.keySet()) {
            System.out.println(key);
        }

        // values()
        System.out.println("\nvalues():");
        for (AuthorDTO value : map.values()) {
            System.out.println(value);
        }

        // entrySet()
        System.out.println("\nentrySet():");
        for (Map.Entry<BookDTO, AuthorDTO> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // replace()
        System.out.println("\nreplace():");
        map.replace(b1, new AuthorDTO(4, "Herbert Schildt", "USA"));
        System.out.println(map.get(b1));

        // remove()
        System.out.println("\nremove():");
        map.remove(b2);
        System.out.println(map);

        // putIfAbsent()
        System.out.println("\nputIfAbsent():");
        map.putIfAbsent(b2, a2);
        System.out.println(map);

        // forEach()
        System.out.println("\nforEach():");
        map.forEach((book, author) ->
                System.out.println(book + " => " + author));

        // isEmpty()
        System.out.println("\nisEmpty():");
        System.out.println(map.isEmpty());

        // clear()
        System.out.println("\nclear():");
        map.clear();
        System.out.println("Size after clear: " + map.size());
        System.out.println("Is Empty: " + map.isEmpty());
    }

}
