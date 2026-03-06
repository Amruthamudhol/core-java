class Owner {

    String ownerName;
    int id;

    Owner(String ownerName, int id) {
        this.ownerName = ownerName;
        this.id = id;
    }
	void printdetails(){
		System.out.println("ownerName:"+this.ownerName +",id:"+id);
	}
}