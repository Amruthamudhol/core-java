class Contract {

    int years;
    double amount;

    Contract(int years, double amount) {
        this.years = years;
        this.amount = amount;
    }

    void printDetails() {
        System.out.println("Contract Details:");
        System.out.println("Years: " + this.years);
        System.out.println("Amount: " + this.amount);
    }
}