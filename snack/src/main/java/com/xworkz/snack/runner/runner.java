package com.xworkz.snack.runner;

import com.xworkz.snack.dto.SnackDTO;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class runner {
    public static void main(String[] args) {
        TreeSet<SnackDTO> snacks = new TreeSet<>();

        snacks.add(new SnackDTO("Chips","Masala",50,20));
        snacks.add(new SnackDTO("Kurkure","Spicy",60,25));
        snacks.add(new SnackDTO("Popcorn","Butter",80,40));
        snacks.add(new SnackDTO("Nachos","Cheese",90,50));
        snacks.add(new SnackDTO("Biscuits","Chocolate",120,35));

        Iterator<SnackDTO> iterator = snacks.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println("----------------");

        //Get Descending View of TreeSet
            NavigableSet<SnackDTO> descending = snacks.descendingSet();
            for (SnackDTO snack : descending) {
                System.out.println(snack);
            }
            System.out.println("========================");

            //Create TreeSet with Comparator (By Flavor)
            TreeSet<SnackDTO> set = new TreeSet<>(
                    (o1, o2) -> Double.compare(o1.getWeight(), o2.getWeight()));
            set.addAll(snacks);
            set.forEach(snack -> System.out.println(snack));

            //Create TreeSet with Comparator (By Weight)
            TreeSet<SnackDTO> set1= new TreeSet<>(
                    (o1, o2) -> Double.compare(o1.getWeight(), o2.getWeight())
            );
            set.addAll(snacks);
            set.forEach(snack1 -> System.out.println(snack1));
        }


        //reverse
        TreeSet<SnackDTO> reverse = new TreeSet<>(
                (o1, o2) -> o2.compareTo(o1)
        );
        reverse.addAll(snacks);
        reverse.forEach(snack -> System.out.println(snack));

        //duplicate snack
        boolean added = snacks.add(new SnackDTO("Chips", "Masala", 50, 20));
        System.out.println(added);
        System.out.println(snacks.size());

        //Get first element
        System.out.println(snacks.first());

        //Get last element
        System.out.println(snacks.last());
        System.out.println("==========");

        //Get headSet()
        NavigableSet<SnackDTO> head = snacks.headSet(new SnackDTO("", "", 0, 40), false);
        head.forEach(snack -> System.out.println(snack));
        System.out.println("=============");

        //Get tailSet()
        NavigableSet<SnackDTO> tail = snacks.tailSet(new SnackDTO("", "", 0, 35), true);

        tail.forEach(snack -> System.out.println(snack));
        System.out.println("================");

        //floor()
        SnackDTO snack = snacks.floor(new SnackDTO("", "", 0, 38));
        System.out.println(snack);

        //ceiling()
        SnackDTO snack2= snacks.ceiling(new SnackDTO("", "", 0, 38));
        System.out.println(snack2);

        //pollFirst()
        System.out.println(snacks.pollFirst());
        snacks.forEach(snack3 -> System.out.println(snack3));
        System.out.println("=============");

        //Find snack with specific name
        snacks.stream()
                .filter(snack3 -> snack3.getName().equals("Popcorn"))
                .forEach(snack3 -> System.out.println(snack3));
        System.out.println("==========");

        //Find snacks in price range
        snacks.stream()
                .filter(snack4 -> snack.getPrice() >= 25 && snack.getPrice() <= 40)
                .forEach(snack4 -> System.out.println(snack4));
    }
}
