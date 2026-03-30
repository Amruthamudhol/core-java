public class FactoryRunner {

    public static void main(String[] args) {

        ElectronicsFactory ef1 = new ElectronicsFactory();
        ElectronicsFactory ef2 = new ElectronicsFactory();

        ef1.name = "ElectroMax";
        ef1.location = "Hydrabad";
        ef1.workers = 120;
        ef1.gadgetsProduced = 500;
        ef1.dailyProductionTarget = 100;
        ef1.factoryManager = "Raghav";
        ef1.safetyCertified = true;
        ef1.mainProduct = "Smartphones";

        ef1.beginWork();
        ef1.showProduction();
        ef1.endWork();

        System.out.println("-------------");

        ef2.name = "GadgetWorks";
        ef2.location = "Kolhapur";
        ef2.workers = 150;
        ef2.gadgetsProduced = 300;
        ef2.dailyProductionTarget = 80;
        ef2.factoryManager = "Pallavi";
        ef2.safetyCertified = false;
        ef2.mainProduct = "Laptops";

        ef2.beginWork();
        ef2.showProduction();
        ef2.endWork();

        System.out.println("==== Parent type, subclass objects ===");

        Factory f1 = new ElectronicsFactory();
        Factory f2 = new ElectronicsFactory();

        f1.name = "TechHub";
        f1.location = "Bangalore";
        f1.workers = 100;

        f2.name = "Innovatech";
        f2.location = "Pune";
        f2.workers = 180;

        f1.beginWork();
        f1.displayFactoryDetails();
        f1.endWork();

        System.out.println("-------------");

        f2.beginWork();
        f2.displayFactoryDetails();
        f2.endWork();

        System.out.println("==== Parent class instances ====");

        Factory p1 = new Factory();
        Factory p2 = new Factory();

        p1.name = "BasicFactory1";
        p1.location = "Noida";
        p1.workers = 50;

        p1.beginWork();
        p1.displayFactoryDetails();
        p1.endWork();

        System.out.println("-------------");

        p2.name = "BasicFactory2";
        p2.location = "Kolkata";
        p2.workers = 70;

        p2.beginWork();
        p2.displayFactoryDetails();
        p2.endWork();
    }
}