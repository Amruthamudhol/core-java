class BlanketRunner {

    public static void main(String[] args) {

        Blanket blanket = new Blanket(
            "SleepWell",
            "Cotton",
            "Brown",
            1999.0,
            6.5,
            true
        );

        System.out.println("Brand: " + blanket.brand);
        System.out.println("Material: " + blanket.material);
        System.out.println("Color: " + blanket.color);
        System.out.println("Price: " + blanket.price);
        System.out.println("Size: " + blanket.size + " feet");
        System.out.println("Washable: " + blanket.isWashable);
    }
}