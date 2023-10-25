package com.aurionpro.model;

public class Car extends FourWheeler {
    double price;

    public Car(String companyName, double mileage, double price) {
        super(companyName, mileage);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
