package com.xworkz.Notification;

public class EmailNotification extends Notification{
    @Override
    void send() {
        System.out.println("Sending Email notification");
    }
}
