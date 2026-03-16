class Steel {

    String[] steels;
    int currentIndex = 0;

    void storeSteel(String steelName) {

        System.out.println("Running storeSteel in Steel class");
        System.out.println("steelName: " + steelName);

        if (this.steels != null) {

            System.out.println("Array is not null");

            if (currentIndex < steels.length) {

                System.out.println("Index is within array length");

                steels[currentIndex] = steelName;
                System.out.println(steelName + " stored at index " + currentIndex);

                currentIndex++;

                System.out.println("Next index value is: " + currentIndex);
            }
            else {
                System.out.println("Array is full");
            }

        }
        else {
            System.out.println("Array is null");
        }
		System.out.println("------------------");
    }

    boolean searchSteel(String searchName) {

        System.out.println("Running searchSteel in Steel class");
        System.out.println("Searching for: " + searchName);

        if (steels != null) {

            System.out.println("Array is not null, starting comparison");

            for (String steel : steels) {

                System.out.println("Comparing steel: " + steel + " with searchName: " + searchName);

                if (steel != null && steel == searchName) {
                    System.out.println("Match found: " + steel);
                    return true;
                }
                else {
                    System.out.println("No match for this steel");
                }
            }

            System.out.println("Steel not found in the array");
        }
        else {
            System.out.println("Array is null");
        }

        return false;
    }
}