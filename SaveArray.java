class SaveArray {

    Product[] products = new Product[10];
    int index = 0;

    void save(Product[] products) {

        if (products != null) {

            for (int i = 0; i < products.length; i++) {

                if (products[i] != null && index < 10) {

                    this.products[index] = products[i];

                    System.out.print("Product stored at " + index + " -> ");
                    this.products[index].displayDetails();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    index++;

                }
            }

        } else {
            System.out.println("Product array is null");
        }

        if (index == 10) {
            System.out.println("No space for more products");
        }
    }
}