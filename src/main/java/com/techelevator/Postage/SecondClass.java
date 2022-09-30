package com.techelevator.Postage;

public class SecondClass implements DeliveryDriver {

    public double calculateRate(int distance, double weight) {
        double rate = 0;
        if (weight > 0 && weight <= 2) {
            rate = 0.0035 * distance;
        } else if (weight > 2 && weight <= 8) {
            rate = 0.0040 * distance;
        } else if (weight > 8 && weight <= 15) {
            rate = 0.0047 * distance;
        } else if (weight > 16 && weight <= 63) {
            rate = 0.0195 * distance;
        } else if (weight > 64 && weight <= 143) {
            rate = 0.0450 * distance;
        } else {
            rate = 0.05 * distance;
        }
        return rate;
    }

    public String toString() {

        return "Postal Service (2nd Class)";

    }
}
