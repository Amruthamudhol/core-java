package com.xworkz.Dollar;

public class DigitalDollar extends Dollar {
    boolean isCrypto;
    String walletType;

    DigitalDollar(int noteNumber, double value, String[] serialCodes,
                  CurrencyType currency, BankInfo bankDetails,
                  boolean isCrypto, String walletType) {

        super(noteNumber, value, serialCodes, currency, bankDetails);
        this.isCrypto = isCrypto;
        this.walletType = walletType;
    }

    @Override
    public void displayNote() {
        System.out.println("Digital dollar ID: " + noteNumber);
    }

    @Override
    public void showValue() {
        System.out.println("Digital Value: $" + value);
    }

    @Override
    public String toString() {
        return "DigitalDollar [noteNumber=" + noteNumber +
                ", value=" + value +
                ", currency=" + currency +
                ", bankDetails=" + bankDetails +
                ", isCrypto=" + isCrypto +
                ", walletType=" + walletType + "]";
    }
}
