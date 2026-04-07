package com.xworkz.bank;

public class Deposit {

    double amount;

    public Deposit(double amount) {
        this.amount = amount;
    }

    public void depositToAccount(Account account) {
        account.balance = account.balance + amount;
    }
}