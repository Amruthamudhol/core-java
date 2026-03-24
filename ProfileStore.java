class ProfileStore {

    Profile[] profiles = new Profile[10];
    int index = 0;

    void save(Profile profile) {

        if (profile != null && profiles != null) {

            if (index < profiles.length) {

                profiles[index] = profile;

                System.out.println("Profile stored successfully");
                System.out.println("Location: " + index);
                System.out.println("Profile details:");
                profile.printInfo();
                System.out.println("---------------------------");

                index++;

            } else {
                System.out.println("No space available in profiles array");
            }

        } else {
            System.out.println("Cannot store null profile");
        }
    }
}