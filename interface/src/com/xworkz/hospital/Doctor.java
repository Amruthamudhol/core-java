package com.xworkz.hospital;

public class Doctor {
    Hospital hospital;

    Doctor(Hospital hospital) {
        this.hospital = hospital;
    }

    public void work() {
        System.out.println("Doctor is working in Hospital");

        if (hospital != null) {
            hospital.treatment();
        }
    }
}
