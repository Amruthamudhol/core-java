package com.xworkz.Chain;

public class DesignerChain extends Chain{
    String styleName;    // Extra variable 1
    boolean limitedEdition; // Extra variable 2

    DesignerChain(long serialNumber, float thickness, String[] patternList,
                  MetalType metal, Vendor vendorDetails,
                  String styleName, boolean limitedEdition) {

        super(serialNumber, thickness, patternList, metal, vendorDetails);
        this.styleName = styleName;
        this.limitedEdition = limitedEdition;
    }
    @Override
    public void displayChain() {
        System.out.println("Designer chain serial: " + serialNumber);
    }

    @Override
    public void showThickness() {
        System.out.println("Designer chain thickness: " + thickness);
    }

    @Override
    public String toString() {
        return "DesignerChain [serialNumber=" + serialNumber +
                ", thickness=" + thickness +
                ", metal=" + metal +
                ", vendorDetails=" + vendorDetails +
                ", styleName=" + styleName +
                ", limitedEdition=" + limitedEdition + "]";
    }
}
