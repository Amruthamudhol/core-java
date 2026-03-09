class CashewRunner {
    public static void main(String[] args) {

        Warehouse w1 = new Warehouse("CoastalStorage");
        Warehouse w2 = new Warehouse("AgroDepot");
        Warehouse w3 = new Warehouse("NutReserve");
        Warehouse w4 = new Warehouse("FarmVault");

        Cashew c1 = new Cashew(2.5f, w1, CashewGrade.W180);
        Cashew c2 = new Cashew(3.1f, w2, CashewGrade.W210);
        Cashew c3 = new Cashew(2.8f, w3, CashewGrade.W240);
        Cashew c4 = new Cashew(3.3f, w4, CashewGrade.W320);

        c1.printInfo();
        c2.printInfo();
        c3.printInfo();
        c4.printInfo();
    }
}