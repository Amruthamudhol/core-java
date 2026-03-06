class Battery {

    String type;
    int capacity;

    Battery(String type,int capacity) {
        this.type = type;
        this.capacity = capacity;
		
    }
	void getinfo(){
		System.out.println("Battery details,battery type:"+this.type + ",Battery capacity:"+this.capacity);
		
	}
}