class StringInstrument extends Instrument {

    int strings;
    String material;
    boolean electric;
    String brand;
    double weight;

    void displayStringInstrument() {
        showInstrument();
        System.out.println("Strings: " + strings);
        System.out.println("Material: " + material);
        System.out.println("Electric: " + electric);
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
    }
}