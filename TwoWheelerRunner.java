public class TwoWheelerRunner {

    public static void main(String[] args) {

        TwoWheeler bike = new TwoWheeler();

        bike.models = new String[20];

        bike.storeModel("Bajaj Pulsar");
        bike.storeModel("Hero Splendor");
        bike.storeModel("TVS Apache");
        bike.storeModel("Yamaha R15");
        bike.storeModel("Honda Activa");
        bike.storeModel("KTM Duke 200");
        bike.storeModel("Bajaj Platina");
        bike.storeModel("TVS Jupiter");
        bike.storeModel("Suzuki Access 125");
        bike.storeModel("Royal Enfield Classic 350");

        bike.storeModel("Hero HF Deluxe");
        bike.storeModel("Honda Shine");
        bike.storeModel("Hero Xtreme 160R");
        bike.storeModel("TVS Raider");
        bike.storeModel("Bajaj Dominar 400");
        bike.storeModel("Yamaha MT15");
        bike.storeModel("Suzuki Gixxer");
        bike.storeModel("Honda Dio");
        bike.storeModel("Yamaha FZ");
        bike.storeModel("TVS Ntorq");
		bike.storeModel("TVS Ntorq");
		
		boolean result = bike.searchModel("TVS Apache");
		System.out.println("Search result: " + result);
    }
}