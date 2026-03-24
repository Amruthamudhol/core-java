class Map{
	String country;
	String type;
	String name;
    String scale;
    int year;
	
	Map(String country,String type,String name, String scale,int year){
		this.country=country;
		this.type=type;
		this.name=name;
		this.scale=scale;
		this.year=year;
	}
	
	void printInfo(){
    System.out.println("Name: " + name + 
                       ", Type: " + type + 
                       ", Country: " + country + 
                       ", Scale: " + scale + 
                       ", Year: " + year);
}

}