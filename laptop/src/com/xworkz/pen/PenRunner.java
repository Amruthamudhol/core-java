package com.xworkz.pen;

public class PenRunner {
    public static void main(String[] args) {
        PenImpl pen = new PenImpl();

        pen.write();
        pen.openCap();
        pen.closeCap();

        System.out.println(Pen.color);
        System.out.println(Pen.price);
    }
}

