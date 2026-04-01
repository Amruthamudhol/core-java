class FarmChicken extends Chicken {

    double weight;
    char grade;
    long eggsPerYear;

    FarmChicken(String breed, int age, boolean isLayer,      double weight, char grade, long eggsPerYear)
	{

        super(breed, age, isLayer);
        this.weight = weight;
        this.grade = grade;
        this.eggsPerYear = eggsPerYear;
    }

    void display() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Layer: " + isLayer);
        System.out.println("Weight: " + weight);
        System.out.println("Grade: " + grade);
        System.out.println("Eggs Per Year: " + eggsPerYear);
        System.out.println("----------------------");
    }
}