package com.xworkz.collection.runner;

import com.xworkz.collection.dto.ShipmentDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class ShipmentRunner {
    public static void main(String[] args) {

        Collection<ShipmentDTO> shipments = new ArrayList<>();
        shipments.add(new ShipmentDTO(501, 1001, "DHL", "DHL12345", LocalDate.of(2026, 7, 12)));
        shipments.add(new ShipmentDTO(502, 1002, "FedEx", "FDX67890", LocalDate.of(2026, 7, 15)));
        shipments.add(new ShipmentDTO(503, 1003, "BlueDart", "BD54321", LocalDate.of(2026, 7, 18)));

        for (ShipmentDTO shipment : shipments)
        {
            System.out.println(shipment);
        }
    }
}
