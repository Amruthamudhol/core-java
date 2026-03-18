class TurbineRunner {

    public static void main(String[] args) {

        Turbine turbine = new Turbine();
        turbine.turbines = new String[10];

        turbine.storeTurbine("Impulse Turbine");
        turbine.storeTurbine("Reaction Turbine");
        turbine.storeTurbine("Wind Turbine");
        turbine.storeTurbine("Water Turbine");
        turbine.storeTurbine("Gas Turbine");
        turbine.storeTurbine("Kaplan Turbine");
        turbine.storeTurbine("Pelton Turbine");
        turbine.storeTurbine("Francis Turbine");
        turbine.storeTurbine("Hydraulic Turbine");
        turbine.storeTurbine("Steam Turbine");

        System.out.println("======================");

        boolean result = turbine.searchTurbine("Wind Turbine");
        System.out.println("Search Result: " + result);

        System.out.println("======================");

        boolean updateIndex = turbine.updateTurbine(2, "Wind Turbine Updated");
        System.out.println("Update Index Result: " + updateIndex);

        System.out.println("======================");

        boolean updateName = turbine.updateTurbine("Gas Turbine", "Gas Turbine Pro");
        System.out.println("Update Name Result: " + updateName);

        System.out.println("======================");

        boolean deleteIndex = turbine.deleteTurbine(4);
        System.out.println("Delete Index Result: " + deleteIndex);

        System.out.println("======================");

        boolean deleteName = turbine.deleteTurbine("Pelton Turbine");
        System.out.println("Delete Name Result: " + deleteName);

        System.out.println("======================");

        System.out.println("Final Turbine List:");
        for (String t : turbine.turbines) {
            System.out.println(t);
        }
    }
}