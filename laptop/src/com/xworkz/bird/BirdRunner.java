package com.xworkz.bird;

public class BirdRunner {
    public static void main(String[] args) {
        BirdImpl bird = new BirdImpl();

        bird.fly();
        bird.eat();
        bird.sing();

        System.out.println(Bird.birdName);
        System.out.println(Bird.wings);
    }
}
