class Fort {
    int walls;       
    City city;       
    Material type;   

    Fort(int walls, City city, Material type) {
        this.walls = walls;
        this.city = city;
        this.type = type;
    }

    void printInfo() {
        System.out.println("Number of Walls: " + this.walls);

        if (this.city != null) {
            System.out.println("City Name: " + this.city.name);
        } else {
            System.out.println("City is null");
        }

        if (this.type != null) {
            System.out.println("Fort Material: " + this.type);
        } else {
            System.out.println("Fort Material is null");
        }

        System.out.println("----------------------");
    }
}