class TrophyRunner {

    public static void main(String[] args) {

        Trophy t1 = new Trophy("World Cup","Cricket","Gold","Golden",
                60.5,8.5,"Cup","ICC World Cup",2023,
                "Australia","India","ICC","Pepsi",
                "India","Ahmedabad",500000.0,
                "Champions 2023",true,"ABC Sports",5);

        Trophy t2 = new Trophy("IPL Trophy","Cricket","Silver","Silver",
                55.0,7.2,"Cup","IPL Final",2022,
                "Chennai","Gujarat","BCCI","Tata",
                "India","Mumbai",300000.0,
                "IPL Champions",false,"XYZ Makers",3);

        Trophy t3 = new Trophy("Champions League","Football","Gold","Golden",
                65.0,9.0,"Cup","UEFA Final",2021,
                "Chelsea","Man City","UEFA","Heineken",
                "UK","London",600000.0,
                "UEFA Winners",true,"EuroTrophies",2);

        Trophy t4 = new Trophy("Olympic Medal","Athletics","Gold","Golden",
                10.0,0.5,"Round","Olympics",2020,
                "Neeraj Chopra","Johannes","IOC","Visa",
                "Japan","Tokyo",100000.0,
                "Olympic Gold",true,"Olympic Org",50);

        Trophy t5 = new Trophy("Ranji Trophy","Cricket","Bronze","Brown",
                50.0,6.0,"Cup","Ranji Final",2022,
                "Saurashtra","Mumbai","BCCI","Paytm",
                "India","Delhi",200000.0,
                "Ranji Winner",false,"Indian Makers",4);

        Trophy t6 = new Trophy("Wimbledon Cup","Tennis","Silver","Silver",
                45.0,5.0,"Plate","Wimbledon",2023,
                "Carlos","Djokovic","ITF","Rolex",
                "UK","London",400000.0,
                "Wimbledon Winner",false,"UK Sports",3);

        Trophy t7 = new Trophy("NBA Trophy","Basketball","Gold","Golden",
                70.0,10.0,"Statue","NBA Finals",2023,
                "Lakers","Heat","NBA","Nike",
                "USA","LA",700000.0,
                "NBA Champions",true,"US Makers",2);

        Trophy t8 = new Trophy("Hockey Cup","Hockey","Silver","Silver",
                48.0,6.5,"Cup","Hockey World Cup",2023,
                "Germany","Belgium","FIH","Adidas",
                "India","Bhubaneswar",350000.0,
                "Hockey Winner",false,"SportCraft",3);

        Trophy t9 = new Trophy("Pro Kabaddi","Kabaddi","Gold","Golden",
                40.0,4.5,"Cup","PKL Final",2022,
                "Jaipur","Pune","PKL","Dream11",
                "India","Hyderabad",250000.0,
                "PKL Champion",true,"Kabaddi Org",4);

        Trophy t10 = new Trophy("Formula 1 Cup","Racing","Gold","Golden",
                75.0,11.0,"Statue","F1 Championship",2023,
                "Verstappen","Hamilton","FIA","Red Bull",
                "UAE","Abu Dhabi",800000.0,
                "F1 Champion",true,"F1 Org",1);

        t1.displayDetails();
        t2.displayDetails();
        t3.displayDetails();
        t4.displayDetails();
        t5.displayDetails();
        t6.displayDetails();
        t7.displayDetails();
        t8.displayDetails();
        t9.displayDetails();
        t10.displayDetails();
    }
}