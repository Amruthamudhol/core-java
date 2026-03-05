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

        System.out.println("Fish Type: " + fish.type);
        System.out.println("Fish Age: " + fish.age);

        System.out.println("Water Type: " + water.type);
        System.out.println("Water Temperature: " + water.temperature);

        System.out.println("Filter Brand: " + filter.brand);
        System.out.println("Filter Power: " + filter.power);

        System.out.println("Light Type: " + light.type);
        System.out.println("Light Watt: " + light.watt);

        System.out.println("Decoration Type: " + decoration.type);
        System.out.println("Decoration Color: " + decoration.color);
    }
}