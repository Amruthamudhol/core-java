package com.xworkz.Remote;

public class User {
    Remote remote;

    User(Remote remote) {
        this.remote = remote;
    }

    public void operateTV() {
        System.out.println("User is operating the TV");

        if (remote != null) {
            remote.turnOn();
            remote.turnOff();
        }
    }
}
