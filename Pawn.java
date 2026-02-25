class Pawn {

    String color;
    String position;
    String material;
    int value;
    boolean isActive;

    Pawn() {
        System.out.println("Constructor 1: Default");
    }

    Pawn(String color) {
        this.color = color;
    }

    Pawn(String color, String position) {
        this.color = color;
        this.position = position;
    }

    Pawn(String color, String position, String material) {
        this.color = color;
        this.position = position;
        this.material = material;
    }

    Pawn(String color, String position, String material, int value) {
        this.color = color;
        this.position = position;
        this.material = material;
        this.value = value;
    }

    Pawn(String color, String position, String material, int value, boolean isActive) {
        this.color = color;
        this.position = position;
        this.material = material;
        this.value = value;
        this.isActive = isActive;
    }
}