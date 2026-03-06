class Warranty1 {

    int years;
    boolean replacement;

    Warranty1(int years, boolean replacement) {
        this.years = years;
        this.replacement = replacement;
    }

    void printDetails() {
        System.out.println("Warranty Details:");
        System.out.println("Years: " + this.years);
        System.out.println("Replacement Available: " + this.replacement);
    }
}