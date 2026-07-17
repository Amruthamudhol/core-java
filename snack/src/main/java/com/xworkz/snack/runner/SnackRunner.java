package com.xworkz.snack.runner;

import com.xworkz.snack.dto.SnackDTO;

import java.util.*;

public class SnackRunner {
    public static void main(String[] args) {
        HashSet<SnackDTO> snacks = new HashSet<>();

        snacks.add(new SnackDTO("Chips","Masala",50,20));
        snacks.add(new SnackDTO("Kurkure","Spicy",60,25));
        snacks.add(new SnackDTO("Popcorn","Butter",80,40));
        snacks.add(new SnackDTO("Nachos","Cheese",90,50));
        snacks.add(new SnackDTO("Biscuits","Chocolate",120,35));

        for (SnackDTO snack : snacks) {
            System.out.println(snack);
        }

        //duplicate snack
        snacks.add(new SnackDTO("Chips","Masala",50,20));
        System.out.println(snacks.size());

        //remove
        snacks.remove(new SnackDTO("Chips","Masala",50,20));
        for (SnackDTO snack : snacks) {
            System.out.println(snack);
        }

        //contains
        boolean found = snacks.contains(new SnackDTO("Popcorn","Butter",80,40));
        System.out.println(found);

        //size
        System.out.println(snacks.size());

        //clear
        //snacks.clear();
       // System.out.println(snacks);

        //isEmpty
        System.out.println(snacks.isEmpty());

        //toArray
        SnackDTO[] array = snacks.toArray(new SnackDTO[0]);
        for(SnackDTO dto : array){
            System.out.println(dto);
        }
        System.out.println("-----------------");
        //lambda
        snacks.forEach(snack -> System.out.println(snack));


        //Iterator
        Iterator<SnackDTO> iterator = snacks.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //removeIf()
        snacks.removeIf(snack -> snack.getPrice() > 40);
        System.out.println(snacks);
        System.out.println("-------------");

        //Initial Capacity
        HashSet<SnackDTO> set = new HashSet<>(20);

        //Addall
        HashSet<SnackDTO> another = new HashSet<>();
        another.add(new SnackDTO("Cake","Vanilla",150,60));
        snacks.addAll(another);
        snacks.forEach(snack -> System.out.println(snack));

        //retainAll
        snacks.retainAll(another);
        System.out.println(snacks);

//removeAll
       // snacks.removeAll(another);
       // System.out.println(snacks);

        //containsAll
        System.out.println(snacks.containsAll(another));

        //HashSet from List
        List<SnackDTO> list = new ArrayList<>(snacks);
        HashSet<SnackDTO> set1 = new HashSet<>(list);
        System.out.println(set1);

        //HashSet from Array
        SnackDTO[] arr = {
                new SnackDTO("Chips","Masala",50,20),
                new SnackDTO("Cake","Vanilla",150,60)
        };
        HashSet<SnackDTO> set2 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set2);
        System.out.println("===============");

        //Highest Price
        SnackDTO max = null;
        for(SnackDTO snack : snacks){
            if(max == null || snack.getPrice() > max.getPrice()){
                max = snack;
            }
        }
        System.out.println(max);

//specific flavor
        int count = 0;
        for(SnackDTO snack : snacks){
            if(snack.getFlavor().equals("Masala")){
                count++;
            }
        }
        System.out.println(count);

// total weight
        double total = 0;
        for(SnackDTO snack : snacks){
            total += snack.getWeight();
        }

        System.out.println(total);

        //Price Below Threshold
        for(SnackDTO snack : snacks) {
            if (snack.getPrice() < 30) {
                System.out.println(snack);
            }
        }

    }
}


