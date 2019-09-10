package Simulation;

import java.util.Random;

public class MainSimulation extends Car { //main simulation class


    public static void main(String[] args) {

        /*Car class values*/
        int positionOnRoad; //index 0 for car position start
        int positionOnRoad2 = 0;
        String vehicle = "Car";
        String road1 = "Road 1";
        String road2 = "Road 2";



        /*Traffic Light class values*/
        double maxRateOfChange = 0.99; //set values for traffic light class
        double minRateOfChange = 0.01;
        String colourGreen = "Green";
        String colourRed = "Red";


        positionOnRoad = 0;
        while (positionOnRoad <= 4) {
            System.out.println(vehicle + " is now travelling on : " + road1 + " : " + "segment " + positionOnRoad);
            ++positionOnRoad;

            Random random = new Random();
            double result = minRateOfChange + (maxRateOfChange - minRateOfChange) * random.nextDouble();
            if (result <= 0.3) { //rate determines colour change of traffic light
                System.out.println("Traffic Light changed to " + colourRed);
                    System.out.println("Current traffic light status : " + colourRed);

            if (result > 0.3) {
                System.out.println("Current traffic light status : " + colourGreen);
                }
                else if (positionOnRoad == 5 && result <= 0.3) {
                    System.out.println(vehicle + "Stopping at " + colourRed + " Light ");
                }
            }
            else if (result > 0.3) { //if less than 30%, lights stay same colour
                System.out.println("Traffic Light stays :  " + colourGreen);
                if (positionOnRoad == 4 && result > 0.3 || !"Green".equals(colourGreen.intern())) {
                    System.out.println(vehicle + "Stops at Red Traffic Light");
                }
                else if(positionOnRoad == 4 && result <= 0.3 || !"Red".equals(colourRed.intern())) {
                    System.out.println(vehicle + " Is moving to " + road2);
                    road1 = road2;
                    ++positionOnRoad; //increments position on road
                }
            }
        }
        while (positionOnRoad2 <= 4) { //position for road 2
            System.out.println(vehicle + " is now travelling on : " + road2 + " : " + "segment " + positionOnRoad2);
            ++positionOnRoad2; //increments position on road 2
        }
    }
}



