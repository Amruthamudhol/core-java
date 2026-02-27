class WallPaperRunner {
    public static void main(String[] args) {

        WallPaper w1 = new WallPaper("Asian Paints","Floral Bloom","Blue","Vinyl",
                "Smooth","10x5",1200.0,"Floral",true,true,
                "Matte","Living Room","India",10,5,2.5,
                "Self-Adhesive","High","2 Years","Asian Paints Ltd");

        WallPaper w2 = new WallPaper("DDecor","Modern Lines","Gray","Paper",
                "Textured","12x6",1500.0,"Geometric",false,true,
                "Glossy","Bedroom","India",12,6,3.0,
                "Glue","Medium","1 Year","DDecor Pvt Ltd");

        WallPaper w3 = new WallPaper("Nilaya","Royal Gold","Gold","Fabric",
                "Embossed","10x4",2500.0,"Classic",true,false,
                "Shiny","Hall","India",10,4,2.8,
                "Glue","High","3 Years","Nilaya Decor");

        WallPaper w4 = new WallPaper("Marshalls","Nature View","Green","Vinyl",
                "Matte","11x5",1800.0,"Nature",true,true,
                "Matte","Office","UK",11,5,2.6,
                "Self-Adhesive","High","2 Years","Marshalls Ltd");

        WallPaper w5 = new WallPaper("Excel","Brick Style","Red","PVC",
                "Rough","9x5",900.0,"Brick",false,true,
                "Matte","Kitchen","China",9,5,2.2,
                "Glue","Medium","1 Year","Excel Decor");

        WallPaper w6 = new WallPaper("Royal Touch","Silk Finish","Cream","Silk",
                "Soft","10x5",2200.0,"Plain",true,false,
                "Glossy","Bedroom","India",10,5,2.7,
                "Glue","High","2 Years","Royal Touch Ltd");

        WallPaper w7 = new WallPaper("DecoWorld","Kids Cartoon","Multi","Paper",
                "Smooth","8x4",800.0,"Cartoon",false,true,
                "Matte","Kids Room","India",8,4,1.9,
                "Self-Adhesive","Medium","1 Year","DecoWorld");

        WallPaper w8 = new WallPaper("DreamWalls","3D Stone","Brown","Foam",
                "3D","10x6",3000.0,"Stone",true,true,
                "Matte","Hall","USA",10,6,3.5,
                "Self-Adhesive","High","5 Years","DreamWalls Inc");

        WallPaper w9 = new WallPaper("HomeStyle","Abstract Art","Purple","Vinyl",
                "Smooth","9x5",1700.0,"Abstract",true,true,
                "Glossy","Living Room","India",9,5,2.4,
                "Glue","High","2 Years","HomeStyle Pvt Ltd");

        WallPaper w10 = new WallPaper("UrbanDecor","Minimal White","White","PVC",
                "Matte","10x5",1100.0,"Minimal",false,true,
                "Matte","Office","India",10,5,2.3,
                "Self-Adhesive","Medium","1 Year","UrbanDecor Ltd");

        w1.display();
        w2.display();
        w3.display();
        w4.display();
        w5.display();
        w6.display();
        w7.display();
        w8.display();
        w9.display();
        w10.display();
    }
}