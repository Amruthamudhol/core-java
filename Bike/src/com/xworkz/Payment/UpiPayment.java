package com.xworkz.Payment;

public class UpiPayment extends Payment{
    @Override
    void pay() {
        System.out.println("Paying using UPI");
    }
}
