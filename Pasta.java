class Pasta {

    String[] pastas;
    int currentIndex = 0;

    // STORE
    void storePasta(String pastaName) {

        System.out.println("Running storePasta");
        System.out.println("Pasta Name: " + pastaName);

        if (pastas != null) {

            if (currentIndex < pastas.length) {

                pastas[currentIndex] = pastaName;
                System.out.println(pastaName + " stored at index " + currentIndex);

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
    boolean searchPasta(String searchName) {

        System.out.println("Running searchPasta");
        System.out.println("Searching for: " + searchName);

        if (pastas != null) {

            for (String pasta : pastas) {

                System.out.println("Checking: " + pasta);

                if (pasta != null && pasta.equals(searchName)) {
                    System.out.println("Match found: " + pasta);
                    System.out.println("------------------");
                    return true;
                }
            }
        }

        System.out.println("Pasta not found");
        System.out.println("------------------");
        return false;
    }

    // UPDATE BY INDEX
    boolean updatePasta(int index, String newName) {

        System.out.println("Running updatePasta by index");

        if (pastas != null && index >= 0 && index < currentIndex) {

            System.out.println("Old Pasta: " + pastas[index]);

            pastas[index] = newName;

            System.out.println("Updated to: " + newName);
            System.out.println("------------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("------------------");
        return false;
    }

    // UPDATE BY NAME
    boolean updatePasta(String oldName, String newName) {

        System.out.println("Running updatePasta by name");

        if (pastas != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + pastas[i]);

                if (pastas[i] != null && pastas[i].equals(oldName)) {

                    System.out.println("Match found at index: " + i);

                    pastas[i] = newName;

                    System.out.println("Updated to: " + newName);
                    System.out.println("------------------");
                    return true;
                }
            }
        }

        System.out.println("Pasta not found");
        System.out.println("------------------");
        return false;
    }

    // DELETE BY INDEX
    boolean deletePasta(int index) {

        System.out.println("Running deletePasta by index");

        if (pastas != null && index >= 0 && index < currentIndex) {

            System.out.println("Deleting: " + pastas[index]);

            pastas[index] = null;

            System.out.println("Deleted successfully");
            System.out.println("------------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("------------------");
        return false;
    }

    // DELETE BY NAME
    boolean deletePasta(String name) {

        System.out.println("Running deletePasta by name");

        if (pastas != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + pastas[i]);

                if (pastas[i] != null && pastas[i].equals(name)) {

                    System.out.println("Match found at index: " + i);

                    pastas[i] = null;

                    System.out.println("Deleted successfully");
                    System.out.println("------------------");
                    return true;
                }
            }
        }

        System.out.println("Pasta not found");
        System.out.println("------------------");
        return false;
    }
}