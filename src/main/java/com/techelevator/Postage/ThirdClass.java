package com.techelevator.Postage;

public class ThirdClass implements DeliveryDriver{
    @Override
    public double calculateRate(int distance, double weight) {
        double rate = 0;
        if (weight > 0 && weight <= 2) {
            rate = 0.0020 * distance;
        } else if (weight > 2 && weight <= 8) {
            rate = 0.0022 * distance;
        } else if (weight > 8 && weight <= 15) {
            rate = 0.0024 * distance;
        } else if (weight > 16 && weight <= 63) {
            rate = 0.0150 * distance;
        } else if (weight > 64 && weight <= 143) {
            rate = 0.0160 * distance;
        } else {
            rate = 0.0170 * distance;
        }
        return rate;
    }
}
