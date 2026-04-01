class GermanShepherdRunner {
    public static void main(String[] args) {

        GuardDog g1 = new GuardDog(1, "Rex", true, 60.5, 'A');

        GuardDog g2 = new GuardDog(2, "Rocky", true, 58.0, 'B');

        GuardDog g3 = new GuardDog(3, "Max", false, 62.3, 'A');

        g1.display();
        g2.display();
        g3.display();
    }
}