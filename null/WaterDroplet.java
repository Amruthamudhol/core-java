class WaterDroplet {

    double size;
    int count;

    WaterDroplet(double size, int count) {
        this.size = size;
        this.count = count;
    }

    void printDetails() {
        System.out.println("Droplet Size: " + this.size);
        System.out.println("Droplet Count: " + this.count);
    }
}