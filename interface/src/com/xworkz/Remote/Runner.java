package com.xworkz.remote;

public class Runner {
    public static void main(String[] args) {

        Remote tata = new TataRemote();
        User user1 = new User(tata);
        user1.operateTV();

        Remote lg = new LgRemote();
        User user2 = new User(lg);
        user2.operateTV();
    }
}
