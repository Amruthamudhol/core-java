package com.xworkz.Jail;

public class Jail {
    long jailId;
    double areaSize;
    String[] blockNames;
    ZoneType zone;
    Department controlDept;

    Jail(long jailId, double areaSize, String[] blockNames,
         ZoneType zone, Department controlDept) {

        this.jailId = jailId;
        this.areaSize = areaSize;
        this.blockNames = blockNames;
        this.zone = zone;
        this.controlDept = controlDept;
    }

    public void monitor() {
        System.out.println("Monitoring jail ID: " + jailId);
    }

    public void showArea() {
        System.out.println("Area Size: " + areaSize);
    }

    @Override
    public String toString() {
        return "Jail [jailId=" + jailId +
                ", areaSize=" + areaSize +
                ", zone=" + zone +
                ", controlDept=" + controlDept + "]";
    }
}
