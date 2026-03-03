class PenguinRunner {

    public static void main(String[] args) {
        Penguin p1 = new Penguin();
        Penguin p2 = new Penguin();

        p1.swim();
        p1.walk();
        p1.slideOnIce();
        p1.eatFish();
        p1.dive();
        p1.flapWings();
        p1.buildNest();
        p1.protectEggs();
        p1.careForChicks();
        p1.huddleForWarmth();
        p1.makeSound();
        p1.rest();
        p1.huntForFood();
        p1.shakeBody();
        p1.jumpIntoWater();

        p2.swim();
        p2.walk();
        p2.slideOnIce();
        p2.eatFish();
        p2.dive();
        p2.flapWings();
        p2.buildNest();
        p2.protectEggs();
        p2.careForChicks();
        p2.huddleForWarmth();
        p2.makeSound();
        p2.rest();
        p2.huntForFood();
        p2.shakeBody();
        p2.jumpIntoWater();

        Penguin.showSpecies();
        Penguin.showHabitat();
        Penguin.showDiet();
        Penguin.showLifespan();
        Penguin.showConservationStatus();
    }
}