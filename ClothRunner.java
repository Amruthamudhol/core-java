class ClothRunner {

    public static void main(String[] args) {

        ClothStore store = new ClothStore();

        Cloth[] cloths = new Cloth[10];

        cloths[0] = new Cloth("Gucci", "Black", "Jacket", "L", 6500);
        cloths[1] = new Cloth("Nike", "Black", "Tshirt", "L", 900);
        cloths[2] = new Cloth("UCB", "Yellow", "Tshirt", "L", 950);
        cloths[3] = new Cloth("Puma", "green", "Shorts", "M", 1000);
        cloths[4] = new Cloth("H&M", "Grey", "Jeans", "L", 1700);
        cloths[5] = new Cloth("Levis", "Blue", "Jeans", "s", 2500);
        cloths[6] = new Cloth("Zara", "Black", "Shirt", "M", 1800);
        cloths[7] = new Cloth("AllenSolly", "Pink", "Top", "M", 950);
        cloths[8] = new Cloth("Roadster", "white", "Shirt", "S", 1500);
        cloths[9] = new Cloth("Adidas", "Blue", "Jacket", "XL", 2600);

        for(int i = 0; i < cloths.length; i++) {
            store.save(cloths[i]);
        }
    }
}