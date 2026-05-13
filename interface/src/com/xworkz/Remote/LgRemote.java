package com.xworkz.remote;

public class LgRemote implements Remote{
    @Override
    public void turnOn()
    {
        System.out.println("LG TV is turned on");
    }

    @Override
    public void turnOff() {

        System.out.println("LG TV is turned off");
    }
}
