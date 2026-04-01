class  BuildingRunner {
    public static void main(String[] args) {

        SmartBuilding b1 = new SmartBuilding(5, "Tech Park", true, 25000.5, 'A', 120);

        SmartBuilding b2 = new SmartBuilding(3, "Office Block", false, 12000.0, 'B', 60);

        SmartBuilding b3 = new SmartBuilding(10, "Mall", true, 50000.75, 'A', 300);

        b1.display();
        b2.display();
        b3.display();
    }
}