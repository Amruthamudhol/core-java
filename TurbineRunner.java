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

        boolean result = turbine.searchTurbine("Wind Turbine");
        System.out.println("Search Result: " + result);
    }
}