package com.company;

public class Client {
    private int id;
    private String businessName;
    private BusinessSize businessSize;
    private int numberOfEmployees;
    private int income;
    private String location;

    public Client(int id, String businessName, BusinessSize businessSize, int numberOfEmployees, int income, String location) {
        this.id = id;
        this.businessName = businessName;
        this.businessSize = businessSize;
        this.numberOfEmployees = numberOfEmployees;
        this.income = income;
        this.location = location;
        System.out.println(" Salut ");
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public BusinessSize getBusinessSize() {
        return businessSize;
    }

    public void setBusinessSize(BusinessSize businessSize) {
        this.businessSize = businessSize;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", businessName='" + businessName + '\'' +
                ", businessSize=" + businessSize +
                ", numberOfEmployees=" + numberOfEmployees +
                ", income=" + income +
                ", location='" + location + '\'' +
                '}';
    }
}
