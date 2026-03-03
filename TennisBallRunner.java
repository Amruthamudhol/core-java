class TennisBallRunner {

    public static void main(String[] args) {

        TennisBall t1 = new TennisBall();
        TennisBall t2 = new TennisBall();

        t1.bounce();
        t1.roll();
        t1.spin();
        t1.hitWithRacket();
        t1.serve();
        t1.crossNet();
        t1.landOnCourt();
        t1.moveFast();
        t1.slowDown();
        t1.changeDirection();
        t1.compressOnImpact();
        t1.returnShot();
        t1.goOutOfBounds();
        t1.getCollected();
        t1.getStored();

        t2.bounce();
        t2.roll();
        t2.spin();
        t2.hitWithRacket();
        t2.serve();
        t2.crossNet();
        t2.landOnCourt();
        t2.moveFast();
        t2.slowDown();
        t2.changeDirection();
        t2.compressOnImpact();
        t2.returnShot();
        t2.goOutOfBounds();
        t2.getCollected();
        t2.getStored();

        TennisBall.showColor();
        TennisBall.showWeight();
        TennisBall.showSize();
        TennisBall.showMaterial();
        TennisBall.showBrandTypes();
    }
}