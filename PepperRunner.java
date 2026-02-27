class  PepperRunner {
    public static void main(String[] args) {

        Pepper p1 = new Pepper("Black Pepper","Black","Whole","India","High",
                500.0,100,"SpiceKing","Packet",1.0,
                "12-2026",true,true,"A","Winter","ABC Traders",
                "Dry Place","ISO","Yes","Cooking");

        Pepper p2 = new Pepper("White Pepper","White","Powder","Vietnam","Medium",
                600.0,80,"SpicePro","Box",0.5,
                "11-2026",false,true,"B","Summer","XYZ Suppliers",
                "Cool Place","FSSAI","Yes","Cooking");

        Pepper p3 = new Pepper("Green Pepper","Green","Fresh","Brazil","Low",
                400.0,50,"FreshFarm","Packet",1.2,
                "10-2026",true,false,"A","Monsoon","Green Ltd",
                "Refrigerated","Organic","No","Salads");

        Pepper p4 = new Pepper("Red Pepper","Red","Flakes","China","High",
                550.0,70,"HotSpice","Packet",0.8,
                "09-2026",false,true,"A","Winter","Spice Hub",
                "Dry Place","ISO","Yes","Cooking");

        Pepper p5 = new Pepper("Organic Pepper","Black","Whole","India","High",
                700.0,60,"NatureSpice","Bag",1.5,
                "08-2026",true,true,"Premium","Winter","Organic Farm",
                "Dry Place","Organic","Yes","Cooking");

        Pepper p6 = new Pepper("Premium Pepper","Black","Powder","Sri Lanka","Medium",
                650.0,40,"RoyalSpice","Box",1.0,
                "07-2026",false,true,"Premium","Summer","Royal Traders",
                "Cool Place","ISO","Yes","Cooking");

        Pepper p7 = new Pepper("Crushed Pepper","Black","Crushed","India","Medium",
                480.0,90,"DailySpice","Packet",0.7,
                "06-2026",false,true,"B","Winter","Daily Traders",
                "Dry Place","FSSAI","No","Cooking");

        Pepper p8 = new Pepper("Exotic Pepper","Pink","Whole","Peru","Low",
                800.0,30,"ExoticFarm","Jar",0.6,
                "05-2026",true,false,"A","Spring","Exotic Ltd",
                "Cool Place","Organic","Yes","Salads");

        Pepper p9 = new Pepper("Hot Pepper","Red","Powder","Mexico","Very High",
                750.0,45,"HotKing","Packet",1.0,
                "04-2026",false,true,"A","Summer","Hot Suppliers",
                "Dry Place","ISO","Yes","Cooking");

        Pepper p10 = new Pepper("Mild Pepper","White","Whole","Indonesia","Low",
                520.0,85,"MildSpice","Bag",1.3,
                "03-2026",true,false,"B","Winter","Mild Traders",
                "Dry Place","FSSAI","No","Salads");

        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
        p4.printDetails();
        p5.printDetails();
        p6.printDetails();
        p7.printDetails();
        p8.printDetails();
        p9.printDetails();
        p10.printDetails();
    }
}