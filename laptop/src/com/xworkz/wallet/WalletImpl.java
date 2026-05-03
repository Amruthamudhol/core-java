package com.xworkz.wallet;

public class WalletImpl  implements  Wallet{
    public void openWallet() {
        System.out.println("Wallet opened");
    }

    public void keepMoney() {
        System.out.println("Money kept in wallet");
    }

    public void closeWallet() {
        System.out.println("Wallet closed");
    }

}
