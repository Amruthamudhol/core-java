class Tree {

    String[] trees;
    int currentIndex = 0;

    void storeTree(String treeName) {

        System.out.println("Running storeTree in Tree class");
        System.out.println("treeName: " + treeName);

        if (this.trees != null) {

            System.out.println("Array is not null");

            if (currentIndex < trees.length) {

                System.out.println("Index is within array length");

                trees[currentIndex] = treeName;
                System.out.println(treeName + " stored at index " + currentIndex);

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

    boolean searchTree(String searchName) {

        System.out.println("Running searchTree in Tree class");
        System.out.println("Searching for: " + searchName);

        if (trees != null) {

            System.out.println("Array is not null, starting comparison");

            for (String tree : trees) {

                System.out.println("Comparing tree: " + tree + " with searchName: " + searchName);

                if (tree != null && tree == searchName) {
                    System.out.println("Match found: " + tree);
                    return true;
                }
                else {
                    System.out.println("No match for this tree");
                }
            }

            System.out.println("Tree not found in the array");
        } 
        else {
            System.out.println("Array is null");
        }

        return false;
    }
}