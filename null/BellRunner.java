class BellRunner {

    public static void main(String[] args) {

        Sound sound = new Sound("Ring", 80, true, 2000.5, "High");
        Material material = new Material("Steel", 1.5, true, 10, "Silver");
        Size size = new Size(10, 5, 3, true, "cm");
        Manufacturer3 manufacturer = new Manufacturer3("BellCo", "India", 1995, true, "Ramesh");
        Warranty2 warranty = new Warranty2(2, "Full", true, "BellCo", 500);

        Bell bell = new Bell("TempleBell", 1200.0, false, 2, "Golden",sound, material, size, manufacturer, warranty);
                

        System.out.println("Bell Name: " + bell.name);
        System.out.println("Price: " + bell.price);
        System.out.println("Electric: " + bell.electric);
        System.out.println("Quantity: " + bell.quantity);
        System.out.println("Color: " + bell.color);

        if(bell.sound != null)
		{
            bell.sound.printDetails();
        } 
		else
			{
            System.out.println("Sound details not available");
        }

        if(bell.material != null)
		{
            bell.material.printDetails();
        } 
		else 
		{
            System.out.println("Material details not available");
        }

        if(bell.size != null)
		{
            bell.size.printDetails();
        } 
		else 
		{
            System.out.println("Size details not available");
        }

        if(bell.manufacturer != null)
		{
            bell.manufacturer.printDetails();
        } 
		else
			{
            System.out.println("Manufacturer details not available");
        }

        if(bell.warranty != null)
		{
            bell.warranty.printDetails();
        }
		else
			{
            System.out.println("Warranty details not available");
        }
    }
}