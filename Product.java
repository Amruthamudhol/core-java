enum ProductType{
    COSMETICS, AUTOMOBILE, HOME_APPLIANCE, FURNITURE,  MEDICAL
}

enum WarrantyYears{
    ZERO, ONE, TWO, THREE, FOUR
}

class Product{

    String name;
    String make;
    String mfgDate;
    double cost;
    ProductType type;
    String seller;
    WarrantyYears warrantyYears;
    boolean warrantyExpired;
    int uniqueId;
    String originCountry;

    Product(String name, String make, String mfgDate, double cost, ProductType type, String seller, WarrantyYears warrantyYears, boolean warrantyExpired, int uniqueId, String originCountry) 
	{

        this.name = name;
        this.make = make;
        this.mfgDate = mfgDate;
        this.cost = cost;
        this.type = type;
        this.seller = seller;
        this.warrantyYears = warrantyYears;
        this.warrantyExpired = warrantyExpired;
        this.uniqueId = uniqueId;
        this.originCountry = originCountry;
    }

    void displayDetails()
	{
		System.out.println("\n------ Product Details ------");
		System.out.println("Product ID        : " + uniqueId);
		System.out.println("Product Name      : " + name);
		System.out.println("Brand/Make        : " + make);
		System.out.println("Manufacture Date  : " + mfgDate);
		System.out.println("Price             : Rs." + cost);
		System.out.println("Category          : " + type);
		System.out.println("Seller Name       : " + seller);
		System.out.println("Warranty Period   : " + warrantyYears + " Years");
		System.out.println("Warranty Expired? : " + warrantyExpired);
		System.out.println("Made In           : " + originCountry);
		System.out.println("------------------------------");
    }
}