class Cloud {

    String name;
    double altitude;
    boolean raining;
    int density;
    char type;

    WaterDroplet droplet;
    Wind wind;
    Temperature1 temperature;
    Location1 location;
    Time time;

    Cloud(String name,double altitude,boolean raining,int density,char type,
          WaterDroplet droplet,Wind wind,Temperature1 temperature,Location1 location,Time time) {

        this.name = name;
        this.altitude = altitude;
        this.raining = raining;
        this.density = density;
        this.type = type;

        this.droplet = droplet;
        this.wind = wind;
        this.temperature = temperature;
        this.location = location;
        this.time = time;
    }

    void printInfo() {

        System.out.println("Cloud Name: " + name);
        System.out.println("Altitude: " + altitude);
        System.out.println("Raining: " + raining);
        System.out.println("Density: " + density);
        System.out.println("Type: " + type);

        System.out.println("Droplet Size: " + droplet.size);
        System.out.println("Droplet Count: " + droplet.count);

        System.out.println("Wind Speed: " + wind.speed);
        System.out.println("Wind Direction: " + wind.direction);

        System.out.println("Temperature: " + temperature.degree);
        System.out.println("Unit: " + temperature.unit);

        System.out.println("Location: " + location.place);
        System.out.println("Height: " + location.height);

        System.out.println("Time Period: " + time.period);
        System.out.println("Hour: " + time.hour);
    }
}