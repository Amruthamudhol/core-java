class PocketRunner {

    public static void main(String[] args) {

        Pocket pocket = new Pocket("Front Pocket", "Blue", 1.5);

        System.out.println("Pocket type: " + pocket.type);
        System.out.println("Pocket color: " + pocket.color);
        System.out.println("Pocket capacity: " + pocket.capacity + " Kg");
    }
}