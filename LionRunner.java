class LionRunner {

    public static void main(String[] args) {

        Habitat habitat = new Habitat(null, 500.5);
        Zoo zoo = new Zoo("Bannerghatta Zoo", "Bangalore");
        Food food = new Food("Meat", 10);
        Trainer trainer = new Trainer("Jack", 8);
        Health health = new Health(true, "Healthy");

        Lion lion = new Lion("Simba", 5, 190.5, true, "Golden",
                habitat, zoo, food, trainer, health);

        System.out.println("Lion Name: " + lion.name);
        System.out.println("Age: " + lion.age);
        System.out.println("Weight: " + lion.weight);
        System.out.println("Male: " + lion.male);
        System.out.println("Color: " + lion.color);

        System.out.println("Habitat: " + lion.habitat.place);
		if(habitat!=null){
			habitat.printDetails();
		}
		else{
			System.out.println("habitat is not there...");
			
		}
        System.out.println("Zoo: " + lion.zoo.zooName);
		if(zoo!=null){
			zoo.printDetails();
		}
		else{
			System.out.println("zoo is not there...");
		}
        System.out.println("Food: " + lion.food.type);
        System.out.println("Trainer: " + lion.trainer.trainerName);
		if(trainer!=null){
			trainer.getInfo();
		}
		else{
			System.out.println("trainer is not there...");
		}
        System.out.println("Health Condition: " + lion.health.condition);
    }
}