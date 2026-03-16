class SteelRunner {

    public static void main(String[] args) {

        Steel steel = new Steel();
        steel.steels = new String[10];

        steel.storeSteel("Jindal Steel");
        steel.storeSteel("JSW Steel");
        steel.storeSteel("SAIL");
        steel.storeSteel("Bhushan Steel");
        steel.storeSteel("Essar Steel");
        steel.storeSteel("Tool Steel");
        steel.storeSteel("Alloy Steel");
        steel.storeSteel("Carbon Steel");
        steel.storeSteel("Stainless Steel");
        steel.storeSteel("TATA Steel");

        boolean result = steel.searchSteel("SAIL");
        System.out.println("Search Result: " + result);
    }
}