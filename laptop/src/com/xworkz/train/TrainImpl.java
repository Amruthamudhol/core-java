package com.xworkz.train;

public class TrainImpl implements Train{
    public void startTrain() {
        System.out.println("Train started");
    }

    public void stopTrain() {
        System.out.println("Train stopped");
    }

    public void blowHorn() {
        System.out.println("Train horn blowing");
    }
}
