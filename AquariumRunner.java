class AquariumRunner {

    public static void main(String[] args) {

        Fish fish = new Fish("GoldFish",2);
        Water water = new Water("Fresh",26.5);
        Filter filter = new Filter("AquaClear",50);
        Light light = new Light("LED",20);
        Decoration decoration = new Decoration("Rock","Brown");

        Aquarium aquarium = new Aquarium("HomeTank",100.5,false,10,"Rectangle",
                fish,water,filter,light,decoration);

        aquarium.printInfo();
    }
}