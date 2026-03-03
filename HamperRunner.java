class HamperRunner {

    public static void main(String[] args) {

    
        Hamper hamper1 = new Hamper();
        Hamper hamper2 = new Hamper();

       
        hamper1.addChocolates();
        hamper1.addBiscuits();
        hamper1.addJuice();
        hamper1.addDryFruits();
        hamper1.addCake();
        hamper1.addChips();
        hamper1.addCookies();
        hamper1.addSweets();
        hamper1.addTeaPowder();
        hamper1.addCoffee();
        hamper1.addCandies();
        hamper1.addNuts();
        hamper1.addPickle();
        hamper1.addJam();
        hamper1.addHoney();

       
        hamper2.addChocolates();
        hamper2.addBiscuits();
        hamper2.addJuice();
        hamper2.addDryFruits();
        hamper2.addCake();
        hamper2.addChips();
        hamper2.addCookies();
        hamper2.addSweets();
        hamper2.addTeaPowder();
        hamper2.addCoffee();
        hamper2.addCandies();
        hamper2.addNuts();
        hamper2.addPickle();
        hamper2.addJam();
        hamper2.addHoney();

        // Invoke static methods
        Hamper.packHamper();
        Hamper.sealHamper();
        Hamper.labelHamper();
        Hamper.dispatchHamper();
        Hamper.deliverHamper();
    }
}