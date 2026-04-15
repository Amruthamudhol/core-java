package com.xworkz.Jail;

public class Department {
    String deptName;
    boolean isGovernment;

    Department(String deptName, boolean isGovernment) {
        this.deptName = deptName;
        this.isGovernment = isGovernment;
    }

    @Override
    public String toString() {
        return "Department [deptName=" + deptName +
                ", isGovernment=" + isGovernment + "]";
    }
}
