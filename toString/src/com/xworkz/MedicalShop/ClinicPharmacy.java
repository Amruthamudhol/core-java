package com.xworkz.MedicalShop;

public class ClinicPharmacy extends MedicalShop{
    boolean emergencyService;
    int openHours;

    ClinicPharmacy(String outletName, double dailyRevenue, String[] drugCatalog,
                   ServiceMode mode, Distributor supplyChain,
                   boolean emergencyService, int openHours) {

        super(outletName, dailyRevenue, drugCatalog, mode, supplyChain);
        this.emergencyService = emergencyService;
        this.openHours = openHours;
    }

    @Override
    public void operate() {
        System.out.println("Clinic pharmacy running: " + outletName);
    }

    @Override
    public void showRevenue() {
        System.out.println("Clinic pharmacy revenue: " + dailyRevenue);
    }

    @Override
    public String toString() {
        return "ClinicPharmacy [outletName=" + outletName +
                ", dailyRevenue=" + dailyRevenue +
                ", mode=" + mode +
                ", supplyChain=" + supplyChain +
                ", emergencyService=" + emergencyService +
                ", openHours=" + openHours + "]";
    }
}
