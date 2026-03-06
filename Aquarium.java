class Aquarium {

    String name;
    double capacity;
    boolean saltWater;
    int fishCount;
    String shape;

    Fish fish;
    Water water;
    Filter filter;
    Light light;
    Decoration decoration;

    Aquarium(String name,double capacity,boolean saltWater,int fishCount,String shape,
             Fish fish,Water water,Filter filter,Light light,Decoration decoration) {

        this.name = name;
        this.capacity = capacity;
        this.saltWater = saltWater;
        this.fishCount = fishCount;
        this.shape = shape;

        this.fish = fish;
        this.water = water;
        this.filter = filter;
        this.light = light;
        this.decoration = decoration;
    }

    void printInfo() {

        System.out.println("Aquarium Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Salt Water: " + saltWater);
        System.out.println("Fish Count: " + fishCount);
        System.out.println("Shape: " + shape);

        if(fish != null)
		{
            fish.printDetails();
        } 
		else {
            System.out.println("Fish details not available");
        }

        if(water != null){
            water.printDetails();
        } 
		else 
		{
            System.out.println("Water details not available");
        }

        if(filter != null){
            filter.printDetails();
        }
		else 
		{
            System.out.println("Filter details not available");
        }

        if(light != null){
            light.printDetails();
        }
		else 
		{
            System.out.println("Light details not available");
        }

        if(decoration != null){
            decoration.printDetails();
        } 
		else 
		{
            System.out.println("Decoration details not available");
        }
    }
}