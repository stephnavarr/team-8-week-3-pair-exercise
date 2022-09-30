package com.techelevator.Postage;

public class FexEd implements DeliveryDriver{

    public double calculateRate(int distance, double weight) {
        double rate = 20.00;
        if(distance > 500 && weight <= 48) {
            rate = rate + 5.00;
            rate = rate * distance;
        } else if (distance > 500 && weight > 48) {
            rate = rate + 8.00;
            rate = rate * distance;
        } else if (distance <= 500 && weight > 48) {
            rate = rate + 3.00;
            rate = rate * distance;
        } else {
            return rate;
        } return rate;
    }

    public String toString() {
        return "FexEd";

    }
}
