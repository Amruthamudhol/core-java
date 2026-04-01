class SpecialShawarma extends Shawarma {

    double price;
    char size;
    long calories;

    SpecialShawarma(int id, String name, boolean spicy,         double price, char size, long calories)
	{

        super(id, name, spicy);
        this.price = price;
        this.size = size;
        this.calories = calories;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Spicy: " + spicy);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Calories: " + calories);
        System.out.println("----------------------");
    }
}