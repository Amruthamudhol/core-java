class ProductStore {

    Product[] products = new Product[137];
    int index = 0;

    void save(Product product) {

        if (product != null && products!=null) {

            if (index < this.products.length) {

                products[index] = product;

                System.out.print("Product stored at " + index + " -> ");
                product.displayDetails();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

                index++;

            } else {
                System.out.println("No space for more products");
            }

        } else {
            System.out.println("Product object is null");
        }
    }
	
	boolean searchByUniqueId(int searchId) 
	{
		System.out.println("=== Searching for Product by Unique ID ===");
		System.out.println("Search Query : ID = " + searchId);
		System.out.println("-----------------------------------");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.uniqueId == searchId) {
					System.out.println(">>> Match Found! <<<");
					product.displayDetails();
					return true;
				}
			}
		}

		System.out.println("No product found with ID " + searchId);
		System.out.println("---------------------------------------------------");
		return false;
	}
	
	
	boolean searchByUniqueIdAndName(int searchId, String searchName)
	{
		System.out.println("PRODUCT SEARCH INITIATED ");
		System.out.println("Looking for a product with:");
		System.out.println(" Unique ID : " + searchId);
		System.out.println(" Name : " + searchName);
		System.out.println("======================================");

		if (this.products != null) {
			for (Product product : this.products) {
				if (product != null && product.uniqueId == searchId && product.name.equals(searchName)) {
					System.out.println(" PRODUCT FOUND ");
					product.displayDetails();
					return true;
				}
			}
		}

		System.out.println(" NO PRODUCT FOUND ");
		System.out.println("The search for ID " + searchId + " and Name '" + searchName + "'  no results.");
		System.out.println("======================================");
		return false;
	}
	
	boolean searchByUniqueIdNameAndOrigin(int searchId, String searchName, String originCountry) 
	{
		System.out.println(" ---PRODUCT SEARCH---" );
		System.out.println("Searching for a product with the following criteria:");
		System.out.println("   Unique ID      : " + searchId);
		System.out.println("   Product Name   : " + searchName);
		System.out.println("   Origin Country : " + originCountry);
		

		if (this.products != null) {
			for (Product product : this. products) {
				if (product != null && product.uniqueId == searchId && product.name.equals(searchName) && product.originCountry.equals(originCountry))
				{
					System.out.println(" PRODUCT FOUND ");
					product.displayDetails();
					return true;
				}
			}
		}

		System.out.println("!!! PRODUCT NOT FOUND !!!");
		System.out.println("No match for ID " + searchId + ", Name '" + searchName + "', Origin '" + originCountry + "'");
		return false;
	}

	void getAllOriginCountry()
	{

		System.out.println("====== LIST OF ORIGIN COUNTRIES ======");

		if (this.products != null) 
		{
			for (Product product :this. products)
			{
				if (product != null) 
				{
					System.out.println("Origin Country : " + product.originCountry);
				}
			}
		}
		System.out.println("!!! originCountry is null !!!");
		System.out.println("======================================");
	}
	
	void displayAllProducts()
	{

		System.out.println("~~~ DISPLAYING ALL PRODUCTS ~~~");

		if (this.products != null) 
		{
			for (Product product : this.products)
			{
				if (product != null) 
				{
					product.displayDetails();
				}
			}
		} else
		{
			System.out.println("No products available");
		}

		System.out.println("~~~~~~~~~~~~~");
	}
	
	boolean checkWarrantyExpiredByUniqueId(int uniqueId)
	{
		System.out.println("=== WARRANTY CHECK ==");
		System.out.println("Requested Product ID : " + uniqueId);
		System.out.println("-----------");

		if (this.products != null)
		{
			for (Product product : this.products)
			{
				if (product != null && product.uniqueId == uniqueId)
				{
					System.out.println("Product Found");
					System.out.println("Name            : " + product.name);
					System.out.println("Warranty Status : " + product.warrantyExpired);
					System.out.println("======================");

					return product.warrantyExpired;
				}
			}
		}

		System.out.println("No product available with ID : " + uniqueId);
		System.out.println("==================");
		return false;
	}
	
	void getAllByType(ProductType type) 
	{

		System.out.println("----- Displaying Products By Type -----");
		System.out.println("Type : " + type);
		System.out.println("--------------------");

		if (this.products != null)
		{
			for (Product product : this.products)
			{
				if (product != null && product.type == type) 
				{
					product.displayDetails();
				}
			}
		}

		System.out.println("-------------");
   }
   
   void getAllByWarrantyYears(WarrantyYears warrantyYears)
	{
		System.out.println("===PRODUCTS BY WARRANTY ==");
		System.out.println("Warranty Years : " + warrantyYears);
		System.out.println("######");

		if (this.products != null)
		{
			for (Product product :this. products)
			{
				if (product != null && product.warrantyYears == warrantyYears)
				{
					product.displayDetails();
				}
			}
		}

		System.out.println("------------------------------");
	}
	
	void save(Product[] products) {

    if (products != null) {

        for (int i = 0; i < products.length; i++) {
			if (products[i] != null && index < this.products.length && index < 10) {

                this.products[index] = products[i];

                System.out.print("Product stored at " + index + " -> ");
                this.products[index].displayDetails();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

                index++;

            } else {
                System.out.println("No space for more products ");
                break;
            }
        }

    } else {
        System.out.println("Product array is null");
    }
}


}