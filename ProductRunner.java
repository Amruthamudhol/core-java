class ProductRunner {
	

    public static void main(String[] args) {
		boolean found; 

        ProductStore store = new ProductStore();

        Product p1 = new Product("Face Cream","Lakme","12-01-2024",350.0,
                ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,101,"India");

        Product p2 = new Product("Car Battery","Amaron","05-11-2023",5200.0,
                ProductType.AUTOMOBILE,"Amazon",WarrantyYears.THREE,false,102,"India");

        Product p3 = new Product("Refrigerator","LG","20-02-2024",45000.0,
                ProductType.HOME_APPLIANCE,"Reliance Digital",WarrantyYears.FOUR,false,103,"South Korea");

        Product p4 = new Product("Sofa","Ikea","15-03-2024",30000.0,
                ProductType.FURNITURE,"Flipkart",WarrantyYears.TWO,false,104,"Sweden");

        Product p5 = new Product("Thermometer","Dr Trust","01-01-2024",800.0,
                ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,105,"China");

        Product p6 = new Product("Shampoo","Dove","02-02-2024",280.0,
                ProductType.COSMETICS,"Amazon",WarrantyYears.ZERO,false,106,"India");

        Product p7 = new Product("Bike Helmet","Vega","03-02-2024",1500.0,
                ProductType.AUTOMOBILE,"Flipkart",WarrantyYears.ONE,false,107,"India");

        Product p8 = new Product("Washing Machine","IFB","04-02-2024",32000.0,
                ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.THREE,false,108,"India");

        Product p9 = new Product("Dining Table","Nilkamal","05-02-2024",18000.0,
                ProductType.FURNITURE,"Amazon",WarrantyYears.TWO,false,109,"India");

        Product p10 = new Product("BP Monitor","Omron","06-02-2024",2500.0,
                ProductType.MEDICAL,"Flipkart",WarrantyYears.TWO,false,110,"Japan");
				
		Product p11 = new Product("Face Wash","Himalaya","07-02-2024",180.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,111,"India");

		Product p12 = new Product("Car Tyre","MRF","08-02-2024",6200.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.THREE,false,112,"India");

		Product p13 = new Product("Air Conditioner","Voltas","09-02-2024",38000.0,
				ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.FOUR,false,113,"India");

		Product p14 = new Product("Bed","Wakefit","10-02-2024",22000.0,
				ProductType.FURNITURE,"Flipkart",WarrantyYears.THREE,false,114,"India");

		Product p15 = new Product("Pulse Oximeter","BPL","11-02-2024",1500.0,
				ProductType.MEDICAL,"Amazon",WarrantyYears.ONE,false,115,"India");

		Product p16 = new Product("Lipstick","Maybelline","12-02-2024",550.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,116,"USA");

		Product p17 = new Product("Car Cover","AutoHub","13-02-2024",900.0,
				ProductType.AUTOMOBILE,"Flipkart",WarrantyYears.ONE,false,117,"India");

		Product p18 = new Product("Mixer Grinder","Preethi","14-02-2024",4500.0,
				ProductType.HOME_APPLIANCE,"Reliance",WarrantyYears.TWO,false,118,"India");

		Product p19 = new Product("Cupboard","Godrej","15-02-2024",18000.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.FOUR,false,119,"India");

		Product p20 = new Product("Stethoscope","3M","16-02-2024",3200.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.TWO,false,120,"USA");

		Product p21 = new Product("Perfume","Fogg","17-02-2024",600.0,
				ProductType.COSMETICS,"Flipkart",WarrantyYears.ZERO,false,121,"India");

		Product p22 = new Product("Bike Mirror","Uno Minda","18-02-2024",450.0,
				ProductType.AUTOMOBILE,"Amazon	",WarrantyYears.ONE,false,122,"India");

		Product p23 = new Product("Electric Kettle","Prestige","19-02-2024",1500.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,123,"India");

		Product p24 = new Product("Office Chair","GreenSoul","20-02-2024",9500.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.THREE,false,124,"India");

		Product p25 = new Product("Thermal Scanner","Dr Morepen","21-02-2024",2800.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,125,"China");

		Product p26 = new Product("Hair Oil","Parachute","22-02-2024",200.0,
				ProductType.COSMETICS,"Flipkart",WarrantyYears.ZERO,false,126,"India");

		Product p27 = new Product("Seat Cover","AutoForm","23-02-2024",3200.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.TWO,false,127,"India");

		Product p28 = new Product("Ceiling Fan","Havells","24-02-2024",2800.0,
				ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.THREE,false,128,"India");

		Product p29 = new Product("Bookshelf","Ikea","25-02-2024",7000.0,
				ProductType.FURNITURE,"Flipkart",WarrantyYears.TWO,false,129,"Sweden");

		Product p30 = new Product("Wheel Chair","Karma","26-02-2024",9000.0,
				ProductType.MEDICAL,"Amazon",WarrantyYears.THREE,false,130,"China");
				
		Product p31 = new Product("Body Lotion","Nivea","27-02-2024",320.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,131,"Germany");

		Product p32 = new Product("Engine Oil","Castrol","28-02-2024",900.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,132,"India");

		Product p33 = new Product("Induction Stove","Prestige","01-03-2024",2600.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,133,"India");

		Product p34 = new Product("Study Table","Durian","02-03-2024",12000.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.THREE,false,134,"India");

		Product p35 = new Product("Digital Thermometer","Omron","03-03-2024",650.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,135,"Japan");

		Product p36 = new Product("Compact Powder","Lakme","04-03-2024",450.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,136,"India");

		Product p37 = new Product("Car Vacuum","Agaro","05-03-2024",2200.0,
				ProductType.AUTOMOBILE,"Flipkart",WarrantyYears.TWO,false,137,"India");

		Product p38 = new Product("Water Purifier","Kent","06-03-2024",15500.0,
				ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.FOUR,false,138,"India");

		Product p39 = new Product("Wardrobe","Godrej","07-03-2024",27000.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.FOUR,false,139,"India");

		Product p40 = new Product("Glucometer","AccuChek","08-03-2024",1800.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.TWO,false,140,"Germany");

		Product p41 = new Product("Sunscreen","Lotus","09-03-2024",520.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,141,"India");

		Product p42 = new Product("Bike Lock","Steelbird","10-03-2024",700.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,142,"India");

		Product p43 = new Product("Air Fryer","Philips","11-03-2024",9800.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.THREE,false,143,"Netherlands");

		Product p44 = new Product("Coffee Table","Urban Ladder","12-03-2024",8500.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.TWO,false,144,"India");

		Product p45 = new Product("Nebulizer","Dr Trust","13-03-2024",2300.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.TWO,false,145,"China");

		Product p46 = new Product("Makeup Kit","Maybelline","14-03-2024",2200.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,146,"USA");

		Product p47 = new Product("Car Charger","Portronics","15-03-2024",400.0,
				ProductType.AUTOMOBILE,"Flipkart",WarrantyYears.ONE,false,147,"India");

		Product p48 = new Product("Room Heater","Bajaj","16-03-2024",3200.0,
				ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.TWO,false,148,"India");

		Product p49 = new Product("Recliner","Sleepyhead","17-03-2024",25000.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.THREE,false,149,"India");

		Product p50 = new Product("First Aid Kit","Dr Morepen","18-03-2024",950.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,150,"India");
				
		Product p51 = new Product("Face Serum","Minimalist","19-03-2024",699.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,151,"India");

		Product p52 = new Product("Car Perfume","Godrej","20-03-2024",350.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ZERO,false,152,"India");

		Product p53 = new Product("Toaster","Morphy Richards","21-03-2024",2400.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,153,"UK");

		Product p54 = new Product("TV Unit","HomeTown","22-03-2024",16000.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.THREE,false,154,"India");

		Product p55 = new Product("Infrared Thermometer","BPL","23-03-2024",2100.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,155,"India");

		Product p56 = new Product("Hair Dryer","Philips","24-03-2024",1800.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ONE,false,156,"Netherlands");

		Product p57 = new Product("Bike Cover","AutoHub","25-03-2024",750.0,
				ProductType.AUTOMOBILE,"Flipkart",WarrantyYears.ONE,false,157,"India");

		Product p58 = new Product("Rice Cooker","Panasonic","26-03-2024",3200.0,
				ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.TWO,false,158,"Japan");

		Product p59 = new Product("Bookshelf","Urban Ladder","27-03-2024",7200.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.TWO,false,159,"India");

		Product p60 = new Product("BP Machine","Dr Trust","28-03-2024",2600.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.TWO,false,160,"China");

		Product p61 = new Product("Face Mask Pack","Mamaearth","29-03-2024",399.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,161,"India");

		Product p62 = new Product("Car Cleaning Kit","Bosch","30-03-2024",1900.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,162,"Germany");

		Product p63 = new Product("Electric Iron","Bajaj","31-03-2024",1400.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,163,"India");

		Product p64 = new Product("Office Desk","Durian","01-04-2024",21000.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.THREE,false,164,"India");

		Product p65 = new Product("Oxygen Concentrator","Philips","02-04-2024",42000.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.FOUR,false,165,"Netherlands");

		Product p66 = new Product("Compact Mirror","Colorbar","03-04-2024",299.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,166,"India");

		Product p67 = new Product("Car Jump Starter","Amaron","04-04-2024",6500.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.THREE,false,167,"India");

		Product p68 = new Product("Dishwasher","Bosch","05-04-2024",55000.0,
				ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.FOUR,false,168,"Germany");

		Product p69 = new Product("Wooden Cot","Wakefit","06-04-2024",28000.0,
				ProductType.FURNITURE,"Flipkart",WarrantyYears.THREE,false,169,"India");

		Product p70 = new Product("Medical Gloves","3M","07-04-2024",500.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ZERO,false,170,"USA");

		Product p71 = new Product("Eye Liner","Lakme","08-04-2024",275.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,171,"India");

		Product p72 = new Product("Car Mat","AutoForm","09-04-2024",2100.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,172,"India");

		Product p73 = new Product("Juicer","Philips","10-04-2024",4800.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,173,"Netherlands");

		Product p74 = new Product("Shoe Rack","Nilkamal","11-04-2024",3600.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.TWO,false,174,"India");

		Product p75 = new Product("Medical Kit","Dr Morepen","12-04-2024",1200.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,175,"India");
				
		Product p76 = new Product("Night Cream","Olay","13-04-2024",899.0,
        ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,176,"USA");

		Product p77 = new Product("Car Wax","3M","14-04-2024",650.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ZERO,false,177,"USA");

		Product p78 = new Product("Hand Blender","Philips","15-04-2024",2200.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,178,"Netherlands");

		Product p79 = new Product("TV Stand","Ikea","16-04-2024",12500.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.THREE,false,179,"Sweden");

		Product p80 = new Product("Thermal Bag","Dr Trust","17-04-2024",900.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,180,"India");

		Product p81 = new Product("Foundation","Maybelline","18-04-2024",699.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,181,"USA");

		Product p82 = new Product("Car Phone Holder","Portronics","19-04-2024",450.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,182,"India");

		Product p83 = new Product("Vacuum Cleaner","Eureka Forbes","20-04-2024",7200.0,
				ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.THREE,false,183,"India");

		Product p84 = new Product("Folding Table","Nilkamal","21-04-2024",4200.0,
				ProductType.FURNITURE,"Flipkart",WarrantyYears.TWO,false,184,"India");

		Product p85 = new Product("Hot Water Bag","Flamingo","22-04-2024",350.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ZERO,false,185,"India");

		Product p86 = new Product("Hair Straightener","Philips","23-04-2024",3100.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ONE,false,186,"Netherlands");

		Product p87 = new Product("Bike Mobile Mount","Bobo","24-04-2024",600.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,187,"India");

		Product p88 = new Product("Geyser","Bajaj","25-04-2024",9800.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.THREE,false,188,"India");

		Product p89 = new Product("Computer Table","Durian","26-04-2024",15000.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.THREE,false,189,"India");

		Product p90 = new Product("Heating Pad","Dr Morepen","27-04-2024",1100.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,190,"India");

		Product p91 = new Product("Nail Polish","Lakme","28-04-2024",199.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,191,"India");

		Product p92 = new Product("Car Air Pump","Michelin","29-04-2024",3200.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.TWO,false,192,"France");

		Product p93 = new Product("Sandwich Maker","Prestige","30-04-2024",2400.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,193,"India");

		Product p94 = new Product("Wardrobe Organizer","Ikea","01-05-2024",2800.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.ONE,false,194,"Sweden");

		Product p95 = new Product("Digital Weighing Scale","HealthSense","02-05-2024",1700.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.TWO,false,195,"India");

		Product p96 = new Product("Face Pack","Biotique","03-05-2024",250.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,196,"India");

		Product p97 = new Product("Car Sunshade","AutoHub","04-05-2024",800.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,197,"India");

		Product p98 = new Product("Air Cooler","Symphony","05-05-2024",13500.0,
				ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.THREE,false,198,"India");

		Product p99 = new Product("Plastic Drawer","Cello","06-05-2024",2200.0,
				ProductType.FURNITURE,"Flipkart",WarrantyYears.TWO,false,199,"India");

		Product p100 = new Product("First Aid Box","Dettol","07-05-2024",850.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,200,"India");
				
		Product p101 = new Product("Moisturizer","Ponds","08-05-2024",299.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,201,"India");

		Product p102 = new Product("Car Seat Cushion","AutoForm","09-05-2024",1400.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,202,"India");

		Product p103 = new Product("Electric Chimney","Faber","10-05-2024",18500.0,
				ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.THREE,false,203,"Italy");

		Product p104 = new Product("Rocking Chair","Nilkamal","11-05-2024",9500.0,
				ProductType.FURNITURE,"Flipkart",WarrantyYears.TWO,false,204,"India");

		Product p105 = new Product("Medical Mask","3M","12-05-2024",300.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ZERO,false,205,"USA");

		Product p106 = new Product("Face Toner","Plum","13-05-2024",450.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,206,"India");

		Product p107 = new Product("Car Cleaning Cloth","Bosch","14-05-2024",250.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ZERO,false,207,"Germany");

		Product p108 = new Product("Food Processor","Philips","15-05-2024",9800.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,208,"Netherlands");

		Product p109 = new Product("Bean Bag","Ikea","16-05-2024",4200.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.ONE,false,209,"Sweden");

		Product p110 = new Product("Nebulizer Mask","Dr Trust","17-05-2024",600.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,210,"China");

		Product p111 = new Product("Lip Balm","Nivea","18-05-2024",199.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,211,"Germany");

		Product p112 = new Product("Car Jump Cable","Amaron","19-05-2024",1200.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,212,"India");

		Product p113 = new Product("OTG Oven","Morphy Richards","20-05-2024",7200.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,213,"UK");

		Product p114 = new Product("Plastic Stool","Cello","21-05-2024",650.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.ONE,false,214,"India");

		Product p115 = new Product("Glucose Monitor","AccuChek","22-05-2024",2300.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.TWO,false,215,"Germany");

		Product p116 = new Product("Face Scrub","Himalaya","23-05-2024",175.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,216,"India");

		Product p117 = new Product("Car Dashboard Cleaner","Wavex","24-05-2024",480.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ZERO,false,217,"India");

		Product p118 = new Product("Room Humidifier","Agaro","25-05-2024",3500.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,218,"India");

		Product p119 = new Product("TV Cabinet","Urban Ladder","26-05-2024",24000.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.THREE,false,219,"India");

		Product p120 = new Product("Medical Tape","3M","27-05-2024",150.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ZERO,false,220,"USA");

		Product p121 = new Product("BB Cream","Garnier","28-05-2024",299.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,221,"France");

		Product p122 = new Product("Car LED Light","Philips","29-05-2024",1800.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,222,"Netherlands");

		Product p123 = new Product("Steam Iron","Philips","30-05-2024",2800.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,223,"Netherlands");

		Product p124 = new Product("Wooden Shelf","Durian","31-05-2024",8200.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.THREE,false,224,"India");

		Product p125 = new Product("Knee Support","Flamingo","01-06-2024",750.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,225,"India");

		Product p126 = new Product("Compact Kit","Lakme","02-06-2024",650.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,226,"India");

		Product p127 = new Product("Car Steering Cover","AutoForm","03-06-2024",550.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,227,"India");

		Product p128 = new Product("Induction Cooktop","Prestige","04-06-2024",3100.0,
				ProductType.HOME_APPLIANCE,"Flipkart",WarrantyYears.TWO,false,228,"India");

		Product p129 = new Product("Office Cabinet","Godrej","05-06-2024",19500.0,
				ProductType.FURNITURE,"Amazon",WarrantyYears.FOUR,false,229,"India");

		Product p130 = new Product("Medical Thermo Pack","Dr Morepen","06-06-2024",950.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,230,"India");

		Product p131 = new Product("Makeup Brush Set","Colorbar","07-06-2024",1100.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,231,"India");

		Product p132 = new Product("Car Vacuum Pump","Michelin","08-06-2024",4200.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.TWO,false,232,"France");

		Product p133 = new Product("Water Heater","Havells","09-06-2024",8700.0,
				ProductType.HOME_APPLIANCE,"Croma",WarrantyYears.THREE,false,233,"India");

		Product p134 = new Product("Study Chair","GreenSoul","10-06-2024",10500.0,
				ProductType.FURNITURE,"Flipkart",WarrantyYears.THREE,false,234,"India");

		Product p135 = new Product("Pulse Meter","BPL","11-06-2024",1850.0,
				ProductType.MEDICAL,"PharmEasy",WarrantyYears.ONE,false,235,"India");

		Product p136 = new Product("Hair Serum","Loreal","12-06-2024",540.0,
				ProductType.COSMETICS,"Nykaa",WarrantyYears.ZERO,false,236,"France");

		Product p137 = new Product("Car Floor Mat","AutoHub","13-06-2024",2600.0,
				ProductType.AUTOMOBILE,"Amazon",WarrantyYears.ONE,false,237,"India");

        store.save(p1);   
		store.save(p2);
        store.save(p3);
        store.save(p4);
        store.save(p5);
        store.save(p6);
        store.save(p7);
        store.save(p8);
        store.save(p9);
        store.save(p10);
		store.save(p11);
		store.save(p12);
		store.save(p13);
		store.save(p14);
		store.save(p15);
		store.save(p16);
		store.save(p17);
		store.save(p18);
		store.save(p19);
		store.save(p20);
		store.save(p21);
		store.save(p22);
		store.save(p23);
		store.save(p24);
		store.save(p25);
		store.save(p26);
		store.save(p27);
		store.save(p28);
		store.save(p29);
		store.save(p30);
		store.save(p31);
		store.save(p32);
		store.save(p33);
		store.save(p34);
		store.save(p35);
		store.save(p36);
		store.save(p37);
		store.save(p38);
		store.save(p39);
		store.save(p40);
		store.save(p41);
		store.save(p42);
		store.save(p43);
		store.save(p44);
		store.save(p45);
		store.save(p46);
		store.save(p47);
		store.save(p48);
		store.save(p49);
		store.save(p50);
		store.save(p51);
		store.save(p52);
		store.save(p53);
		store.save(p54);
		store.save(p55);
		store.save(p56);
		store.save(p57);
		store.save(p58);
		store.save(p59);
		store.save(p60);
		store.save(p61);
		store.save(p62);
		store.save(p63);
		store.save(p64);
		store.save(p65);
		store.save(p66);
		store.save(p67);
		store.save(p68);
		store.save(p69);
		store.save(p70);
		store.save(p71);
		store.save(p72);
		store.save(p73);
		store.save(p74);
		store.save(p75);
		store.save(p76);
		store.save(p77);
		store.save(p78);
		store.save(p79);
		store.save(p80);
		store.save(p81);
		store.save(p82);
		store.save(p83);
		store.save(p84);
		store.save(p85);
		store.save(p86);
		store.save(p87);
		store.save(p88);
		store.save(p89);
		store.save(p90);
		store.save(p91);
		store.save(p92);
		store.save(p93);
		store.save(p94);
		store.save(p95);
		store.save(p96);
		store.save(p97);
		store.save(p98);
		store.save(p99);
		store.save(p100);
		store.save(p101);
		store.save(p102);
		store.save(p103);
		store.save(p104);
		store.save(p105);
		store.save(p106);
		store.save(p107);
		store.save(p108);
		store.save(p109);
		store.save(p110);
		store.save(p111);
		store.save(p112);
		store.save(p113);
		store.save(p114);
		store.save(p115);
		store.save(p116);
		store.save(p117);
		store.save(p118);
		store.save(p119);
		store.save(p120);
		store.save(p121);
		store.save(p122);
		store.save(p123);
		store.save(p124);
		store.save(p125);
		store.save(p126);
		store.save(p127);
		store.save(p128);
		store.save(p129);
		store.save(p130);
		store.save(p131);
		store.save(p132);
		store.save(p133);
		store.save(p134);
		store.save(p135);
		store.save(p136);
		store.save(p137);
		
		System.out.println("\n--- Searching for Unique ID 101 ---");
        found = store.searchByUniqueId(122);
		
		
		System.out.println("\n Searching for ID 101 and Name 'Face Cream'");
		found =store.searchByUniqueIdAndName(101, "Face Cream"); 

		System.out.println("\n Searching for ID 102 and Name 'Face Cream'");
		found =store.searchByUniqueIdAndName(102, "Face Cream"); 
		
		System.out.println("\n Searching with UniqueId,Name,originCountry");
		found = store.searchByUniqueIdNameAndOrigin(237,"Car Floor Mat","India");   
		found = store.searchByUniqueIdNameAndOrigin(105, "Face Cream", "USA");   

        store.getAllOriginCountry();
		store.displayAllProducts();
		store.checkWarrantyExpiredByUniqueId(101);
		
		store.getAllByType(ProductType.COSMETICS);
		store.getAllByType(ProductType.AUTOMOBILE);
		store.getAllByType(ProductType.MEDICAL);
		
		
		store.getAllByWarrantyYears(WarrantyYears.ZERO);
		store.getAllByWarrantyYears(WarrantyYears.ONE);
		store.getAllByWarrantyYears(WarrantyYears.TWO);
		store.getAllByWarrantyYears(WarrantyYears.THREE);
		
		SaveArray saveArray = new SaveArray();  

		Product[] products = new Product[10]; 

		products[0] = new Product("Mixer","Prestige","12-01-2024",3500.0,
				ProductType.HOME_APPLIANCE,"Reliance",
				WarrantyYears.TWO,false,120,"India");

		products[1] = new Product("Iron Box","Philips","20-02-2024",1800.0,
				ProductType.HOME_APPLIANCE,"Amazon",
				WarrantyYears.ONE,false,85,"India");

		saveArray.save(products);   
		;
    }
}