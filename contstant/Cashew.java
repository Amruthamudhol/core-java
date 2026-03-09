class Cashew {
    float moistureLevel;
    Warehouse warehouse;
    CashewGrade grade;

    Cashew(float moistureLevel, Warehouse warehouse, CashewGrade grade) {
        this.moistureLevel = moistureLevel;
        this.warehouse = warehouse;
        this.grade = grade;
    }

    void printInfo() {
        System.out.println("Moisture Level: " + this.moistureLevel);

        if (this.warehouse != null) {
            System.out.println("Warehouse Name: " + this.warehouse.name);
        } else {
            System.out.println("Warehouse is null");
        }

        System.out.println("-----------------------");
    }
}