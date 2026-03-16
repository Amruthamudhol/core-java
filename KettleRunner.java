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

        boolean result = kettle.searchKettle("Philips");
        System.out.println("Search Result: " + result);
    }
}