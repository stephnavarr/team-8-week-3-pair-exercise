package com.techelevator;

public class Truck implements Vehicle{

    private int numberOfAxles;

    public Truck(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public double calculateToll(int distance) {

        double ratePerMile = 0;
        if (numberOfAxles == 4) {
            ratePerMile = 0.040;
        } else if (numberOfAxles == 6) {
            ratePerMile = 0.045;
        } else {
            ratePerMile = 0.048;
        }
        double toll = ratePerMile * distance;
        return toll;
    }


    public int getNumberOfAxles() {
        return numberOfAxles;
    }
}
