class Jamun {

    int[] syrupQuantity;
    Topping[] toppingList;

    Jamun(int[] syrupQuantity, Topping[] toppingList) {
        this.syrupQuantity = syrupQuantity;
        this.toppingList = toppingList;
    }

    void info() {

        System.out.println("Syrup Quantity:");

        if (syrupQuantity != null) {

            System.out.println("Total Jamuns: " + this.syrupQuantity.length);

            for (int syrup : syrupQuantity) {
                System.out.println("Syrup Level: " + syrup);
            }
        }

        System.out.println("Topping Details:");

        if (toppingList != null) {

            System.out.println("Total Toppings: " + this.toppingList.length);

            for (Topping top : toppingList) {
                top.display();
            }
        }
    }
}