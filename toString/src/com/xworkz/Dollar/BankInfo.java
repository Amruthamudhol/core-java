package com.xworkz.Dollar;

public class BankInfo {
    String bankName;
    String branch;

    BankInfo(String bankName, String branch) {
        this.bankName = bankName;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "BankInfo [bankName=" + bankName +
                ", branch=" + branch + "]";
    }
}
