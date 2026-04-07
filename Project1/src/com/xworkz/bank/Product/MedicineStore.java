package com.xworkz.bank.Product;

public class MedicineStore {
    Medicine[] inventory = new Medicine[5];
    int cursor;


    void add(Medicine medicine) {
        if (medicine != null && inventory != null) {
            if (cursor < this.inventory.length) {
                inventory[cursor] = medicine;
                System.out.print("Stored at " + cursor + " -> ");
                medicine.info();
                System.out.println("~~~~~~~~~");
                cursor++;

            } else {
                System.out.println("Inventory full");
            }

        } else {
            System.out.println("Medicine object is null");
        }
    }

    boolean search(String label) {
        System.out.println("search");
        if (this.inventory != null) {
            for (Medicine medicine : this.inventory) {
                if (medicine != null && medicine.itemLabel.equals(label)) {

                    System.out.println(">>> Match Found <<<");
                    medicine.info();
                    return true;
                }
            }
        }

        System.out.println("Not found");
        return false;
    }


    boolean update(String label, double newAmount) {
        System.out.println("update");
        if (this.inventory != null) {
            for (Medicine medicine : this.inventory) {
                if (medicine != null && medicine.itemLabel.equals(label)) {
                    medicine.amount = newAmount;
                    System.out.println("Updated Amount : " + medicine.amount);
                    return true;
                }
            }
        }

        return false;
    }
}
