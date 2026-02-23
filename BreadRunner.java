class BreadRunner {
    public static void main(String[] args) {

        Bread bread1 = new Bread();
        bread1.type = "Whole Wheat";
        bread1.outletNames = new String[]{"FreshMart", "DailyNeeds"};
        bread1.ingredients = new String[]{"Wheat Flour", "Water", "Yeast", "Salt"};
        bread1.shape = "Rectangle";

        Bread bread2 = new Bread();
        bread2.type = "Multigrain";
        bread2.outletNames = new String[]{"SuperStore", "HealthyFoods", "CityBakery"};
        bread2.ingredients = new String[]{"Wheat Flour", "Oats", "Ragi", "Water", "Yeast"};
        bread2.shape = "Round";

        System.out.println("Bread 1 Details:");
        System.out.println("Type: " + bread1.type);
        System.out.println("Shape: " + bread1.shape);

        System.out.println("Outlet Names:");
        for (int i = 0; i < bread1.outletNames.length; i++) {
            System.out.println(bread1.outletNames[i]);

        System.out.println("Ingredients:");
        for (int i = 0; i < bread1.ingredients.length; i++) {
            System.out.println(bread1.ingredients[i]);
        }

        System.out.println("----------------------------");

        System.out.println("Bread 2 Details:");
        System.out.println("Type: " + bread2.type);
        System.out.println("Shape: " + bread2.shape);

        System.out.println("Outlet Names:");
        for (int i = 0; i < bread2.outletNames.length; i++) {
            System.out.println(bread2.outletNames[i]);
        }

        System.out.println("Ingredients:");
        for (int i = 0; i < bread2.ingredients.length; i++) {
            System.out.println(bread2.ingredients[i]);
        }
    }
}
