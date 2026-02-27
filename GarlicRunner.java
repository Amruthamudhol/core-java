class GarlicRunner {
    public static void main(String[] args) {

        Garlic g1 = new Garlic("White Garlic","White","Medium",120.0,100,
                "India","FreshFarm",true,"A","Winter",
                "ABC Traders","Dry Storage",1.0,"Net Bag",
                "12-2026","Premium","High","Cooking","Yes","FSSAI");

        Garlic g2 = new Garlic("Purple Garlic","Purple","Large",150.0,80,
                "China","SpiceHub",false,"B","Summer",
                "XYZ Suppliers","Cool Storage",1.2,"Box",
                "11-2026","Good","Medium","Cooking","No","ISO");

        Garlic g3 = new Garlic("Organic Garlic","White","Small",180.0,60,
                "India","NatureFarm",true,"Premium","Winter",
                "Organic Ltd","Dry Storage",0.8,"Packet",
                "10-2026","Excellent","High","Medicine","Yes","Organic");

        Garlic g4 = new Garlic("Elephant Garlic","White","Extra Large",200.0,50,
                "USA","GlobalFarm",false,"A","Spring",
                "Global Traders","Cool Storage",1.5,"Box",
                "09-2026","Premium","Mild","Cooking","Yes","ISO");

        Garlic g5 = new Garlic("Desi Garlic","White","Small",110.0,120,
                "India","LocalFarm",true,"B","Winter",
                "Local Traders","Dry Storage",1.0,"Net Bag",
                "08-2026","Good","Strong","Pickles","No","FSSAI");

        Garlic g6 = new Garlic("Black Garlic","Black","Medium",300.0,40,
                "Korea","HealthFarm",true,"Premium","Autumn",
                "Health Suppliers","Cool Storage",0.7,"Jar",
                "07-2026","Excellent","Sweet","Medicine","Yes","Organic");

        Garlic g7 = new Garlic("Fresh Garlic","White","Large",130.0,90,
                "India","GreenFarm",false,"A","Winter",
                "Farm Traders","Dry Storage",1.1,"Packet",
                "06-2026","Premium","Medium","Cooking","Yes","FSSAI");

        Garlic g8 = new Garlic("Imported Garlic","White","Large",170.0,70,
                "Spain","EuroFarm",false,"A","Summer",
                "Euro Traders","Cool Storage",1.3,"Box",
                "05-2026","Good","Mild","Cooking","Yes","ISO");

        Garlic g9 = new Garlic("Farm Garlic","White","Medium",125.0,85,
                "India","VillageFarm",true,"B","Winter",
                "Village Traders","Dry Storage",1.0,"Net Bag",
                "04-2026","Good","Strong","Cooking","No","FSSAI");

        Garlic g10 = new Garlic("Premium Garlic","White","Large",210.0,55,
                "Australia","AussieFarm",false,"Premium","Spring",
                "Aussie Traders","Cool Storage",1.4,"Box",
                "03-2026","Excellent","Medium","Export","Yes","ISO");

        g1.showDetails();
        g2.showDetails();
        g3.showDetails();
        g4.showDetails();
        g5.showDetails();
        g6.showDetails();
        g7.showDetails();
        g8.showDetails();
        g9.showDetails();
        g10.showDetails();
    }
}