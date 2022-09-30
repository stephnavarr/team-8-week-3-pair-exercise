package com.techelevator.Postage;

public class FirstClass implements DeliveryDriver {


    public double calculateRate(int distance, double weight) {
        double rate = 0;
        if (weight > 0 && weight <= 2) {
            rate = 0.035 * distance;
        } else if (weight > 2 && weight <= 8) {
            rate = 0.040 * distance;
        } else if (weight > 8 && weight <= 15) {
            rate = 0.047 * distance;
        } else if (weight > 16 && weight <= 63) {
            rate = 0.195 * distance;
        } else if (weight > 64 && weight <= 143) {
            rate = 0.450 * distance;
        } else {
            rate = 0.5 * distance;
        }
        return rate;
    }















}
