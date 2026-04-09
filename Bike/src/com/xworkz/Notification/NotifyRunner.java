package com.xworkz.Notification;

public class NotifyRunner {
    public static void main(String[] args) {
        Notification n = new EmailNotification();
        n.send();
    }
}
