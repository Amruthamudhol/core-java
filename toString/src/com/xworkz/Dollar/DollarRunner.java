package com.xworkz.Dollar;

import java.util.Arrays;

public class DollarRunner {
    public static void main(String[] args) {

        BankInfo b1 = new BankInfo("Federal Bank", "New York");

        String[] codes = {"A123", "B456"};

        Dollar d1 = new Dollar(1001, 50.0,
                codes, CurrencyType.USD, b1);

        DigitalDollar d2 = new DigitalDollar(2002, 100.0,
                codes, CurrencyType.CAD, b1,
                true, "CryptoWallet");

        d1.displayNote();
        d1.showValue();
        System.out.println(d1);

        System.out.println("Serial Codes: " + Arrays.toString(codes));

        System.out.println("----------------------");

        d2.displayNote();
        d2.showValue();
        System.out.println(d2);

        System.out.println("Serial Codes: " + Arrays.toString(codes));
    }
}
