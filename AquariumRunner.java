class AquariumRunner {
    public static void main(String[] args) {

        Aquarium a1 = new Aquarium();
        Aquarium a2 = new Aquarium();
        Aquarium a3 = new Aquarium();
        Aquarium a4 = new Aquarium();
        Aquarium a5 = new Aquarium();

        a1.aquariumName = "Ocean World";
        a1.location = "Mumbai";
        a1.numberOfFish = 500;
        a1.waterCapacity = 10000.5;

        a2.aquariumName = "Blue Sea";
        a2.location = "Chennai";
        a2.numberOfFish = 300;
        a2.waterCapacity = 8000.0;

        a3.aquariumName = "Aqua Planet";
        a3.location = "Bangalore";
        a3.numberOfFish = 450;
        a3.waterCapacity = 9500.75;

        a4.aquariumName = "Marine Life";
        a4.location = "Hyderabad";
        a4.numberOfFish = 600;
        a4.waterCapacity = 12000.0;

        a5.aquariumName = "Coral Reef";
        a5.location = "Kochi";
        a5.numberOfFish = 350;
        a5.waterCapacity = 8500.25;

        System.out.println("Aquarium Name: " + a1.aquariumName + " Location: " + a1.location + " Number Of Fish: " + a1.numberOfFish + " Water Capacity: " + a1.waterCapacity);
        System.out.println("Aquarium Name: " + a2.aquariumName + " Location: " + a2.location + " Number Of Fish: " + a2.numberOfFish + " Water Capacity: " + a2.waterCapacity);
        System.out.println("Aquarium Name: " + a3.aquariumName + " Location: " + a3.location + " Number Of Fish: " + a3.numberOfFish + " Water Capacity: " + a3.waterCapacity);
        System.out.println("Aquarium Name: " + a4.aquariumName + " Location: " + a4.location + " Number Of Fish: " + a4.numberOfFish + " Water Capacity: " + a4.waterCapacity);
        System.out.println("Aquarium Name: " + a5.aquariumName + " Location: " + a5.location + " Number Of Fish: " + a5.numberOfFish + " Water Capacity: " + a5.waterCapacity);

        System.out.println("----- Updated Aquarium Details -----");


        a1.numberOfFish = 520;
        a1.waterCapacity = 10500.0;

        a2.numberOfFish = 320;
        a2.waterCapacity = 8200.0;

        a3.numberOfFish = 470;
        a3.waterCapacity = 9800.0;

        a4.numberOfFish = 620;
        a4.waterCapacity = 12500.0;

        a5.numberOfFish = 380;
        a5.waterCapacity = 8800.0;

    
        System.out.println("Aquarium Name: " + a1.aquariumName + " Updated Number Of Fish: " + a1.numberOfFish + " Updated Water Capacity: " + a1.waterCapacity);
        System.out.println("Aquarium Name: " + a2.aquariumName + " Updated Number Of Fish: " + a2.numberOfFish + " Updated Water Capacity: " + a2.waterCapacity);
        System.out.println("Aquarium Name: " + a3.aquariumName + " Updated Number Of Fish: " + a3.numberOfFish + " Updated Water Capacity: " + a3.waterCapacity);
        System.out.println("Aquarium Name: " + a4.aquariumName + " Updated Number Of Fish: " + a4.numberOfFish + " Updated Water Capacity: " + a4.waterCapacity);
        System.out.println("Aquarium Name: " + a5.aquariumName + " Updated Number Of Fish: " + a5.numberOfFish + " Updated Water Capacity: " + a5.waterCapacity);

    }
}
