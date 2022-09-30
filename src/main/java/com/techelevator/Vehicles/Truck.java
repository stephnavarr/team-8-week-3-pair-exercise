package com.techelevator.Vehicles;

import static java.lang.Math.round;

public class Truck implements Vehicle {

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
        toll = round(toll);
        return toll;
    }

    public String toString() {

        if (numberOfAxles == 4) {
            return "Truck (4 axels)";
        } else if (numberOfAxles == 6) {
            return "Truck (6 axels)";
        } else {
            return "Truck (8 axels)";
        }

    }


    public int getNumberOfAxles() {
        return numberOfAxles;
    }
}
