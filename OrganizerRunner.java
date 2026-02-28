class OrganizerRunner {

    public static void main(String[] args) {

        Organizer o1 = new Organizer("Desk Organizer","Office","Plastic","Black",499,"Cello",5,true,0.5,"Medium","Rectangle","Stationery","India","Cello Ltd","1 Year",false,"Plain",20,"Open",true);
		
        Organizer o2 = new Organizer("Travel Organizer","Bag","Fabric","Blue",899,"Skybags",8,true,0.8,"Large","Square","Travel","India","VIP","6 Months",true,"Printed",30,"Zip",true);
		
        Organizer o3 = new Organizer("Drawer Organizer","Home","Wood","Brown",699,"HomeTown",6,false,1.2,"Medium","Rectangle","Kitchen","India","HomeTown","1 Year",true,"Plain",25,"Slide",false);
		
        Organizer o4 = new Organizer("Makeup Organizer","Beauty","Acrylic","Transparent",999,"Lakme",10,false,0.7,"Small","Round","Cosmetics","India","Lakme","No Warranty",false,"Clear",15,"Lid",true);
		
        Organizer o5 = new Organizer("File Organizer","Office","Metal","Grey",799,"Kangaro",7,false,1.5,"Large","Rectangle","Documents","India","Kangaro","1 Year",false,"Plain",40,"Open",false);
		
        Organizer o6 = new Organizer("Car Organizer","Vehicle","Fabric","Black",1200,"AutoCare",9,true,1.0,"Large","Rectangle","Car Storage","India","AutoCare","6 Months",false,"Plain",35,"Zip",true);
		
        Organizer o7 = new Organizer("Closet Organizer","Home","Cloth","Beige",1500,"Ikea",12,false,2.0,"Large","Square","Clothes","Sweden","Ikea","2 Years",true,"Striped",50,"Zip",false);
		
        Organizer o8 = new Organizer("Cable Organizer","Electronics","Silicone","White",299,"Boat",4,true,0.2,"Small","Round","Cables","India","Boat","6 Months",true,"Plain",10,"Clip",true);
		
        Organizer o9 = new Organizer("Jewelry Organizer","Accessories","Velvet","Pink",1100,"Zara",15,false,0.9,"Medium","Rectangle","Jewelry","Spain","Zara","No Warranty",false,"Floral",60,"Lid",true);
		
        Organizer o10 = new Organizer("Toy Organizer","Kids","Plastic","Red",1300,"FunZone",6,true,1.8,"Large","Box","Toys","India","FunZone","1 Year",false,"Cartoon",45,"Lid",false);

        o1.displayOrganizer();
        o2.displayOrganizer();
        o3.displayOrganizer();
        o4.displayOrganizer();
        o5.displayOrganizer();
        o6.displayOrganizer();
        o7.displayOrganizer();
        o8.displayOrganizer();
        o9.displayOrganizer();
        o10.displayOrganizer();
    }
}