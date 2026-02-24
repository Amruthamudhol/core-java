class BucketRunner {

    public static void main(String[] args) {

        Bucket bucket = new Bucket("Cello", "Blue", 250.75, 20, "Plastic");

        System.out.println("Bucket brand: " + bucket.brand);
        System.out.println("Bucket color: " + bucket.color);
        System.out.println("Bucket price: " + bucket.price);
        System.out.println("Bucket capacity: " + bucket.capacity + " Liters");
        System.out.println("Bucket material: " + bucket.material);
    }
}