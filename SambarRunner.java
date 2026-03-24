class SambarRunner {

    public static void main(String[] args) {

        SambarStore store = new SambarStore();

        Sambar[] sambars = new Sambar[10];

        sambars[0] = new Sambar("Udupi", "Karnataka", 2, 1.5, "Toor Dal");
        sambars[1] = new Sambar("Pumpkin", "Kerala", 1, 1.6, "Pumpkin");
        sambars[2] = new Sambar("Andhra", "Andhra", 5, 2.5, "Red Chilli");
        sambars[3] = new Sambar("Garlic", "Andhra", 4, 2.1, "Garlic");
        sambars[4] = new Sambar("Onion", "Tamil Nadu", 4, 1.2, "Small Onion");
        sambars[5] = new Sambar("Mixed Veg", "South India", 2, 2.3, "Vegetables");
        sambars[6] = new Sambar("Drumstick", "Karnataka", 3, 1.7, "Drumstick");
        sambars[7] = new Sambar("Tomato", "Tamil Nadu", 2, 1.4, "Tomato");
        sambars[8] = new Sambar("Kerala", "Kerala", 3, 1.8, "Vegetables");
        sambars[9] = new Sambar("Hotel Style", "Tamil Nadu", 3, 2.0, "Toor Dal");

        for(int i = 0; i < sambars.length; i++) {
            store.save(sambars[i]);
        }
    }
}