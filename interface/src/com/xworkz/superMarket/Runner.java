package com.xworkz.superMarket;

public class Runner {

    public static void main(String[] args) {

        SuperMarket market = new DmartSuperMarket();

        Producer producer = new Producer(market);

        producer.producer();
    }
}