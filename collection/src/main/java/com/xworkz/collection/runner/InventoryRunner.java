package com.xworkz.collection.runner;

import com.xworkz.collection.dto.InventoryDTO;

import java.util.ArrayList;
import java.util.Collection;

public class InventoryRunner {
    public static void main(String[] args) {

        InventoryDTO inventoryDTO1 = new InventoryDTO("I101", "Laptop", 25, "Warehouse A", "Dell");
        InventoryDTO inventoryDTO2 = new InventoryDTO("I102", "Mouse", 150, "Warehouse B", "Logitech");
        InventoryDTO inventoryDTO3 = new InventoryDTO("I103", "Keyboard", 100, "Warehouse A", "HP");
        InventoryDTO inventoryDTO4 = new InventoryDTO("I104", "Monitor", 40, "Warehouse C", "Samsung");
        InventoryDTO inventoryDTO5 = new InventoryDTO("I105", "Printer", 15, "Warehouse B", "Canon");

        Collection<InventoryDTO> inventoryDTOs = new ArrayList<>();
        inventoryDTOs.add(inventoryDTO1);
        inventoryDTOs.add(inventoryDTO2);
        inventoryDTOs.add(inventoryDTO3);
        inventoryDTOs.add(inventoryDTO4);

        inventoryDTOs.add(inventoryDTO5);

        System.out.println("Total Inventory Items : " + inventoryDTOs.size());

        for (InventoryDTO inventory : inventoryDTOs) {
            System.out.println(inventory);
        }
    }
}
