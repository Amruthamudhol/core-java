package com.xworkz.Plate;

public class Factory {
    String factoryName;
    String state;

    Factory(String factoryName, String state) {
        this.factoryName = factoryName;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Factory [factoryName=" + factoryName +
                ", state=" + state + "]";
    }
}
