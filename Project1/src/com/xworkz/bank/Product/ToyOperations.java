package com.xworkz.bank.Product;

public class ToyOperations {
    Toy[] toys = new Toy[5];
    int index;

    public void addToy(Toy toy) {
        if (toy != null && toys != null) {
            if (index < this.toys.length) {
                toys[index] = toy;
                System.out.print("Toy stored at " + index + " -> ");
                toy.info();
                System.out.println("~~~~~~~~~");
                index++;

            } else {
                System.out.println("No space for more toys");
            }

        } else {
            System.out.println("Toy object is null");
        }
    }



    public void getToyDetailsById (int searchId) {
        System.out.println("getToyDetailsById");

        if (this.toys != null) {
            for (Toy toy : this.toys) {
                if (toy != null && toy.toyId == searchId) {
                    System.out.println(">>> Match Found! <<<");
                    toy.info();
                }
            }
        }

        System.out.println("No toy found with ID " + searchId);
        System.out.println("----------------");
    }

    public void updatePriceAndColor(String searchName, double newPrice, String newColor) {

        System.out.println("----------------");
        System.out.println("updatePriceAndColor");

        if (this.toys != null) {
            for (Toy toy : this.toys) {
                if (toy != null && toy.toyName == searchName) {
                    toy.price = newPrice;
                    toy.color = newColor;
                    System.out.println("Updated Price : " + toy.price);
                    System.out.println("Updated Color : " + toy.color);
                }
            }
        }
        System.out.println("----------------");
    }
}
