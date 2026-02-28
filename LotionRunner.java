class LotionRunner {

    public static void main(String[] args) {

        Lotion l1 = new Lotion("Nivea","Moisturizing","Mild",250,1,"Dry",false,true,"White","Bottle","12/2026","Nivea Ltd",0.2,"Cream","Germany",4.5,1200,false,"Aloe Vera",true);
		
        Lotion l2 = new Lotion("Vaseline","Hydrating","Cocoa",300,1,"Normal",false,true,"Brown","Bottle","11/2026","Unilever",0.3,"Cream","India",4.3,900,false,"Cocoa Butter",true);
		
        Lotion l3 = new Lotion("Himalaya","Herbal","Light",200,1,"All",true,true,"White","Tube","10/2026","Himalaya","0.15".length(),"Gel","India",4.2,850,false,"Neem",true);
		
        Lotion l4 = new Lotion("Dove","Nourishing","Soft",280,1,"Dry",false,true,"White","Bottle","09/2026","Unilever",0.25,"Cream","USA",4.6,1500,false,"Milk Extract",true);
		
        Lotion l5 = new Lotion("Lakme","Sun Protect","Floral",350,1,"Oily",false,true,"Pink","Tube","08/2026","Lakme",0.18,"Light","India",4.1,600,true,"SPF 30",false);
		
        Lotion l6 = new Lotion("Ponds","Brightening","Rose",270,1,"Normal",false,true,"White","Bottle","07/2026","Ponds",0.22,"Cream","India",4.0,700,false,"Vitamin B3",true);
		
        Lotion l7 = new Lotion("MamaEarth","Natural","Coconut",400,1,"Sensitive",true,true,"White","Pump","06/2026","MamaEarth",0.2,"Cream","India",4.4,1000,false,"Coconut Oil",true);
		
        Lotion l8 = new Lotion("WOW","Aloe","Fresh",450,1,"All",true,true,"Green","Pump","05/2026","WOW",0.21,"Gel","India",4.7,1300,false,"Aloe Vera",true);
		
        Lotion l9 = new Lotion("Biotique","Bio","Herbal",320,1,"Dry",true,true,"Green","Bottle","04/2026","Biotique",0.19,"Cream","India",4.3,750,false,"Herbs",true);
		
        Lotion l10 = new Lotion("Cetaphil","Moisturizer","Mild",500,1,"Sensitive",false,true,"White","Bottle","03/2026","Cetaphil",0.3,"Cream","USA",4.8,2000,false,"Glycerin",true);

        l1.displayLotion();
        l2.displayLotion();
        l3.displayLotion();
        l4.displayLotion();
        l5.displayLotion();
        l6.displayLotion();
        l7.displayLotion();
        l8.displayLotion();
        l9.displayLotion();
        l10.displayLotion();
    }
}