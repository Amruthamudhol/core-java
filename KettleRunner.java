class KettleRunner {

    public static void main(String[] args) {

        Kettle kettle = new Kettle();
        kettle.kettles = new String[10];

        kettle.storeKettle("Havells");
        kettle.storeKettle("Philips");
        kettle.storeKettle("Butterfly");
        kettle.storeKettle("Pigeon");
        kettle.storeKettle("Bajaj");
        kettle.storeKettle("Milton");
        kettle.storeKettle("Orpat");
        kettle.storeKettle("Kent");
        kettle.storeKettle("Morphy Richards");
        kettle.storeKettle("Prestige");

        System.out.println("======================");

        boolean result = kettle.searchKettle("Philips");
        System.out.println("Search Result: " + result);

        System.out.println("======================");

        boolean updateIndex = kettle.updateKettle(2, "Butterfly Plus");
        System.out.println("Update Index Result: " + updateIndex);

        System.out.println("======================");

        boolean updateName = kettle.updateKettle("Bajaj", "Bajaj Pro");
        System.out.println("Update Name Result: " + updateName);

        System.out.println("======================");

        boolean deleteIndex = kettle.deleteKettle(4);
        System.out.println("Delete Index Result: " + deleteIndex);

        System.out.println("======================");

        boolean deleteName = kettle.deleteKettle("Milton");
        System.out.println("Delete Name Result: " + deleteName);

        System.out.println("======================");

        System.out.println("Final Kettle List:");
        for (String k : kettle.kettles) {
            System.out.println(k);
        }
    }
}