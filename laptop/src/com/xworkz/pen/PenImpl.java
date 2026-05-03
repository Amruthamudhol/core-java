package com.xworkz.pen;

public class PenImpl implements Pen {
    public void write() {
        System.out.println("Pen is writing");
    }

    public void openCap() {
        System.out.println("Cap opened");
    }

    public void closeCap() {
        System.out.println("Cap closed");
    }

}
