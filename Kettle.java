class Kettle {

    String[] kettles;
    int currentIndex = 0;

    // STORE
    void storeKettle(String kettleName) {

        System.out.println("Running storeKettle");

        if (kettles != null) {

            if (currentIndex < kettles.length) {

                kettles[currentIndex] = kettleName;
                System.out.println(kettleName + " stored at index " + currentIndex);

                currentIndex++;

            } else {
                System.out.println("Array is full");
            }

        } else {
            System.out.println("Array is null");
        }

        System.out.println("-----------------");
    }

    // SEARCH (FIXED)
    boolean searchKettle(String searchName) {

        System.out.println("Running searchKettle");

        if (kettles != null) {

            for (String kettle : kettles) {

                if (kettle != null && kettle.equals(searchName)) {
                    System.out.println("Match found: " + kettle);
                    System.out.println("-----------------");
                    return true;
                }
            }
        }

        System.out.println("Kettle not found");
        System.out.println("-----------------");
        return false;
    }

    // UPDATE BY INDEX
    boolean updateKettle(int index, String newName) {

        System.out.println("Running updateKettle by index");

        if (kettles != null && index >= 0 && index < currentIndex) {

            kettles[index] = newName;

            System.out.println("Updated at index " + index);
            System.out.println("-----------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("-----------------");
        return false;
    }

    // UPDATE BY NAME
    boolean updateKettle(String oldName, String newName) {

        System.out.println("Running updateKettle by name");

        if (kettles != null) {

            for (int i = 0; i < currentIndex; i++) {

                if (kettles[i] != null && kettles[i].equals(oldName)) {

                    kettles[i] = newName;

                    System.out.println("Updated: " + oldName + " to " + newName);
                    System.out.println("-----------------");
                    return true;
                }
            }
        }

        System.out.println("Kettle not found");
        System.out.println("-----------------");
        return false;
    }

    // DELETE BY INDEX
    boolean deleteKettle(int index) {

        System.out.println("Running deleteKettle by index");

        if (kettles != null && index >= 0 && index < currentIndex) {

            kettles[index] = null;

            System.out.println("Deleted at index " + index);
            System.out.println("-----------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("-----------------");
        return false;
    }

    // DELETE BY NAME
    boolean deleteKettle(String name) {

        System.out.println("Running deleteKettle by name");

        if (kettles != null) {

            for (int i = 0; i < currentIndex; i++) {

                if (kettles[i] != null && kettles[i].equals(name)) {

                    kettles[i] = null;

                    System.out.println("Deleted: " + name);
                    System.out.println("-----------------");
                    return true;
                }
            }
        }

        System.out.println("Kettle not found");
        System.out.println("-----------------");
        return false;
    }
}