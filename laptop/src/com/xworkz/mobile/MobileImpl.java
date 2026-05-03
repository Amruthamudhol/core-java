package com.xworkz.mobile;

public class MobileImpl implements Mobile{
    public void makeCall() {
        System.out.println("Mobile is making a call");
    }

    public void sendMessage() {
        System.out.println("Mobile is sending message");
    }

    public void browseInternet() {
        System.out.println("Mobile is browsing internet");
    }
}
