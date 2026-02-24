class JacketRunner {

    public static void main(String[] args) {

        Jacket jacket = new Jacket("Puma", "Black", 2999.99, "M", "Leather");

        System.out.println("Jacket brand: " + jacket.brand);
        System.out.println("Jacket color: " + jacket.color);
        System.out.println("Jacket price: " + jacket.price);
        System.out.println("Jacket size: " + jacket.size);
        System.out.println("Jacket material: " + jacket.material);
    }
}