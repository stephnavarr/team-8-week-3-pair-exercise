package com.techelevator.Postage;

public class NextDaySPU implements DeliveryDriver{

    public double calculateRate(int distance, double weight) {
        double rate = weight * 0.075 * distance;
        return rate;

    }
}
