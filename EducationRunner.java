class EducationRunner {

    public static void main(String[] args) {

        Education e1 = new Education("ABC College","B.E","Computer Science",4,"VTU","Bangalore",2000,120,true,"NAAC A",150000,"English","Semester",true,true,true,"Dr. Rao",1995,"CGPA",true);
		
        Education e2 = new Education("XYZ Institute","B.Sc","Physics",3,"BU","Mysore",1500,80,false,"NAAC B",80000,"English","Semester",true,true,false,"Dr. Meena",2000,"Percentage",false);
		
        Education e3 = new Education("National University","MBA","Finance",2,"NU","Delhi",3000,200,true,"NAAC A+",250000,"English","Trimester",true,true,true,"Dr. Sharma",1985,"CGPA",true);
		
        Education e4 = new Education("City College","B.Com","Commerce",3,"KU","Hubli",1800,90,false,"NAAC B+",90000,"English","Semester",false,true,true,"Mr. Patil",1998,"Percentage",true);
		
        Education e5 = new Education("Tech University","M.Tech","AI",2,"VTU","Bangalore",1200,150,true,"NBA",200000,"English","Semester",true,true,true,"Dr. Kumar",2005,"CGPA",true);
		
        Education e6 = new Education("Medical College","MBBS","Medicine",5,"RGUHS","Mangalore",1000,300,true,"MCI",500000,"English","Yearly",true,true,true,"Dr. Shetty",1975,"Percentage",true);
		
        Education e7 = new Education("Law College","LLB","Law",3,"KU","Belgaum",800,60,false,"BCI",70000,"English","Semester",false,true,false,"Mr. Desai",1990,"Percentage",false);
		
        Education e8 = new Education("Arts College","BA","History",3,"BU","Tumkur",900,50,true,"NAAC B",60000,"Kannada","Semester",false,true,true,"Ms. Kavya",1988,"Percentage",false);
		
        Education e9 = new Education("Science College","B.Sc","Biology",3,"KU","Dharwad",1100,70,false,"NAAC A",85000,"English","Semester",true,true,true,"Dr. Nair",1992,"CGPA",true);
		
        Education e10 = new Education("International School","Diploma","Design",2,"ISU","Mumbai",500,40,false,"ISO",120000,"English","Semester",false,true,false,"Ms. Kapoor",2010,"Grade",true);

        e1.displayEducation();
        e2.displayEducation();
        e3.displayEducation();
        e4.displayEducation();
        e5.displayEducation();
        e6.displayEducation();
        e7.displayEducation();
        e8.displayEducation();
        e9.displayEducation();
        e10.displayEducation();
    }
}