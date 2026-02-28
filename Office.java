class Office {

    String name;
    String location;
    int floorCount;
    int totalEmployees;
    String type;
    double area;
    boolean hasCafeteria;
    boolean hasParking;
    int meetingRooms;
    int cabins;
    String managerName;
    String openingTime;
    String closingTime;
    String companyName;
    String internetProvider;
    boolean hasSecurity;
    int securityStaff;
    String buildingColor;
    int washrooms;
    boolean centralAC;

    Office(String name, String location, int floorCount, int totalEmployees,
           String type, double area, boolean hasCafeteria, boolean hasParking,
           int meetingRooms, int cabins, String managerName, String openingTime,
           String closingTime, String companyName, String internetProvider,
           boolean hasSecurity, int securityStaff, String buildingColor,
           int washrooms, boolean centralAC) {

        this.name = name;
        this.location = location;
        this.floorCount = floorCount;
        this.totalEmployees = totalEmployees;
        this.type = type;
        this.area = area;
        this.hasCafeteria = hasCafeteria;
        this.hasParking = hasParking;
        this.meetingRooms = meetingRooms;
        this.cabins = cabins;
        this.managerName = managerName;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.companyName = companyName;
        this.internetProvider = internetProvider;
        this.hasSecurity = hasSecurity;
        this.securityStaff = securityStaff;
        this.buildingColor = buildingColor;
        this.washrooms = washrooms;
        this.centralAC = centralAC;
    }

    void displayOffice() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Floor Count: " + floorCount);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Type: " + type);
        System.out.println("Area: " + area);
        System.out.println("Has Cafeteria: " + hasCafeteria);
        System.out.println("Has Parking: " + hasParking);
        System.out.println("Meeting Rooms: " + meetingRooms);
        System.out.println("Cabins: " + cabins);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Company Name: " + companyName);
        System.out.println("Internet Provider: " + internetProvider);
        System.out.println("Has Security: " + hasSecurity);
        System.out.println("Security Staff: " + securityStaff);
        System.out.println("Building Color: " + buildingColor);
        System.out.println("Washrooms: " + washrooms);
        System.out.println("Central AC: " + centralAC);
        System.out.println("--------------------------------------");
    }
}