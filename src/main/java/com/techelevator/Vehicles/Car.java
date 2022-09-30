package com.techelevator.Vehicles;

import static java.lang.Math.round;

public class Car implements Vehicle {

    private boolean hasTrailer;

    public Car(boolean hasTrailer){
        this.hasTrailer = hasTrailer;
    }

    public double calculateToll(int distance) {
        double toll = distance * 0.020;
        if (hasTrailer) {
            toll = toll + 1.00;
            return toll;
        } else {
            return toll;
        }
    }



    public String toString() {

        if (hasTrailer) {

            return "Car (with trailer) ";

        } else {

            return "Car ";
        }
    }



    public boolean isHasTrailer() {
        return hasTrailer;
    }
}
