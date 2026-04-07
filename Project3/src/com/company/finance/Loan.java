package com.company.finance;

public class Loan {
    double loanAmount;
    double interestRate;

    public Loan(double loanAmount, double interestRate) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    void displayLoan() {
        System.out.println("Loan Amount: " + this.loanAmount);
        System.out.println("Interest Rate: " + this. interestRate);
    }
}
