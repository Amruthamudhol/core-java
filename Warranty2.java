class Warranty2{

    int years;
    String type;
    boolean valid;
    String provider;
    double coverage;

    Warranty2(int years, String type, boolean valid, String provider, double coverage) {
        this.years = years;
        this.type = type;
        this.valid = valid;
        this.provider = provider;
        this.coverage = coverage;
    }

    void printDetails(){
        System.out.println("Warranty Years: " + this.years);
        System.out.println("Warranty Type: " + this.type);
        System.out.println("Valid: " + this.valid);
        System.out.println("Provider: " + this.provider);
        System.out.println("Coverage: " + this.coverage);
    }
}