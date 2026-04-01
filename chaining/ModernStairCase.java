class ModernStairCase extends StairCase {

    double height;
    char grade;
    long weightCapacity;

    ModernStairCase(int steps, String material, boolean hasHandrail,       double height, char grade, long weightCapacity) 
	{

        super(steps, material, hasHandrail);
        this.height = height;
        this.grade = grade;
        this.weightCapacity = weightCapacity;
    }

    void display() {
        System.out.println("Steps: " + steps);
        System.out.println("Material: " + material);
        System.out.println("Handrail: " + hasHandrail);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Weight Capacity: " + weightCapacity);
        System.out.println("----------------------");
    }
}