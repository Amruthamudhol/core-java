public class ClockRunner {

    public static void main(String[] args) {

        AnalogClock ac1 = new AnalogClock();
        AnalogClock ac2 = new AnalogClock();

        ac1.brand = "Ajanta";
        ac1.color = "Black";
        ac1.price = 800;
        ac1.shape = "Round";
        ac1.hasSecondHand = true;
        ac1.Color = "White";
        ac1.size = 12;
        ac1.hasGlassCover = true;

        ac1.tick();
        ac1.setAlarm();
        ac1.showAnalogDetails();   

        System.out.println("---------------");

        Clock c1 = new AnalogClock();
        Clock c2 = new AnalogClock();

        c1.brand = "Titan";
        c1.color = "Brown";
        c1.price = 900;

        c1.tick();
        c1.setAlarm();
        c1.showClockDetails();    

        System.out.println("---------------");

        Clock c3 = new Clock();
        Clock c4 = new Clock();

        c3.brand = "Sonata";
        c3.color = "Silver";
        c3.price = 700;

        c3.tick();
        c3.setAlarm();
        c3.showClockDetails();   
    }
}