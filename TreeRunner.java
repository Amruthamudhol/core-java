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

        boolean result = tree.searchTree("Mango");
        System.out.println("Search Result: " + result);
    }
}