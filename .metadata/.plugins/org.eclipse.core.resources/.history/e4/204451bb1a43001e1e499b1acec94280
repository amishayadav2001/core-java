package com.aurionpro.model;

public class Employee {
    private int id;
    private String name;
    private double basic;
    private double hra;
    private double da;
    private double ta;
    private double grossSalary;

    public Employee(int id, String name, double basic, double hra, double da, double ta) {
        this.id = id;
        this.name = name;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.ta = ta;
        this.grossSalary = calculateTotalSalary() * 12 - calculateTax();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getDa() {
        return da;
    }

    public void setDa(double da) {
        this.da = da;
    }

    public double getTa() {
        return ta;
    }

    public void setTa(double ta) {
        this.ta = ta;
    }

    public double calculateTotalSalary() {
        return basic + hra + da + ta;
    }

    public double calculateTax() {
        double totalSalary = calculateTotalSalary();
        double tax = 0;

        if (totalSalary > 500000 && totalSalary <= 800000) {
            tax = totalSalary * 0.1;
        } else if (totalSalary > 800000 && totalSalary <= 1000000) {
            tax = totalSalary * 0.2;
        } else if (totalSalary > 1000000) {
            tax = totalSalary * 0.3;
        }

        return tax;
    }

    public void printSalarySlip() {
        double totalSalary = calculateTotalSalary();
        System.out.println("Employee:" + "\nid=" + id + "\nname=" + name + "\nbasic=" + basic + "\nhra=" + hra + "\nda=" + da + "\nta=" + ta + "\nMonthly Salary=" + totalSalary + "\nAnnual Salary=" + totalSalary * 12 + "\nTax=" + calculateTax() + "\nGross Salary=" + grossSalary);
        
    }
}

