class Equipment {

    String equipmentName;
    int count;

    Equipment(String equipmentName, int count) {
        this.equipmentName = equipmentName;
        this.count = count;
    }

    void display() {
        System.out.println("Equipment: " + this.equipmentName + " Count: " + this.count);
    }
}