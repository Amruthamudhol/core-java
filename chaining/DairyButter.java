class DairyButter extends Butter {

    int quantity;
    char grade;
    long expiryDays;

    DairyButter(String type, double price, boolean salted,     int quantity, char grade, long expiryDays) 
	{

        super(type, price, salted);
        this.quantity = quantity;
        this.grade = grade;
        this.expiryDays = expiryDays;
    }

    void display() {
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Salted: " + salted);
        System.out.println("Quantity: " + quantity);
        System.out.println("Grade: " + grade);
        System.out.println("Expiry Days: " + expiryDays);
        System.out.println("--------------");
    }
}