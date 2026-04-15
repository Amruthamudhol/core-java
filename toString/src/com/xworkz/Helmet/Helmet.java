package com.xworkz.Helmet;

public class Helmet {
    int codeNumber;
    double weight;
    boolean isCertified;
    char sizeCategory;
    String[] featureTags;
    ProtectionGrade grade;
    Supplier supplyInfo;

    Helmet(int codeNumber, double weight, boolean isCertified,
           char sizeCategory, String[] featureTags,
           ProtectionGrade grade, Supplier supplyInfo) {

        this.codeNumber = codeNumber;
        this.weight = weight;
        this.isCertified = isCertified;
        this.sizeCategory = sizeCategory;
        this.featureTags = featureTags;
        this.grade = grade;
        this.supplyInfo = supplyInfo;
    }

    public void checkSafety() {
        System.out.println("Helmet code " + codeNumber + " safety checked.");
    }


    public void displayWeight() {
        System.out.println("Weight: " + weight );
    }

    @Override
    public String toString() {
        return "Helmet [codeNumber=" + codeNumber +
                ", weight=" + weight +
                ", isCertified=" + isCertified +
                ", sizeCategory=" + sizeCategory +
                ", grade=" + grade +
                ", supplyInfo=" + supplyInfo + "]";
    }
}
