public class InstrumentRunner {

    public static void main(String[] args) {

        StringInstrument i1 = new StringInstrument();
        StringInstrument i2 = new StringInstrument();

        i1.name = "Guitar";
        i1.type = "String";
        i1.price = 5000;
        i1.strings = 6;
        i1.material = "Wood";
        i1.electric = true;
        i1.brand = "Yamaha";
        i1.weight = 2.5;

        i1.startPlay();
        i1.displayStringInstrument();
        i1.stopPlay();

        System.out.println("-------------");

        i2.name = "Violin";
        i2.type = "String";
        i2.price = 3000;
        i2.strings = 4;
        i2.material = "Maple";
        i2.electric = false;
        i2.brand = "Kadence";
        i2.weight = 1.2;

        i2.startPlay();
        i2.displayStringInstrument();
        i2.stopPlay();

        System.out.println("==== Parent type, subclass objects ===");

        Instrument ins1 = new StringInstrument();
        Instrument ins2 = new StringInstrument();

        ins1.name = "Bass";
        ins1.type = "String";
        ins1.price = 6500;

        ins1.startPlay();
        ins1.showInstrument();
        ins1.stopPlay();

        System.out.println("-------------");

        ins2.name = "Ukulele";
        ins2.type = "String";
        ins2.price = 2000;

        ins2.startPlay();
        ins2.showInstrument();
        ins2.stopPlay();

        System.out.println("==== Parent class instances ====");

        Instrument p1 = new Instrument();
        Instrument p2 = new Instrument();

        p1.name = "Drum";
        p1.type = "Percussion";
        p1.price = 4000;

        p1.startPlay();
        p1.showInstrument();
        p1.stopPlay();

        System.out.println("-------------");

        p2.name = "Flute";
        p2.type = "Wind";
        p2.price = 1500;

        p2.startPlay();
        p2.showInstrument();
        p2.stopPlay();
    }
}