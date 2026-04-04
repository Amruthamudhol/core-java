class ProductRunner{
	
	public static void main(String[] args) {
	ProductStore store = new ProductStore();

     Product p1 = new Product(1, "pen","Amazon","11 jan 2026","13 feb 2027",50,2.5, ProductType.GROCERY);
	 store.addProduct(p1);
	 
	 Product p2 = new Product(2,"remote","Myntra","11 jan 2026","13 feb 2027",250,2.5, ProductType.ELECTRONICS);
	 store.addProduct(p2);
	 
	 Product p3 = new Product(3,"kajal","nykaa","11 jan 2026","13 feb 2027",2500,2.5, ProductType.ELECTRONICS);
	 store.addProduct(p3);
	 
	 store.getproductDetailsById(1) ;
	 store.getProductPrice("remote"); 
	 store.getProductName("nykaa");
	 store.getCompanyName("kajal") ;
	 store.getDates("pen"); 
	 store.getProductNameByProductType("kajal") ;
	 store. getMnf("pen");
	 store. getExp("pen") 	;
     store.UpdateMnfandExp("remote","12 feb 2027","6 march 2028") 	 ;
	 store.UpdateProductPriceByName("pen",75);
	 store.deleteProductByProductName("remote");
	 
	 
	 
	 
	
	}
}