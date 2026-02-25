class Droplet {

    String shape;
    double volume;
    String color;
    double temperature;
    boolean isPure;

    Droplet() {
        System.out.println("Constructor 1: Default");
    }

    Droplet(String shape) {
        this.shape = shape;
    }

    Droplet(String shape, double volume) {
        this.shape = shape;
        this.volume = volume;
    }

    Droplet(String shape, double volume, String color) {
        this.shape = shape;
        this.volume = volume;
        this.color = color;
    }

    Droplet(String shape, double volume, String color, double temperature) {
        this.shape = shape;
        this.volume = volume;
        this.color = color;
        this.temperature = temperature;
    }

    Droplet(String shape, double volume, String color, double temperature, boolean isPure) {
        this.shape = shape;
        this.volume = volume;
        this.color = color;
        this.temperature = temperature;
        this.isPure = isPure;
    }
}