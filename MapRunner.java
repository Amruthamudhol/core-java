class MapRunner {
    public static void main(String[] args) {

        Map m1 = new Map("India Political Map","India","Karnataka","Bangalore","Political",1.0,"English","ABC Publisher",2023,150.0,"A2","High",true,"Mercator","South India",  "Multi","1st","ISBN001",0.5,"Educational");

        Map m2 = new Map("World Map","World","NA","NA","Physical",2.0,"English","XYZ Publisher",2022,
                200.0,"A1","Medium",false,"Robinson"," Global",  "Color","2nd","ISBN002",0.7,"Office");       
                
        Map m3 = new Map("Asia Map","Asia","NA","NA","Political",1.5,"English","MapHouse",2021,180.0,"A3","High",true,			"Mercator","Asia", "Multi","3rd","ISBN003",0.6,"Educational");

        Map m4 = new Map("Europe Map","Europe","NA","NA", "Physical",1.8,"French","GeoPub",2020, 170.0,"A2","Medium",		false,"Robinson","Europe","Color","1st","ISBN004",0.5,"Travel");

        Map m5 = new Map("USA Map","USA","California","LA","Road",1.2,"English","US Pub",2023,120.0,"A4","Low",true,		"Mercator","USA","Multi","4th","ISBN005",0.4,"Navigation");

        Map m6 = new Map("Africa Map","Africa","NA","NA", "Political",2.2,"English","MapWorld",2022, 160.0,"A2","High",				true,"Robinson","Africa","Color","2nd","ISBN006",0.6,"Educational");

        Map m7 = new Map("Australia Map","Australia","NA","NA", "Physical",1.9,"English","GeoMaps",2021,
                140.0,"A3","Medium",false,"Mercator","Australia","Multi","1st","ISBN007",0.5,"Travel");

        Map m8 = new Map("China Map","China","NA","Beijing", "Political",1.4,"Chinese","AsiaPub",2023, 190.0,"A2",			"High",true,"Mercator","China", "Color","3rd","ISBN008",0.6,"Educational");

        Map m9 = new Map("Russia Map","Russia","NA","Moscow","Physical",2.5,"Russian","EuroPub",2022,210.0,"A1","High",			false,"Robinson","Russia","Multi","2nd","ISBN009",0.8,"Office");

        Map m10 = new Map("South America Map","Brazil","NA","NA",  "Political",1.6,"Spanish","LatamPub",2023,
                175.0,"A2","Medium",true,"Mercator","South America","Color","1st","ISBN010",0.6,"Educational");

        m1.displayDetails();
        m2.displayDetails();
        m3.displayDetails();
        m4.displayDetails();
        m5.displayDetails();
        m6.displayDetails();
        m7.displayDetails();
        m8.displayDetails();
        m9.displayDetails();
        m10.displayDetails();
    }
}