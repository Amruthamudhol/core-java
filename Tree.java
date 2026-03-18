class Tree {

    String[] trees;
    int currentIndex = 0;

    // STORE
    void storeTree(String treeName) {

        System.out.println("Running storeTree");
        System.out.println("Tree Name: " + treeName);

        if (trees != null) {

            if (currentIndex < trees.length) {

                trees[currentIndex] = treeName;
                System.out.println(treeName + " stored at index " + currentIndex);

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
    boolean searchTree(String searchName) {

        System.out.println("Running searchTree");
        System.out.println("Searching for: " + searchName);

        if (trees != null) {

            for (String tree : trees) {

                System.out.println("Checking: " + tree);

                if (tree != null && tree.equals(searchName)) {
                    System.out.println("Match found: " + tree);
                    System.out.println("------------------");
                    return true;
                }
            }
        }

        System.out.println("Tree not found");
        System.out.println("------------------");
        return false;
    }

    // UPDATE BY INDEX
    boolean updateTree(int index, String newName) {

        System.out.println("Running updateTree by index");

        if (trees != null && index >= 0 && index < currentIndex) {

            System.out.println("Old Tree: " + trees[index]);

            trees[index] = newName;

            System.out.println("Updated to: " + newName);
            System.out.println("------------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("------------------");
        return false;
    }

    // UPDATE BY NAME
    boolean updateTree(String oldName, String newName) {

        System.out.println("Running updateTree by name");

        if (trees != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + trees[i]);

                if (trees[i] != null && trees[i].equals(oldName)) {

                    System.out.println("Match found at index: " + i);

                    trees[i] = newName;

                    System.out.println("Updated to: " + newName);
                    System.out.println("------------------");
                    return true;
                }
            }
        }

        System.out.println("Tree not found");
        System.out.println("------------------");
        return false;
    }

    // DELETE BY INDEX
    boolean deleteTree(int index) {

        System.out.println("Running deleteTree by index");

        if (trees != null && index >= 0 && index < currentIndex) {

            System.out.println("Deleting: " + trees[index]);

            trees[index] = null;

            System.out.println("Deleted successfully");
            System.out.println("------------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("------------------");
        return false;
    }

    // DELETE BY NAME
    boolean deleteTree(String name) {

        System.out.println("Running deleteTree by name");

        if (trees != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + trees[i]);

                if (trees[i] != null && trees[i].equals(name)) {

                    System.out.println("Match found at index: " + i);

                    trees[i] = null;

                    System.out.println("Deleted successfully");
                    System.out.println("------------------");
                    return true;
                }
            }
        }

        System.out.println("Tree not found");
        System.out.println("------------------");
        return false;
    }
}