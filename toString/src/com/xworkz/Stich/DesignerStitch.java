package com.xworkz.Stich;

public class DesignerStitch extends Stitch{
    String designName;
    boolean urgentOrder;

    DesignerStitch(int stitchId, double cost, String[] fabricTypes,
                   StitchType stitchMode, Tailor tailorDetails,
                   String designName, boolean urgentOrder) {

        super(stitchId, cost, fabricTypes, stitchMode, tailorDetails);
        this.designName = designName;
        this.urgentOrder = urgentOrder;
    }

    @Override
    public void startStitch() {
        System.out.println("Designer stitch started: " + stitchId);
    }

    @Override
    public void showCost() {
        System.out.println("Designer stitch cost: " + cost);
    }

    @Override
    public String toString() {
        return "DesignerStitch [stitchId=" + stitchId +
                ", cost=" + cost +
                ", stitchMode=" + stitchMode +
                ", tailorDetails=" + tailorDetails +
                ", designName=" + designName +
                ", urgentOrder=" + urgentOrder + "]";
    }
}
