class OfficeRunner {

    public static void main(String[] args) {

        Office o1 = new Office("Head Office","Bangalore",5,300,"IT",15000.5,true,true,10,50,"Ravi","9AM","6PM","TechSoft","Airtel",true,5,"White",20,true);
		
        Office o2 = new Office("Branch 1","Mumbai",3,150,"Finance",8000.0,true,false,6,30,"Anita","9AM","5PM","FinCorp","Jio",true,3,"Blue",12,true);
		
        Office o3 = new Office("Branch 2","Delhi",4,200,"Consulting",10000.0,false,true,8,40,"Suresh","10AM","7PM","ConsultX","BSNL",true,4,"Grey",15,false);
		
        Office o4 = new Office("Regional","Chennai",2,100,"Support",6000.0,true,true,4,20,"Meena","9AM","6PM","HelpDesk","Airtel",true,2,"Cream",8,true);
		
        Office o5 = new Office("Corporate","Hyderabad",6,400,"IT",20000.0,true,true,12,70,"Arun","8AM","6PM","NextGen","Jio",true,6,"Glass",25,true);
		
        Office o6 = new Office("Sales","Pune",3,120,"Sales",7000.0,false,true,5,25,"Priya","9AM","5PM","MarketPro","Airtel",true,3,"Yellow",10,false);
		
        Office o7 = new Office("Admin","Kolkata",2,80,"Admin",5000.0,true,false,3,15,"Kiran","10AM","6PM","AdminPlus","BSNL",false,1,"White",6,false);
		
        Office o8 = new Office("Tech Park","Noida",7,500,"IT",25000.0,true,true,15,90,"Rahul","9AM","7PM","CodeWorld","Jio",true,8,"Silver",30,true);
		
        Office o9 = new Office("Startup Hub","Jaipur",1,50,"Startup",3000.0,false,true,2,10,"Nisha","10AM","4PM","Innovate","Airtel",false,1,"Orange",4,false);
		
        Office o10 = new Office("Design Studio","Ahmedabad",2,70,"Design",4500.0,true,false,3,18,"Vikram","9AM","6PM","CreativeCo","Jio",true,2,"Black",5,true);

        o1.displayOffice();
        o2.displayOffice();
        o3.displayOffice();
        o4.displayOffice();
        o5.displayOffice();
        o6.displayOffice();
        o7.displayOffice();
        o8.displayOffice();
        o9.displayOffice();
        o10.displayOffice();
    }
}