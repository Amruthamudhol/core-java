class DmartRunner {
    public static void main(String[] args) {

        Manager manager = new Manager("Ramesh");
		Dmart dmart = new Dmart(100, manager, Department.ELECTRONICS);
		Manager manager1 = new Manager("Suresh");
		Dmart dmart1 = new Dmart(250, manager1, Department.CLOTHING);
		Manager manager2 = new Manager("Sathish");
		Dmart dmart2 = new Dmart(420, manager2, Department.HOME_APPLIANCES);
		Manager manager3 = new Manager("Mahesh");
		Dmart dmart3 = new Dmart(520, manager3, Department.SPORTS);
		dmart.printDetails();
		dmart1.printDetails();
		dmart2.printDetails();
		dmart3.printDetails();
    }
}