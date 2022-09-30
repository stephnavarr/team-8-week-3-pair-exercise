package com.techelevator.Postage;

public class TwoDaySPU implements DeliveryDriver {

    public double calculateRate(int distance, double weight) {
        double rate = weight * 0.050 * distance;
        return rate;
    }
}
