class Toxic {

    String substanceName;
    String chemicalFormula;
    String category;
    String color;
    String smell;
    String state;
    double molecularWeight;
    double boilingPoint;
    double meltingPoint;
    double density;
    int toxicityLevel;
    String exposureType;
    String healthEffects;
    String antidote;
    String storageCondition;
    String discoveredBy;
    int discoveredYear;
    String hazardSymbol;
    boolean isFlammable;
    String environmentalImpact;

    Toxic(String substanceName, String chemicalFormula, String category,
          String color, String smell, String state, double molecularWeight,
          double boilingPoint, double meltingPoint, double density,
          int toxicityLevel, String exposureType, String healthEffects,
          String antidote, String storageCondition, String discoveredBy,
          int discoveredYear, String hazardSymbol, boolean isFlammable,
          String environmentalImpact) {

        this.substanceName = substanceName;
        this.chemicalFormula = chemicalFormula;
        this.category = category;
        this.color = color;
        this.smell = smell;
        this.state = state;
        this.molecularWeight = molecularWeight;
        this.boilingPoint = boilingPoint;
        this.meltingPoint = meltingPoint;
        this.density = density;
        this.toxicityLevel = toxicityLevel;
        this.exposureType = exposureType;
        this.healthEffects = healthEffects;
        this.antidote = antidote;
        this.storageCondition = storageCondition;
        this.discoveredBy = discoveredBy;
        this.discoveredYear = discoveredYear;
        this.hazardSymbol = hazardSymbol;
        this.isFlammable = isFlammable;
        this.environmentalImpact = environmentalImpact;
    }

    void showDetails() {
        System.out.println("Substance Name: " + substanceName);
        System.out.println("Chemical Formula: " + chemicalFormula);
        System.out.println("Category: " + category);
        System.out.println("Color: " + color);
        System.out.println("Smell: " + smell);
        System.out.println("State: " + state);
        System.out.println("Molecular Weight: " + molecularWeight);
        System.out.println("Boiling Point: " + boilingPoint);
        System.out.println("Melting Point: " + meltingPoint);
        System.out.println("Density: " + density);
        System.out.println("Toxicity Level: " + toxicityLevel);
        System.out.println("Exposure Type: " + exposureType);
        System.out.println("Health Effects: " + healthEffects);
        System.out.println("Antidote: " + antidote);
        System.out.println("Storage Condition: " + storageCondition);
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Discovered Year: " + discoveredYear);
        System.out.println("Hazard Symbol: " + hazardSymbol);
        System.out.println("Is Flammable: " + isFlammable);
        System.out.println("Environmental Impact: " + environmentalImpact);
        System.out.println("--------------------------------------------------");
    }
}