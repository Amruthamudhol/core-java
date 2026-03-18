class Singer {

    String[] singers;
    int currentIndex = 0;

    // STORE
    void storeSinger(String singerName) {

        System.out.println("Running storeSinger");
        System.out.println("Singer Name: " + singerName);

        if (singers != null) {

            if (currentIndex < singers.length) {

                singers[currentIndex] = singerName;
                System.out.println(singerName + " stored at index " + currentIndex);

                currentIndex++;

            } else {
                System.out.println("Array is full");
            }

        } else {
            System.out.println("Array is null");
        }

        System.out.println("----------------");
    }

    // SEARCH (FIXED)
    boolean searchSinger(String searchName) {

        System.out.println("Running searchSinger");
        System.out.println("Searching for: " + searchName);

        if (singers != null) {

            for (String singer : singers) {

                System.out.println("Checking: " + singer);

                if (singer != null && singer.equals(searchName)) {
                    System.out.println("Match found: " + singer);
                    System.out.println("----------------");
                    return true;
                }
            }
        }

        System.out.println("Singer not found");
        System.out.println("----------------");
        return false;
    }

    // UPDATE BY INDEX
    boolean updateSinger(int index, String newName) {

        System.out.println("Running updateSinger by index");

        if (singers != null && index >= 0 && index < currentIndex) {

            System.out.println("Old Name: " + singers[index]);

            singers[index] = newName;

            System.out.println("Updated to: " + newName);
            System.out.println("----------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("----------------");
        return false;
    }

    // UPDATE BY NAME
    boolean updateSinger(String oldName, String newName) {

        System.out.println("Running updateSinger by name");

        if (singers != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + singers[i]);

                if (singers[i] != null && singers[i].equals(oldName)) {

                    System.out.println("Match found at index: " + i);

                    singers[i] = newName;

                    System.out.println("Updated to: " + newName);
                    System.out.println("----------------");
                    return true;
                }
            }
        }

        System.out.println("Singer not found");
        System.out.println("----------------");
        return false;
    }

    // DELETE BY INDEX
    boolean deleteSinger(int index) {

        System.out.println("Running deleteSinger by index");

        if (singers != null && index >= 0 && index < currentIndex) {

            System.out.println("Deleting: " + singers[index]);

            singers[index] = null;

            System.out.println("Deleted successfully");
            System.out.println("----------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("----------------");
        return false;
    }

    // DELETE BY NAME
    boolean deleteSinger(String name) {

        System.out.println("Running deleteSinger by name");

        if (singers != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + singers[i]);

                if (singers[i] != null && singers[i].equals(name)) {

                    System.out.println("Match found at index: " + i);

                    singers[i] = null;

                    System.out.println("Deleted successfully");
                    System.out.println("----------------");
                    return true;
                }
            }
        }

        System.out.println("Singer not found");
        System.out.println("----------------");
        return false;
    }
}