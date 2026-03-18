class Steel {

    String[] steels;
    int currentIndex = 0;

    // STORE
    void storeSteel(String steelName) {

        System.out.println("Running storeSteel");
        System.out.println("Steel Name: " + steelName);

        if (steels != null) {

            if (currentIndex < steels.length) {

                steels[currentIndex] = steelName;
                System.out.println(steelName + " stored at index " + currentIndex);

                currentIndex++;

            } else {
                System.out.println("Array is full");
            }

        } else {
            System.out.println("Array is null");
        }

        System.out.println("------------------");
    }

    // SEARCH (FIXED)
    boolean searchSteel(String searchName) {

        System.out.println("Running searchSteel");
        System.out.println("Searching for: " + searchName);

        if (steels != null) {

            for (String steel : steels) {

                System.out.println("Checking: " + steel);

                if (steel != null && steel.equals(searchName)) {
                    System.out.println("Match found: " + steel);
                    System.out.println("------------------");
                    return true;
                }
            }
        }

        System.out.println("Steel not found");
        System.out.println("------------------");
        return false;
    }

    // UPDATE BY INDEX
    boolean updateSteel(int index, String newName) {

        System.out.println("Running updateSteel by index");

        if (steels != null && index >= 0 && index < currentIndex) {

            System.out.println("Old Steel: " + steels[index]);

            steels[index] = newName;

            System.out.println("Updated to: " + newName);
            System.out.println("------------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("------------------");
        return false;
    }

    // UPDATE BY NAME
    boolean updateSteel(String oldName, String newName) {

        System.out.println("Running updateSteel by name");

        if (steels != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + steels[i]);

                if (steels[i] != null && steels[i].equals(oldName)) {

                    System.out.println("Match found at index: " + i);

                    steels[i] = newName;

                    System.out.println("Updated to: " + newName);
                    System.out.println("------------------");
                    return true;
                }
            }
        }

        System.out.println("Steel not found");
        System.out.println("------------------");
        return false;
    }

    // DELETE BY INDEX
    boolean deleteSteel(int index) {

        System.out.println("Running deleteSteel by index");

        if (steels != null && index >= 0 && index < currentIndex) {

            System.out.println("Deleting: " + steels[index]);

            steels[index] = null;

            System.out.println("Deleted successfully");
            System.out.println("------------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("------------------");
        return false;
    }

    // DELETE BY NAME
    boolean deleteSteel(String name) {

        System.out.println("Running deleteSteel by name");

        if (steels != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + steels[i]);

                if (steels[i] != null && steels[i].equals(name)) {

                    System.out.println("Match found at index: " + i);

                    steels[i] = null;

                    System.out.println("Deleted successfully");
                    System.out.println("------------------");
                    return true;
                }
            }
        }

        System.out.println("Steel not found");
        System.out.println("------------------");
        return false;
    }
}