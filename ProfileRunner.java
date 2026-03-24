class ProfileRunner {

    public static void main(String[] args) {

        ProfileStore store = new ProfileStore();

        Profile[] profiles = new Profile[10];

        profiles[0] = new Profile("Amruta", 22, "amruta@gmail.com", "Hubli", 9876543210L);
        profiles[1] = new Profile("Neha", 21, "neha@gmail.com", "Kolkata", 9876543219L);
        profiles[2] = new Profile("Sneha", 21, "sneha@gmail.com", "Pune", 9876543212L);
        profiles[3] = new Profile("Amit", 24, "amit@gmail.com", "Delhi", 9876543213L);
        profiles[4] = new Profile("Pooja", 22, "pooja@gmail.com", "Mysore", 9876543217L);
        profiles[5] = new Profile("Kiran", 25, "kiran@gmail.com", "Chennai", 9876543215L);
        profiles[6] = new Profile("Ravi", 23, "ravi@gmail.com", "Hyderabad", 9876543216L);
        profiles[7] = new Profile("Rahul", 23, "rahul@gmail.com", "Bangalore", 9876543211L);
        profiles[8] = new Profile("Arjun", 24, "arjun@gmail.com", "Goa", 9876543218L);
        profiles[9] = new Profile("Priya", 22, "priya@gmail.com", "Mumbai", 9876543214L);

        for(int i = 0; i < profiles.length; i++) {
            store.save(profiles[i]);
        }
    }
}