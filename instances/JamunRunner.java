class JamunRunner {

    public static void main(String[] args) {

        int[] syrup = new int[3];
        syrup[0] = 20;
        syrup[1] = 25;
        syrup[2] = 30;

        Topping[] toppings = new Topping[3];

        Topping t1 = new Topping("Pista", 2);
        Topping t2 = new Topping("Almond", 3);
        Topping t3 = new Topping("Rose Syrup", 1);

        toppings[0] = t1;
        toppings[1] = t2;
        toppings[2] = t3;

        Jamun jamun = new Jamun(syrup, toppings);

        jamun.info();
    }
}