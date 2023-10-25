package com.aurionpro.model;

public class FourWheeler extends Vehicle {
    double mileage;

    public FourWheeler(String companyName, double mileage) {
        super(companyName);
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }
}
