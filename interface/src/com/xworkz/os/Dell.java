package com.xworkz.os;

public class Dell {
    private OS os;

    Dell(OS os)
    {
        this.os = os;
    }

    public void runSystem()
    {
        System.out.println("Running Dell system");

        if (os != null) {
            os.boot();
            os.start();
            os.stop();
        }
    }
}
