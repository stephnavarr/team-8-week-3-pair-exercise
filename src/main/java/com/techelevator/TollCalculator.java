package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TollCalculator {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        Car carWithTrailer = new Car(true);
        Car carWithoutTrailer = new Car(false);
        Tank tank = new Tank();
        Truck fourAxleTruck = new Truck(4);
        Truck sixAxleTruck = new Truck(6);
        Truck eightAxleTruck = new Truck(8);

        vehicles.add(carWithoutTrailer);
        vehicles.add(carWithTrailer);
        vehicles.add(tank);
        vehicles.add(fourAxleTruck);
        vehicles.add(sixAxleTruck);
        vehicles.add(eightAxleTruck);

        for (Vehicle tollVehicles : vehicles) {

            int randomDistance = (int)(Math.random() * 1001);

            //this made really big numbers hehe
           // Random distance = new Random();
            //int distanceAsInt = distance.nextInt(0);

            tollVehicles.calculateToll(randomDistance);

            System.out.println(vehicles.get()tollVehicles.calculateToll(randomDistance));
        }















    }
}
