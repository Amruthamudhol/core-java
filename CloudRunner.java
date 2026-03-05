class CloudRunner {

    public static void main(String[] args) {

        WaterDroplet droplet = new WaterDroplet(0.5,1000);
        Wind wind = new Wind(20,"East");
        Temperature1 temperature = new Temperature1(18.5,"Celsius");
        Location1 location = new Location1("HillArea",2000);
        Time time = new Time("Morning",8);

        Cloud cloud = new Cloud("Cumulus",3000.5,true,80,'C',
                droplet,wind,temperature,location,time);

        cloud.printInfo();
    }
}