class Wind {

    int speed;
    String direction;

    Wind(int speed, String direction) {
        this.speed = speed;
        this.direction = direction;
    }

    void printDetails() {
        System.out.println("Wind Speed: " + this.speed);
        System.out.println("Wind Direction: " + this.direction);
    }
}