class GuardDog extends GermanShepherd {

    double height;
    char rank;

    GuardDog(int id, String name, boolean vaccinated,       double height, char rank) 
	{

        super(id, name, vaccinated);
        this.height = height;
        this.rank = rank;

    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Vaccinated: " + vaccinated);
        System.out.println("Height: " + height);
        System.out.println("Rank: " + rank);
        System.out.println("----------------------");
    }
}