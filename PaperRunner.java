class PaperRunner {
    public static void main(String[] args) {

        Paper p1 = new Paper("JK Paper","A4","White","A4",80,250.0,500,"Smooth",
                true,false,"JK Ltd","India","Matte","Printing","Wrapper",
                2.5,"A","High","0.1mm","12-2026");

        Paper p2 = new Paper("BILT","A3","White","A3",90,300.0,500,"Glossy",
                false,false,"BILT Ltd","India","Glossy","Drawing","Box",
                3.0,"A","Very High","0.12mm","11-2026");

        Paper p3 = new Paper("TNPL","Legal","Cream","Legal",75,200.0,500,"Smooth",
                true,false,"TNPL","India","Matte","Office","Wrapper",
                2.2,"B","Medium","0.09mm","10-2026");

        Paper p4 = new Paper("Century","A4","White","A4",100,350.0,500,"Rough",
                false,true,"Century Ltd","USA","Matte","Printing","Box",
                3.5,"Premium","High","0.15mm","09-2026");

        Paper p5 = new Paper("Double A","A4","White","A4",80,280.0,500,"Smooth",
                false,false,"Double A Co","Thailand","Glossy","Office","Wrapper",
                2.6,"A","High","0.1mm","08-2026");

        Paper p6 = new Paper("Navneet","Notebook","White","A4",70,180.0,400,"Smooth",
                true,false,"Navneet Ltd","India","Matte","Writing","Wrapper",
                2.0,"B","Medium","0.08mm","07-2026");

        Paper p7 = new Paper("ITC","A4","White","A4",85,260.0,500,"Smooth",
                true,false,"ITC Ltd","India","Matte","Printing","Box",
                2.7,"A","High","0.11mm","06-2026");

        Paper p8 = new Paper("Classmate","Notebook","White","A4",75,220.0,400,"Smooth",
                false,false,"ITC","India","Matte","Writing","Wrapper",
                2.1,"A","Medium","0.09mm","05-2026");

        Paper p9 = new Paper("PaperOne","A4","White","A4",80,290.0,500,"Glossy",
                false,false,"PaperOne Ltd","Malaysia","Glossy","Printing","Box",
                2.8,"Premium","Very High","0.1mm","04-2026");

        Paper p10 = new Paper("Trident","A3","White","A3",95,320.0,500,"Smooth",
                true,false,"Trident Ltd","India","Matte","Drawing","Wrapper",
                3.2,"A","High","0.13mm","03-2026");

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