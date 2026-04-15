package com.xworkz.Jail;

public class HighSecurityUnit extends Jail {
    char riskGrade;        // Extra variable 1 (char)
    int surveillanceCams;  // Extra variable 2 (int)

    HighSecurityUnit(long jailId, double areaSize, String[] blockNames,
                     ZoneType zone, Department controlDept,
                     char riskGrade, int surveillanceCams) {

        super(jailId, areaSize, blockNames, zone, controlDept);
        this.riskGrade = riskGrade;
        this.surveillanceCams = surveillanceCams;
    }

    @Override
    public void monitor() {
        System.out.println("High security monitoring for jail ID: " + jailId);
    }

    @Override
    public void showArea() {
        System.out.println("Restricted area size: " + areaSize);
    }

    @Override
    public String toString() {
        return "HighSecurityUnit [jailId=" + jailId +
                ", areaSize=" + areaSize +
                ", zone=" + zone +
                ", controlDept=" + controlDept +
                ", riskGrade=" + riskGrade +
                ", surveillanceCams=" + surveillanceCams + "]";
    }
}
