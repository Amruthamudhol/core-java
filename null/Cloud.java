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

        if(droplet != null)
		{
            droplet.printDetails();
        } 
		else 
		{
            System.out.println("Droplet details not available");
        }

        if(wind != null)
		{
            wind.printDetails();
        } 
		else 
		{
            System.out.println("Wind details not available");
        }

        if(temperature != null)
		{
            temperature.printDetails();
        } 
		else 
		{
            System.out.println("Temperature details not available");
        }

        System.out.println("Location: " + location.place);
        System.out.println("Height: " + location.height);

        System.out.println("Time Period: " + time.period);
        System.out.println("Hour: " + time.hour);
    }
}