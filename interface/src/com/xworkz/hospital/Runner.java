package com.xworkz.hospital;

public class Runner {
    public static void main(String[] args) {

        Hospital apollo = new ApolloHospital();

        Doctor doctor = new Doctor(apollo);

        doctor.work();
    }
}
