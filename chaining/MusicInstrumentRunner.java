class MusicInstrumentRunner {
    public static void main(String[] args) {

        MusicInstrumentDetails m1 = new MusicInstrumentDetails("Piano", "Keyboard", "Wood", 250000, "Casio", false);
 
        MusicInstrumentDetails m2 = new MusicInstrumentDetails("Flute", "Wind", "Bamboo", 1500, "Generic", true);
   

        MusicInstrumentDetails m3 = new MusicInstrumentDetails("Drum", "Percussion", "Metal", 7000, "Pearl", true);        

        m1.display();
        m2.display();
        m3.display();
    }
}