class MissileRunner {

    public static void main(String[] args) {

        Missile m1 = new Missile();
        Missile m2 = new Missile();

        m1.launch();
        m1.igniteEngine();
        m1.accelerate();
        m1.changeDirection();
        m1.trackTarget();
        m1.lockTarget();
        m1.increaseAltitude();
        m1.decreaseAltitude();
        m1.activateGuidance();
        m1.detectObstacle();
        m1.avoidObstacle();
        m1.enterTargetZone();
        m1.impact();
        m1.selfDestruct();
        m1.shutdown();

        m2.launch();
        m2.igniteEngine();
        m2.accelerate();
        m2.changeDirection();
        m2.trackTarget();
        m2.lockTarget();
        m2.increaseAltitude();
        m2.decreaseAltitude();
        m2.activateGuidance();
        m2.detectObstacle();
        m2.avoidObstacle();
        m2.enterTargetZone();
        m2.impact();
        m2.selfDestruct();
        m2.shutdown();

        Missile.showType();
        Missile.showRange();
        Missile.showFuelType();
        Missile.showCountryUsage();
        Missile.showPurpose();
    }
}