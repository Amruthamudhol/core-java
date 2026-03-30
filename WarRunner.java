public class WarRunner {

    public static void main(String[] args) {

       
        ModernWar w1 = new ModernWar();
        ModernWar w2 = new ModernWar();

        w1.warName = "Kargil War";
        w1.year = 1999;
        w1.country = "India vs Pakistan";
        w1.weaponType = "Artillery";
        w1.soldiers = 20000;
        w1.airSupport = true;
        w1.commander = "Gen. Malik";
        w1.outcome = "India Victory";

        w1.declareWar();
        w1.ceaseFire();
        w1.showModernWarDetails();

        System.out.println("-------------");

        w2.warName = "Gulf War";
        w2.year = 1991;
        w2.country = "USA vs Iraq";
        w2.weaponType = "Missiles";
        w2.soldiers = 35000;
        w2.airSupport = true;
        w2.commander = "Gen. Schwarzkopf";
        w2.outcome = "Coalition Victory";

        w2.declareWar();
        w2.ceaseFire();
        w2.showModernWarDetails();

        System.out.println("-------------");

   
        War w3 = new ModernWar();
        War w4 = new ModernWar();

        w3.warName = "Indo-China War";
        w3.year = 1962;
        w3.country = "India vs China";

        w3.declareWar();
        w3.ceaseFire();
        w3.showWarDetails();

        System.out.println("-------------");

        w4.warName = "Vietnam War";
        w4.year = 1975;
        w4.country = "USA vs Vietnam";

        w4.declareWar();
        w4.ceaseFire();
        w4.showWarDetails();

        System.out.println("-------------");

        War w5 = new War();
        War w6 = new War();

        w5.warName = "World War I";
        w5.year = 1918;
        w5.country = "Global";

        w5.declareWar();
        w5.ceaseFire();
        w5.showWarDetails();

        System.out.println("-------------");

        w6.warName = "World War II";
        w6.year = 1945;
        w6.country = "Global";

        w6.declareWar();
        w6.ceaseFire();
        w6.showWarDetails();
    }
}