package com.xworkz.Helmet;

public class RacingHelmet extends Helmet{
    int maxSpeedLimit;
    boolean hasVisor;

    RacingHelmet(int codeNumber, double weight, boolean isCertified,
                 char sizeCategory, String[] featureTags,
                 ProtectionGrade grade, Supplier supplyInfo,
                 int maxSpeedLimit, boolean hasVisor) {

        super(codeNumber, weight, isCertified, sizeCategory, featureTags, grade, supplyInfo);
        this.maxSpeedLimit = maxSpeedLimit;
        this.hasVisor = hasVisor;
    }

    @Override
    public void checkSafety() {
        System.out.println("Racing helmet tested for high-speed safety.");
    }

    @Override
    public void displayWeight() {
        System.out.println("Lightweight racing helmet: " + weight + " kg");
    }

    @Override
    public String toString() {
        return "RacingHelmet [codeNumber=" + codeNumber +
                ", weight=" + weight +
                ", isCertified=" + isCertified +
                ", sizeCategory=" + sizeCategory +
                ", grade=" + grade +
                ", supplyInfo=" + supplyInfo +
                ", maxSpeedLimit=" + maxSpeedLimit +
                ", hasVisor=" + hasVisor + "]";
    }
}
