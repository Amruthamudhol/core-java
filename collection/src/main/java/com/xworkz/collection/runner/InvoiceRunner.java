package com.xworkz.collection.runner;

import com.xworkz.collection.dto.InvoiceDTO;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

public class InvoiceRunner {
    public static void main(String[] args) {

        Collection<InvoiceDTO> invoices = new HashSet<>();
        invoices.add(new InvoiceDTO(101, 1001, 2500.50, LocalDate.of(2026, 7, 10), "Paid"));
        invoices.add(new InvoiceDTO(102, 1002, 1800.00, LocalDate.of(2026, 7, 15), "Pending"));
        invoices.add(new InvoiceDTO(103, 1003, 3200.75, LocalDate.of(2026, 7, 20), "Overdue"));

        for (InvoiceDTO invoice : invoices) {
            System.out.println(invoice);
        }
    }
}
