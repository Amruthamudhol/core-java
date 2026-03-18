class TreeRunner {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.trees = new String[10];

        tree.storeTree("Neem");
        tree.storeTree("Mango");
        tree.storeTree("Banyan");
        tree.storeTree("Peepal");
        tree.storeTree("Coconut");
        tree.storeTree("Teak");
        tree.storeTree("Sandalwood");
        tree.storeTree("Eucalyptus");
        tree.storeTree("Pine");
        tree.storeTree("Oak");

        System.out.println("================================");

        boolean result = tree.searchTree("Mango");
        System.out.println("Search Result: " + result);

        System.out.println("================================");

        boolean updateIndex = tree.updateTree(1, "Mango Tree");
        System.out.println("Update by Index Result: " + updateIndex);

        System.out.println("================================");

        boolean updateName = tree.updateTree("Neem", "Neem Tree");
        System.out.println("Update by Name Result: " + updateName);

        System.out.println("================================");

        boolean deleteIndex = tree.deleteTree(3);
        System.out.println("Delete by Index Result: " + deleteIndex);

        System.out.println("================================");

        boolean deleteName = tree.deleteTree("Pine");
        System.out.println("Delete by Name Result: " + deleteName);

        System.out.println("================================");

        System.out.println("Final Tree List:");
        for (String t : tree.trees) {
            System.out.println(t);
        }
    }
}