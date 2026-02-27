class StandRunner {
    public static void main(String[] args) {

        Stand s1 = new Stand("Laptop Stand","Electronics","Aluminum","Silver",
                1500.0,30.0,25.0,1.2,"TechBrand","Tech Ltd","India",
                "Office",true,true,"1 Year","Rectangle","Matte",
                10,"LS100","Available");

        Stand s2 = new Stand("Mobile Stand","Electronics","Plastic","Black",
                300.0,15.0,10.0,0.3,"Mobitech","Mobitech Ltd","China",
                "Home",true,false,"6 Months","Square","Glossy",
                2,"MS200","Available");

        Stand s3 = new Stand("TV Stand","Furniture","Wood","Brown",
                5000.0,120.0,60.0,20.0,"HomeStyle","Furniture Co","India",
                "Living Room",false,false,"2 Years","Rectangle","Wood Finish",
                50,"TV300","Available");

        Stand s4 = new Stand("Mic Stand","Music","Steel","Black",
                1200.0,100.0,30.0,3.0,"SoundPro","Audio Ltd","USA",
                "Studio",true,true,"1 Year","Round","Matte",
                15,"MC400","Out of Stock");

        Stand s5 = new Stand("Book Stand","Stationery","Plastic","Blue",
                400.0,20.0,15.0,0.8,"EduBrand","Edu Ltd","India",
                "Study",true,true,"6 Months","Triangle","Matte",
                5,"BS500","Available");

        Stand s6 = new Stand("Speaker Stand","Audio","Metal","Black",
                2500.0,110.0,40.0,5.0,"SoundMax","Audio Co","Germany",
                "Events",false,true,"1 Year","Round","Glossy",
                25,"SS600","Available");

        Stand s7 = new Stand("Flower Stand","Decor","Wood","White",
                1800.0,90.0,35.0,4.0,"DecoHome","Decor Ltd","India",
                "Home",false,false,"1 Year","Square","Polished",
                20,"FS700","Available");

        Stand s8 = new Stand("Projector Stand","Electronics","Steel","Gray",
                2200.0,100.0,45.0,6.0,"TechPro","Tech Ltd","USA",
                "Office",true,true,"1 Year","Rectangle","Matte",
                30,"PS800","Available");

        Stand s9 = new Stand("Camera Stand","Photography","Aluminum","Black",
                3500.0,150.0,50.0,2.5,"PhotoPro","Photo Ltd","Japan",
                "Outdoor",true,true,"2 Years","Tripod","Matte",
                12,"CS900","Available");

        Stand s10 = new Stand("Tablet Stand","Electronics","Plastic","White",
                700.0,18.0,12.0,0.5,"TabTech","Tech Ltd","India",
                "Office",true,false,"6 Months","Rectangle","Glossy",
                3,"TS1000","Available");

        s1.displayStandDetails();
        s2.displayStandDetails();
        s3.displayStandDetails();
        s4.displayStandDetails();
        s5.displayStandDetails();
        s6.displayStandDetails();
        s7.displayStandDetails();
        s8.displayStandDetails();
        s9.displayStandDetails();
        s10.displayStandDetails();
    }
}