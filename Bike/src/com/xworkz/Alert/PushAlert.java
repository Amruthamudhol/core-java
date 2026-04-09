package com.xworkz.Alert;

public class PushAlert extends Alert{
    @Override
    void sendAlert() {
        System.out.println("Sending push alert");
    }
}
