public class SoldierRunner {

    public static void main(String[] args) {

        SpecialForces s1 = new SpecialForces();
        SpecialForces s2 = new SpecialForces();

        s1.name = "Arjun";
        s1.rank = "Captain";
        s1.serviceYears = 10;
        s1.unitName = "Alpha";
        s1.weaponType = "Rifle";
        s1.airborneQualified = true;
        s1.missionsCompleted = 25;
        s1.specialization = "Sniper";

        s1.reportDuty();
        s1.showSpecialForces();
        s1.standDown();

        System.out.println("-------------");

        s2.name = "Vikram";
        s2.rank = "Major";
        s2.serviceYears = 15;
        s2.unitName = "Bravo";
        s2.weaponType = "SMG";
        s2.airborneQualified = false;
        s2.missionsCompleted = 18;
        s2.specialization = "Demolition";

        s2.reportDuty();
        s2.showSpecialForces();
        s2.standDown();

        System.out.println("==== Parent type, subclass objects ===");

        Soldier so1 = new SpecialForces();
        Soldier so2 = new SpecialForces();

        so1.name = "Ravi";
        so1.rank = "Lieutenant";
        so1.serviceYears = 6;

        so2.name = "Kiran";
        so2.rank = "Colonel";
        so2.serviceYears = 20;

        so1.reportDuty();
        so1.showProfile();
        so1.standDown();

        System.out.println("-------------");

        so2.reportDuty();
        so2.showProfile();
        so2.standDown();

        System.out.println("==== Parent class instances ====");

        Soldier p1 = new Soldier();
        Soldier p2 = new Soldier();

        p1.name = "Manoj";
        p1.rank = "Sergeant";
        p1.serviceYears = 8;

        p1.reportDuty();
        p1.showProfile();
        p1.standDown();

        System.out.println("-------------");

        p2.name = "Ajay";
        p2.rank = "Corporal";
        p2.serviceYears = 5;

        p2.reportDuty();
        p2.showProfile();
        p2.standDown();
    }
}