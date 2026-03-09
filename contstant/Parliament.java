class Parliament{
	int members;        
    Country country; 
	House type;
	
	Parliament(int members, Country country,House type){
		this.members=members;
		this.country=country;
		this.type=type;
		
	}
	void printDetails(){
		System.out.println("Parliament members:"+this.members);
		if(this.Country!=null){
			System.out.println("Parliament Country:"+this.country.name);
		}
		else{
			System.out.println("Country is null ")
		}
	 
		System.out.println("Parliament House type:"+this.type);
		
	}
}