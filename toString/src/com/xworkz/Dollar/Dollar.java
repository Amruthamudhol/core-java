package com.xworkz.Dollar;

public class Dollar {
    int noteNumber;
    double value;
    String[] serialCodes;
    CurrencyType currency;
    BankInfo bankDetails;

    Dollar(int noteNumber, double value, String[] serialCodes,
           CurrencyType currency, BankInfo bankDetails) {

        this.noteNumber = noteNumber;
        this.value = value;
        this.serialCodes = serialCodes;
        this.currency = currency;
        this.bankDetails = bankDetails;
    }

    public void displayNote() {
        System.out.println("Dollar Note Number: " + noteNumber);
    }

    public void showValue() {
        System.out.println("Value: $" + value);
    }

    @Override
    public String toString() {
        return "Dollar [noteNumber=" + noteNumber +
                ", value=" + value +
                ", currency=" + currency +
                ", bankDetails=" + bankDetails + "]";
    }
}
