class ElectronicsFactory extends Factory {

    int gadgetsProduced;
    int dailyProductionTarget;
    String factoryManager;
    boolean safetyCertified;
    String mainProduct;

    void showProduction() {
		displayFactoryDetails();
        System.out.println("Total gadgets produced so far: " + gadgetsProduced);
        System.out.println("Daily production target: " + dailyProductionTarget);
        System.out.println("Factory Manager: " + factoryManager);
        System.out.println("Safety Certified: " + safetyCertified);
        System.out.println("Main Product: " + mainProduct);
    }

    
}