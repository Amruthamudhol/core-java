class Product{
	int productId;
	String name;
	String productNameCompany;
	String manufactureDate;
	String expDate;
	double price;
	double weightInGrams;
	ProductType type;
	
	
	Product(int productId,String name, String productNameCompany,  String manufactureDate, String expDate, double price, double weightInGrams, ProductType type)
	{
		this.productId=productId;
		this.name=name;
		this.productNameCompany=productNameCompany;
		this.manufactureDate=manufactureDate;
		this.expDate=expDate;
		this.price=price;
		this.weightInGrams=weightInGrams;
		this.type=type;	
		
	}
	
	void storeInfo(){
			System.out.println("productId:"+productId);
			System.out.println("name:"+name);
			System.out.println("productNameCompany:"+productNameCompany);
			System.out.println("manufactureDate:"+manufactureDate);
			System.out.println("expDate:"+expDate);
			System.out.println("price:"+price);
			System.out.println("weightInGrams:"+weightInGrams);
    		System.out.println("Type:"+type);
    		
    	}
}