class FarmerRunner {

    public static void main(String[] args) {

        FarmerStore store = new FarmerStore();

        Farmer[] farmers = new Farmer[10];

        farmers[0] = new Farmer("Ramesh", 11, "Sunflower", "Hubli", 2.5);
        farmers[1] = new Farmer("Suresh", 9, "Rice", "Dharwad", 4.0);
        farmers[2] = new Farmer("Ashok", 15, "Sugarcane", "Belgaum", 7.5);
        farmers[3] = new Farmer("Shivand", 7, "Cotton", "Haveri", 9.5);
        farmers[4] = new Farmer("Basu", 9, "Maize", "Gadag", 2.2);
        farmers[5] = new Farmer("Guru", 9, "Groundnut", "Bijapur", 5.8);
        farmers[6] = new Farmer("Prakash", 16, "Whea", "Bagalkot", 9.0);
        farmers[7] = new Farmer("Arun", 5, "Paddy", "Mysore", 3.9);
        farmers[8] = new Farmer("Jagadish", 10, "Ragi", "Tumkur", 4.8);
        farmers[9] = new Farmer("Sathish", 4, "Jowar", "Koppal", 9.2);

        for(int i = 0; i < farmers.length; i++) {
            store.save(farmers[i]);
        }
    }
}