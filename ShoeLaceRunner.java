class ShoeLaceRunner {

    public static void main(String[] args) {

        ShoeLace lace = new ShoeLace(
            "Nike",
            "Black",
            120.0,
            "Cotton",
            199.0,
            "Flat",
            false,
            "Sports Shoes",
            "India",
            2
        );

        System.out.println("Brand: " + lace.brand);
        System.out.println("Color: " + lace.color);
        System.out.println("Length: " + lace.length + " cm");
        System.out.println("Material: " + lace.material);
        System.out.println("Price: " + lace.price);
        System.out.println("Type: " + lace.type);
        System.out.println("Elastic: " + lace.isElastic);
        System.out.println("Suitable For: " + lace.shoeType);
        System.out.println("Origin Country: " + lace.originCountry);
        System.out.println("Quantity: " + lace.quantity);
    }
}