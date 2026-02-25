class Snow {

    String type;
    String color;
    double temperature;
    double thickness;
    boolean isMelting;

    Snow() {
        System.out.println("Constructor 1: Default");
    }

    Snow(String type) {
        this.type = type;
    }

    Snow(String type, String color) {
        this.type = type;
        this.color = color;
    }

    Snow(String type, String color, double temperature) {
        this.type = type;
        this.color = color;
        this.temperature = temperature;
    }

    Snow(String type, String color, double temperature, double thickness) {
        this.type = type;
        this.color = color;
        this.temperature = temperature;
        this.thickness = thickness;
    }

    Snow(String type, String color, double temperature, double thickness, boolean isMelting) {
        this.type = type;
        this.color = color;
        this.temperature = temperature;
        this.thickness = thickness;
        this.isMelting = isMelting;
    }
} 