package Simulation;

import java.util.Random;

public class MainSimulation extends Car   { //main simulation


    public void trafficLightOperates() {

        double maxRateOfChange = 0.99; //set values for traffic light class
        double minRateOfChange = 0.01;
        String colourGreen = "Green"; //green light moves car
        String colourRed = "Red"; //red light stops car

        Random random = new Random();

        double result = minRateOfChange + (maxRateOfChange - minRateOfChange) + random.nextDouble();
        if (result <= 0.3) { //if number generated is less than 0.3, change colour
            System.out.println("Traffic light has changed to " + colourRed);
        }
        else {
            System.out.println("Traffic light has changed to " + colourGreen);
        }
    }

    public void Car() {

        int positionOnRoad = 0; //index 0 for car position start
        String vehicle = "Car";
        String road1 = "Road 1";
        String road2 = "Road 2";

    }
    public MainSimulation(String road1, String road2, int positionOnRoad) { //Simulates road for determining which road car is on
        this.road1 = road1;
        this.road2 = road2;
        if (positionOnRoad == 5) { //if vehicle is at segment 5 on road, vehicle moves to road 2
            this.road1 = this.road2;
            System.out.println("Car is now travelling on " + road2 + " at segment" + positionOnRoad);
        }
    }

    public static void main(String[] args) {












    }


}
