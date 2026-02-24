class RacketRunner {

    public static void main(String[] args) {

        Racket racket = new Racket(
            "Yonex",
            "Badminton",
            "Blue",
            85.5,
            4500.0,
            "Carbon Fiber",
            "Synthetic Grip",
            67,
            "PV Sindhu",
            "India"
        );

        System.out.println("Brand: " + racket.brand);
        System.out.println("Type: " + racket.type);
        System.out.println("Color: " + racket.color);
        System.out.println("Weight: " + racket.weight + " grams");
        System.out.println("Price: " + racket.price);
        System.out.println("Material: " + racket.material);
        System.out.println("Grip Type: " + racket.gripType);
        System.out.println("Length: " + racket.length + " cm");
        System.out.println("Used By: " + racket.playerName);
        System.out.println("Country: " + racket.country);
    }
}