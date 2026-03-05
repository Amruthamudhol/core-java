class Lion {

    String name;
    int age;
    double weight;
    boolean male;
    String color;

    Habitat habitat;
    Zoo zoo;
    Food food;
    Trainer trainer;
    Health health;

    Lion(String name, int age, double weight, boolean male, String color,
         Habitat habitat, Zoo zoo, Food food, Trainer trainer, Health health) {

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.male = male;
        this.color = color;

        this.habitat = habitat;
        this.zoo = zoo;
        this.food = food;
        this.trainer = trainer;
        this.health = health;
    }
}