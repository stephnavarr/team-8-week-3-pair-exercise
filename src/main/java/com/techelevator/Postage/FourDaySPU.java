package com.techelevator.Postage;

public class FourDaySPU implements DeliveryDriver {

    public double calculateRate(int distance, double weight) {
        double rate = ((weight * 0.0050)/16) * distance;
        return rate;
    }

    public String toString() {

        return "SPU (4-Day Ground)";

    }
}
