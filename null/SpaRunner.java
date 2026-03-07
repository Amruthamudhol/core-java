class SpaRunner {

    public static void main(String[] args) {

        Therapist therapist = new Therapist("Anita", 5);
        Service service = new Service("Massage", 60);
        Equipment1 equipment = new Equipment1("Massage Bed", 10);
        Manager manager = new Manager("Ravi", 8);
        Timing timing = new Timing("10 AM", "9 PM");

        Spa spa = new Spa("Relax Spa", 6, 1500.0, true, "Bangalore",
                therapist, service, equipment, manager, timing);

        System.out.println("Spa Name: " + spa.name);
        System.out.println("Rooms: " + spa.rooms);
        System.out.println("Price: " + spa.price);
        System.out.println("Open Today: " + spa.openToday);
        System.out.println("Location: " + spa.location);

        if (spa.therapist != null)
		{
            spa.therapist.printDetails();
        }
		else 
		{
            System.out.println("Therapist details not available");
        }

        if (spa.service != null) 
		{
            spa.service.printDetails();
        } 
		else
		{
            System.out.println("Service details not available");
        }

        System.out.println("Equipment: " + spa.equipment.equipmentName);
        System.out.println("Manager: " + spa.manager.managerName);
        System.out.println("Open Time: " + spa.timing.openTime);
    }
}