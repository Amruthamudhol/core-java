class Acid {

    String name;
    String formula;
    int molarity;
    String strength;
	double phValue;

    Acid(String name, String formula, int molarity, String strength, double phValue) {
        this.name = name;
        this.formula = formula;
        this.phValue = phValue;
        this.strength = strength;
        this.molarity = molarity;
    }

    void showDetails() {
        System.out.println("Name: " + name +
                           ", Formula: " + formula +
                           ", pH Value: " + phValue +
                           ", Strength: " + strength +
                           ", Molarity: " + molarity);
    }
}