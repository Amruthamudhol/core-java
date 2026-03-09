class Pumpkin {
    double weight;     
    Farm farm;         
    PumpkinColor color; 

    Pumpkin(double weight, Farm farm, PumpkinColor color) {
        this.weight = weight;
        this.farm = farm;
        this.color = color;
    }

    void printInfo() {
        System.out.println("Pumpkin Weight: " + this.weight);

        if (this.farm != null) {
            System.out.println("Farm Name: " + this.farm.name);
        } else {
            System.out.println("Farm is null");
        }
        System.out.println("----------------------");
    }
}
