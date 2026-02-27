class PVRRunner {

    public static void main(String[] args) {

        PVR p1 = new PVR("PVR Orion","Rajajinagar","Bangalore","Karnataka",
                12, 1500,"IMAX",true,false,true,
                250.0,"PVR Cafe",true,"9 AM","11 PM",
                "Ramesh",9876543210L,"orion@pvr.com",
                "www.pvr.com",2010);

        PVR p2 = new PVR("PVR Phoenix","Whitefield","Bangalore","Karnataka",
                10, 1200,"4DX",false,true,true,
                300.0,"Snack Hub",true,"10 AM","12 AM",
                "Suresh",9876500000L,"phoenix@pvr.com",
                "www.pvr.com",2012);

        PVR p3 = new PVR("PVR Forum","Koramangala","Bangalore","Karnataka",
                8, 1000,"Standard",false,false,true,
                220.0,"Food Court",true,"9 AM","10:30 PM",
                "Anita",9876511111L,"forum@pvr.com",
                "www.pvr.com",2008);

        PVR p4 = new PVR("PVR Lulu","Kochi","Kochi","Kerala",
                9, 1300,"IMAX",true,false,true,
                280.0,"Cinema Cafe",true,"10 AM","11 PM",
                "Manoj",9876522222L,"lulu@pvr.com",
                "www.pvr.com",2015);

        PVR p5 = new PVR("PVR Express","Mysore Road","Bangalore","Karnataka",
                6, 800,"Standard",false,false,false,
                180.0,"Quick Bites",false,"10 AM","10 PM",
                "Deepa",9876533333L,"express@pvr.com",
                "www.pvr.com",2018);

        PVR p6 = new PVR("PVR Mall","Chennai","Chennai","Tamil Nadu",
                11, 1400,"4DX",false,true,true,
                260.0,"Movie Snacks",true,"9:30 AM","11 PM",
                "Kiran",9876544444L,"mall@pvr.com",
                "www.pvr.com",2013);

        PVR p7 = new PVR("PVR Central","Hyderabad","Hyderabad","Telangana",
                7, 900,"Standard",false,false,true,
                210.0,"Snack Bar",true,"9 AM","10 PM",
                "Rahul",9876555555L,"central@pvr.com",
                "www.pvr.com",2011);

        PVR p8 = new PVR("PVR IMAX","Mumbai","Mumbai","Maharashtra",
                14, 2000,"IMAX",true,false,true,
                350.0,"Premium Cafe",true,"10 AM","12 AM",
                "Neha",9876566666L,"imax@pvr.com",
                "www.pvr.com",2005);

        PVR p9 = new PVR("PVR Gold","Delhi","Delhi","Delhi",
                5, 600,"Gold Class",false,false,true,
                500.0,"Luxury Dining",true,"11 AM","11 PM",
                "Amit",9876577777L,"gold@pvr.com",
                "www.pvr.com",2016);

        PVR p10 = new PVR("PVR Metro","Pune","Pune","Maharashtra",
                8, 1100,"Standard",false,false,true,
                230.0,"Metro Snacks",true,"9 AM","11 PM",
                "Priya",9876588888L,"metro@pvr.com",
                "www.pvr.com",2014);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
        p4.displayDetails();
        p5.displayDetails();
        p6.displayDetails();
        p7.displayDetails();
        p8.displayDetails();
        p9.displayDetails();
        p10.displayDetails();
    }
}