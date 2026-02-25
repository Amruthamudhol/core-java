class DropletRunner {

    public static void main(String[] args) {

        Droplet d1 = new Droplet();
        System.out.println("Shape: " + d1.shape);
        System.out.println("Volume: " + d1.volume);
        System.out.println("Color: " + d1.color);
        System.out.println("Temperature: " + d1.temperature);
        System.out.println("Is Pure: " + d1.isPure);
        System.out.println("-------------------");

        Droplet d2 = new Droplet("Round");
        System.out.println("Shape: " + d2.shape);
        System.out.println("Volume: " + d2.volume);
        System.out.println("Color: " + d2.color);
        System.out.println("Temperature: " + d2.temperature);
        System.out.println("Is Pure: " + d2.isPure);
        System.out.println("-------------------");

        Droplet d3 = new Droplet("Oval", 10.5);
        System.out.println("Shape: " + d3.shape);
        System.out.println("Volume: " + d3.volume);
        System.out.println("Color: " + d3.color);
        System.out.println("Temperature: " + d3.temperature);
        System.out.println("Is Pure: " + d3.isPure);
        System.out.println("-------------------");

        Droplet d4 = new Droplet("Sphere", 20.3, "Transparent");
        System.out.println("Shape: " + d4.shape);
        System.out.println("Volume: " + d4.volume);
        System.out.println("Color: " + d4.color);
        System.out.println("Temperature: " + d4.temperature);
        System.out.println("Is Pure: " + d4.isPure);
        System.out.println("-------------------");

        Droplet d5 = new Droplet("Flat", 15.0, "Blue", 25.5);
        System.out.println("Shape: " + d5.shape);
        System.out.println("Volume: " + d5.volume);
        System.out.println("Color: " + d5.color);
        System.out.println("Temperature: " + d5.temperature);
        System.out.println("Is Pure: " + d5.isPure);
        System.out.println("-------------------");

        Droplet d6 = new Droplet("Irregular", 30.2, "Clear", 22.0, true);
        System.out.println("Shape: " + d6.shape);
        System.out.println("Volume: " + d6.volume);
        System.out.println("Color: " + d6.color);
        System.out.println("Temperature: " + d6.temperature);
        System.out.println("Is Pure: " + d6.isPure);
        System.out.println("-------------------");
    }
}