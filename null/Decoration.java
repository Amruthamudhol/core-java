class Decoration {

    String type;
    String color;

    Decoration(String type, String color) {
        this.type = type;
        this.color = color;
    }

    void printDetails() {
        System.out.println("Decoration Type: " + this.type);
        System.out.println("Color: " + this.color);
    }
}