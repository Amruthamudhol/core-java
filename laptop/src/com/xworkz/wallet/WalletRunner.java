package com.xworkz.wallet;

public class WalletRunner {
    public static void main(String[] args) {
        WalletImpl wallet = new WalletImpl();

        wallet.openWallet();
        wallet.keepMoney();
        wallet.closeWallet();

        System.out.println(Wallet.material);
        System.out.println(Wallet.pockets);
    }
}
