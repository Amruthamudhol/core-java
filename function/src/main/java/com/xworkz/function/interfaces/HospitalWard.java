package com.xworkz.function.interfaces;

@FunctionalInterface
public interface HospitalWard {
    void assign(String patientName, int wardNumber, boolean emergency);
}
