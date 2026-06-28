package com.xworkz.collection.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString

public class InvoiceDTO implements Serializable {
    private int invoiceId;
    private int orderId;
    private double amount;
    private LocalDate dueDate;
    private String paymentStatus;

}
