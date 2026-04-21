package com.xworkz.sim;

public class Sim {
    String network;
    String type;
    double balance;

    public Sim(String network, String type, double balance) {
        this.network = network;
        this.type = type;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Sim) {

            Sim right = (Sim) obj;

            if (this.network == right.network && this.type == right.type && this.balance == right.balance)
            {

                return true;

            } else {

                return false;
            }

        } else {

            return false;
        }
    }

    @Override
    public String toString() {
        return "Sim{" +
                "network='" + network + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
