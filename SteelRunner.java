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

        System.out.println("================================");

        boolean result = steel.searchSteel("SAIL");
        System.out.println("Search Result: " + result);

        System.out.println("================================");

        boolean updateIndex = steel.updateSteel(1, "JSW Steel Ltd");
        System.out.println("Update by Index Result: " + updateIndex);

        System.out.println("================================");

        boolean updateName = steel.updateSteel("SAIL", "SAIL India");
        System.out.println("Update by Name Result: " + updateName);

        System.out.println("================================");

        boolean deleteIndex = steel.deleteSteel(3);
        System.out.println("Delete by Index Result: " + deleteIndex);

        System.out.println("================================");

        boolean deleteName = steel.deleteSteel("Essar Steel");
        System.out.println("Delete by Name Result: " + deleteName);

        System.out.println("================================");

        System.out.println("Final Steel List:");
        for (String s : steel.steels) {
            System.out.println(s);
        }
    }
}