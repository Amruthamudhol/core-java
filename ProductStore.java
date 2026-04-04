class ProductStore{
	  Product[] products= new Product[5] ;
      int index = 0;

	 void addProduct(Product product) {

        if (product != null && products!=null) {

            if (index < this.products.length) {

                products[index] = product;

                System.out.print("Product stored at " + index + " -> ");
                product.storeInfo();
                System.out.println("~~~~~~~~~");

                index++;

            } else {
                System.out.println("No space for more products");
            }

        } else {
            System.out.println("Product object is null");
        }
    }
	
	void displayAllProducts(){
		if (this.products != null) {
			for (Product product :this. products) { 
			    product.storeInfo();
				System.out.println("-------------");
			   
			}
		}
        else{
			System.out.println("product not found");
		}		
		
	}
	
	
	boolean getproductDetailsById(int searchId) 
	{
		System.out.println("productDetailsById");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.productId == searchId) {
					System.out.println(">>> Match Found! <<<");
					product.storeInfo();
					return true;
				}
			}
		}

		System.out.println("No product found with ID " + searchId);
		System.out.println("----------------");
		return false;
	}
	
	boolean getProductPrice(String Productname) 
	{
		
		System.out.println("getProductPrice");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.name == Productname) {
					System.out.println("Price:"+ product.price);
					return true;
				}
			}
		}

		System.out.println("----------------");
		return false;
	}
	
	
	boolean getProductName(String Productname) 
	{
		System.out.println("----------------");
		System.out.println("getProductName");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.productNameCompany == Productname) {
					System.out.println("name:"+product.name);
					return true;
				}
			}
		}

		System.out.println("----------------");
		return false;
	}
	
	boolean getCompanyName(String Productname) 
	{  
		System.out.println("----------------");
		System.out.println("getCompanyName");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.name == Productname) {
					
					System.out.println("company:"+product.productNameCompany);
					return true;
				}
			}
		}

		System.out.println("----------------");
		return false;
	}
	
	boolean getDates(String Productname) 
	{  
		System.out.println("----------------");
		System.out.println("getDates");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.name == Productname) {
					
					System.out.println("manufactureDate:"+product.manufactureDate);
					System.out.println("expDate:"+product.expDate);
					return true;
				}
			}
		}

		System.out.println("----------------");
		return false;
	}
	
	
	boolean getProductNameByProductType(String Productname) 
	{  
		System.out.println("----------------");
		System.out.println("getProductNameByProductType");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.name == Productname) {
					
					System.out.println("ProductType:"+product.type);
					
					return true;
				}
			}
		}

		System.out.println("----------------");
		return false;
	}
	
	boolean getMnf(String Productname) 
	{  
		System.out.println("----------------");
		System.out.println("getMnf");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.name == Productname) {
					
					System.out.println("manufactureDate:"+product.manufactureDate);
					
					return true;
				}
			}
		}

		System.out.println("----------------");
		return false;
	}
	
	
	boolean getExp(String Productname) 
	{  
		System.out.println("----------------");
		System.out.println("getExp");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.name == Productname) {
					
					System.out.println("getExp:"+product.expDate);
					
					return true;
				}
			}
		}

		System.out.println("----------------");
		return false;
	}
	
	boolean UpdateMnfandExp(String Productname,String newMnf, String newExp) 
	{  
		System.out.println("----------------");
		System.out.println("UpdateMnfandExp");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.name == Productname) {
					 product.manufactureDate= newMnf;
					product. expDate= newExp;
					
					System.out.println("update Exp:"+product.expDate);
					System.out.println("update mnf:"+product.manufactureDate);
					
					return true;
				}
			}
		}

		System.out.println("----------------");
		return false;
	}
	
	
	
	boolean UpdateProductPriceByName(String Productname, double newPrice) 
	{  
		System.out.println("----------------");
		System.out.println("UpdateProductPriceByName");

		if (this.products != null) {
			for (Product product :this. products) { 
				if (product != null && product.name == Productname) {
					product. price= newPrice;
					
					System.out.println("update Price:"+product.price);
					
					
					return true;
				}
			}
		}

		System.out.println("----------------");
		return false;
	}
	
	
	boolean deleteProductByProductName(String productName) 
{  
    System.out.println("----------------");
    System.out.println("deleteProductByProductName");

    if (this.products != null) 
    {
        for (Product product : this.products) 
        {
            if (product != null && product.name == productName) 
            {
				System.out.println("Deleted Product : " + product.name);
                product.name = null;
                product.price = 0;
                product.type = null;

                System.out.println("Product Deleted Successfully");
				
                return true;
            }
        }
    }

    System.out.println("Product Not Found");
    System.out.println("----------------");
    return false;
}
	
	
	

}