class Festival {

    String name;
	String month;
	String type;
    String country;
    int year;

    Festival(String name, String month, String type, String country, int year) {
        this.name = name;
        this.month = month;
        this.type = type;
		this.country = country;
        this.year = year;
    }

    void printInfo() {
        System.out.println("Festival: " + name + 
                           ", Country: " + country + 
                           ", Month: " + month + 
                           ", Type: " + type + 
                           ", Year: " + year);
    }
}