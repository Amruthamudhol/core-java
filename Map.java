class Map {

    String mapName;
    String country;
    String state;
    String city;
    String type;
    double scale;
    String language;
    String publisher;
    int publishYear;
    double price;
    String size;
    String paperQuality;
    boolean isLaminated;
    String projectionType;
    String regionCovered;
    String colorType;
    String edition;
    String isbn;
    double weight;
    String usageType;

    Map(String mapName, String country, String state, String city, String type,
        double scale, String language, String publisher, int publishYear,
        double price, String size, String paperQuality, boolean isLaminated,
        String projectionType, String regionCovered, String colorType,
        String edition, String isbn, double weight, String usageType) {

        this.mapName = mapName;
        this.country = country;
        this.state = state;
        this.city = city;
        this.type = type;
        this.scale = scale;
        this.language = language;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.price = price;
        this.size = size;
        this.paperQuality = paperQuality;
        this.isLaminated = isLaminated;
        this.projectionType = projectionType;
        this.regionCovered = regionCovered;
        this.colorType = colorType;
        this.edition = edition;
        this.isbn = isbn;
        this.weight = weight;
        this.usageType = usageType;
    }

    void displayDetails() {
        System.out.println("Map Name: " + mapName);
        System.out.println("Country: " + country);
        System.out.println("State: " + state);
        System.out.println("City: " + city);
        System.out.println("Type: " + type);
        System.out.println("Scale: " + scale);
        System.out.println("Language: " + language);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publish Year: " + publishYear);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Paper Quality: " + paperQuality);
        System.out.println("Is Laminated: " + isLaminated);
        System.out.println("Projection Type: " + projectionType);
        System.out.println("Region Covered: " + regionCovered);
        System.out.println("Color Type: " + colorType);
        System.out.println("Edition: " + edition);
        System.out.println("ISBN: " + isbn);
        System.out.println("Weight: " + weight);
        System.out.println("Usage Type: " + usageType);
        System.out.println("--------------------------------------------------");
    }
}