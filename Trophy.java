class Trophy {

    String trophyName;
    String sportName;
    String material;
    String color;
    double height;
    double weight;
    String shape;
    String eventName;
    int year;
    String winnerName;
    String runnerUpName;
    String organizer;
    String sponsor;
    String country;
    String city;
    double price;
    String engravingText;
    boolean isGoldPlated;
    String manufacturer;
    int quantityAvailable;

    Trophy(String trophyName, String sportName, String material, String color,
           double height, double weight, String shape, String eventName,
           int year, String winnerName, String runnerUpName,
           String organizer, String sponsor, String country, String city,
           double price, String engravingText, boolean isGoldPlated,
           String manufacturer, int quantityAvailable) {

        this.trophyName = trophyName;
        this.sportName = sportName;
        this.material = material;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.shape = shape;
        this.eventName = eventName;
        this.year = year;
        this.winnerName = winnerName;
        this.runnerUpName = runnerUpName;
        this.organizer = organizer;
        this.sponsor = sponsor;
        this.country = country;
        this.city = city;
        this.price = price;
        this.engravingText = engravingText;
        this.isGoldPlated = isGoldPlated;
        this.manufacturer = manufacturer;
        this.quantityAvailable = quantityAvailable;
    }

    void displayDetails() {
        System.out.println("Trophy Name: " + trophyName);
        System.out.println("Sport Name: " + sportName);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Event Name: " + eventName);
        System.out.println("Year: " + year);
        System.out.println("Winner: " + winnerName);
        System.out.println("Runner Up: " + runnerUpName);
        System.out.println("Organizer: " + organizer);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Country: " + country);
        System.out.println("City: " + city);
        System.out.println("Price: " + price);
        System.out.println("Engraving Text: " + engravingText);
        System.out.println("Gold Plated: " + isGoldPlated);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("--------------------------------------------------");
    }
}