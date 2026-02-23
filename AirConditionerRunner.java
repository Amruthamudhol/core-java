class AirConditionerRunner {
    public static void main(String[] args) {

        AirConditioner ac1 = new AirConditioner();
        ac1.brand = "LG";
        ac1.model = "DualCool X1";
        ac1.price = 45000.00;
        ac1.type = "Split";
        ac1.weight = 35.5;
        ac1.colors = new String[]{"White", "Silver"};
        ac1.warranty = 5;
        ac1.working = true;

        AirConditioner ac2 = new AirConditioner();
        ac2.brand = "Samsung";
        ac2.model = "WindFree Pro";
        ac2.price = 52000.00;
        ac2.type = "Window";
        ac2.weight = 40.0;
        ac2.colors = new String[]{"White", "Grey", "Black"};
        ac2.warranty = 3;
        ac2.working = false;

        System.out.println("AirConditioner 1 Details:");
        System.out.println("Brand: " + ac1.brand);
        System.out.println("Model: " + ac1.model);
        System.out.println("Price: " + ac1.price);
        System.out.println("Type: " + ac1.type);
        System.out.println("Weight: " + ac1.weight);
        System.out.println("Warranty: " + ac1.warranty + " years");
        System.out.println("Working Status: " + ac1.working);
        System.out.println("Available Colors:");
        for (int i = 0; i < ac1.colors.length; i++) {
            System.out.println(ac1.colors[i]);
        }

        System.out.println("----------------------------");

        System.out.println("AirConditioner 2 Details:");
        System.out.println("Brand: " + ac2.brand);
        System.out.println("Model: " + ac2.model);
        System.out.println("Price: " + ac2.price);
        System.out.println("Type: " + ac2.type);
        System.out.println("Weight: " + ac2.weight);
        System.out.println("Warranty: " + ac2.warranty + " years");
        System.out.println("Working Status: " + ac2.working);
        System.out.println("Available Colors:");
        for (int i = 0; i < ac2.colors.length; i++) {
            System.out.println(ac2.colors[i]);
        }
    }
}