class FortRunner {
    public static void main(String[] args) {

        City city1 = new City("Pune");
        City city2 = new City("Jaipur");

        Fort f1 = new Fort(4, city1, Material.STONE);
        Fort f2 = new Fort(6, city2, Material.BRICK);
        Fort f3 = new Fort(3, null, Material.WOOD);
        Fort f4 = new Fort(5, city1, Material.IRON);

        f1.printInfo();
        f2.printInfo();
        f3.printInfo();
        f4.printInfo();
    }
}