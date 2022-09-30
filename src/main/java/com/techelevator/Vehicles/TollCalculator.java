package com.techelevator.Vehicles;

import java.util.ArrayList;
import java.util.List;

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

        System.out.printf("%-20s", "Vehicle") ;

        System.out.printf("%18s", "Distance Traveled");

        System.out.printf("%25s", "Toll $");
        System.out.println("\n----------------------------------------------------------------");


        double tollTotal = 0;
        int distanceTraveled = 0;

        for (int i = 0; i < vehicles.size(); i++) {

            int randomDistance = (int)(Math.random() * 1001);


            tollTotal += vehicles.get(i).calculateToll(randomDistance);
            distanceTraveled += randomDistance;





//            System.out.printf("%-10s %15d %25s %n", vehicles.get(i).toString(), randomDistance,
//                    vehicles.get(i).calculateToll(randomDistance));

            System.out.printf("%-20s", vehicles.get(i).toString());
            System.out.printf("%15d", randomDistance);
            System.out.printf("%25.2f", vehicles.get(i).calculateToll(randomDistance));
            System.out.println();


        }

        System.out.println("\nTotal Miles Traveled: " + distanceTraveled);
        System.out.println("Total Tollbooth Revenue: $" + tollTotal);







    }
}
