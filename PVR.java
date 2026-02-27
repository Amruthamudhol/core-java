class PVR {

    String theatreName;
    String location;
    String city;
    String state;
    int totalScreens;
    int totalSeats;
    String screenType;
    boolean hasIMAX;
    boolean has4DX;
    boolean hasDolbyAtmos;
    double ticketPrice;
    String foodCourtName;
    boolean parkingAvailable;
    String openingTime;
    String closingTime;
    String managerName;
    long contactNumber;
    String email;
    String website;
    int establishedYear;

    PVR(String theatreName, String location, String city, String state,
        int totalScreens, int totalSeats, String screenType,
        boolean hasIMAX, boolean has4DX, boolean hasDolbyAtmos,
        double ticketPrice, String foodCourtName, boolean parkingAvailable,
        String openingTime, String closingTime, String managerName,
        long contactNumber, String email, String website,
        int establishedYear) {

        this.theatreName = theatreName;
        this.location = location;
        this.city = city;
        this.state = state;
        this.totalScreens = totalScreens;
        this.totalSeats = totalSeats;
        this.screenType = screenType;
        this.hasIMAX = hasIMAX;
        this.has4DX = has4DX;
        this.hasDolbyAtmos = hasDolbyAtmos;
        this.ticketPrice = ticketPrice;
        this.foodCourtName = foodCourtName;
        this.parkingAvailable = parkingAvailable;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.managerName = managerName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.website = website;
        this.establishedYear = establishedYear;
    }

    void displayDetails() {
        System.out.println("Theatre Name: " + theatreName);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Total Screens: " + totalScreens);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Screen Type: " + screenType);
        System.out.println("IMAX Available: " + hasIMAX);
        System.out.println("4DX Available: " + has4DX);
        System.out.println("Dolby Atmos: " + hasDolbyAtmos);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Food Court: " + foodCourtName);
        System.out.println("Parking Available: " + parkingAvailable);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Website: " + website);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("--------------------------------------------------");
    }
}