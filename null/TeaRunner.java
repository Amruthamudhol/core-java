class TeaRunner {

    public static void main(String[] args) {

        Ingredient ingredient = new Ingredient("Tea Leaves", 10);
        Cup cup = new Cup("Ceramic", 200);
        Shop shop = new Shop("Amruta Tea Stall", "Bangalore");
        Manufacturer2 manufacturer = new Manufacturer2("Tata Tea", "India");
        Temperature temperature = new Temperature(80, true);

        Tea tea = new Tea("Tata", 20.0, true, 2, "Masala",ingredient, null, shop, manufacturer, temperature);
                

        System.out.println("Brand: " + tea.brand);
        System.out.println("Price: " + tea.price);
        System.out.println("Organic: " + tea.organic);
        System.out.println("Quantity: " + tea.quantity);
        System.out.println("Flavor: " + tea.flavor);

        if (tea.ingredient != null)
		{
            tea.ingredient.printDetails();
        } 
		else 
		{
            System.out.println("Ingredient details not available");
        }

        if (tea.cup != null)
		{
            tea.cup.printDetails();
        } 
		else
		{
            System.out.println("Cup details not available");
        }

        System.out.println("Shop: " + tea.shop.shopName);
        System.out.println("Manufacturer: " + tea.manufacturer.name);
        System.out.println("Temperature Level: " + tea.temperature.hotLevel);
    }
}