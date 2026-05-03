package com.xworkz.train;

public class TrainRunner {
    public static void main(String[] args) {
        TrainImpl train = new TrainImpl();

        train.startTrain();
        train.stopTrain();
        train.blowHorn();

        System.out.println(Train.trainName);
        System.out.println(Train.coaches);
    }
}
