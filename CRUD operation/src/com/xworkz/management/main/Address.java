package com.xworkz.management.main;

public class Address {
    public int no;
    public int pincode;
    public State state;   // added reference

    public Address(int no, int pincode, State state) {
        this.no = no;
        this.pincode = pincode;
        this.state = state;
    }
}
