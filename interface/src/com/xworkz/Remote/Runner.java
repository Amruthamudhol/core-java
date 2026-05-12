package com.xworkz.Remote;

public class Runner {
    public static void main(String[] args) {

        Remote remote = new TataRemote();

        User user = new User(remote);

        user.operateTV();
    }
}
