public class SlideRunner {

    public static void main(String[] args) {

        WaterSlide s1 = new WaterSlide();
        WaterSlide s2 = new WaterSlide();

        s1.type = "Spiral";
        s1.material = "Fiber";
        s1.height = 20;
        s1.waterFlow = true;
        s1.capacity = 15;
        s1.location = "Water Park";
        s1.color = "Blue";
        s1.safetyLevel = "High";

        s1.activate();
        s1.showDetails();
        s1.deactivate();

        System.out.println("-------------");

        s2.type = "Straight";
        s2.material = "Plastic";
        s2.height = 10;
        s2.waterFlow = false;
        s2.capacity = 8;
        s2.location = "Playground";
        s2.color = "Red";
        s2.safetyLevel = "Medium";

        s2.activate();
        s2.showDetails();
        s2.deactivate();

        System.out.println("==== Parent type, subclass objects ===");

        Slide sl1 = new WaterSlide();
        Slide sl2 = new WaterSlide();

        sl1.type = "Tunnel";
        sl1.material = "Steel";
        sl1.height = 18;

        sl1.activate();
        sl1.displayInfo();
        sl1.deactivate();

        System.out.println("-------------");

        sl2.type = "Wave";
        sl2.material = "Fiber";
        sl2.height = 22;

        sl2.activate();
        sl2.displayInfo();
        sl2.deactivate();

        System.out.println("== Parent class instances ====");

        Slide p1 = new Slide();
        Slide p2 = new Slide();

        p1.type = "Basic";
        p1.material = "Plastic";
        p1.height = 5;

        p1.activate();
        p1.displayInfo();
        p1.deactivate();

        System.out.println("-------------");

        p2.type = "Mini";
        p2.material = "Iron";
        p2.height = 6;

        p2.activate();
        p2.displayInfo();
        p2.deactivate();
    }
}