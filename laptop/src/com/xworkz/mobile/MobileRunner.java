package com.xworkz.mobile;

public class MobileRunner {
    public static void main(String[] args) {
        MobileImpl mobile = new MobileImpl();

        mobile.makeCall();
        mobile.sendMessage();
        mobile.browseInternet();

        System.out.println(Mobile.brand);
        System.out.println(Mobile.storage);
    }
}
