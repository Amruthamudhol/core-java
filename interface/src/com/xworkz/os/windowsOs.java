package com.xworkz.os;

public class windowsOs implements OS{
    @Override
    public void boot() {
        System.out.println("Windows is booting in Dell system");
    }

    @Override
    public void start() {
        System.out.println("Windows is starting");
    }

    @Override
    public void stop() {
        System.out.println("Windows is stopping");
    }
}
