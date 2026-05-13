package com.xworkz.os;

public class LinuxOs implements OS{
    @Override
    public void boot() {
        System.out.println("Linux is booting in Dell system");
    }

    @Override
    public void start() {
        System.out.println("Linux is starting");
    }

    @Override
    public void stop() {
        System.out.println("Linux is stopping");
    }
}
