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


        int roadLength = 5; //index 0 to 4

        /*Traffic Light class values*/
        double maxRateOfChange = 0.99; //set values for traffic light class
        double minRateOfChange = 0.01;
        String colourGreen = "Green";
        String colourRed = "Red";


        positionOnRoad = String.valueOf(roadLength).length(); //road length is 0, 1, 2, 3, 4
        positionOnRoad2 = String.valueOf(roadLength).length();

        positionOnRoad = 0;
        while (positionOnRoad <= 4) {
            System.out.println(vehicle + " is now travelling on : " + road1 + " : " + "segment " + positionOnRoad);
            ++positionOnRoad;

            Random random = new Random();
            double result = minRateOfChange + (maxRateOfChange - minRateOfChange) * random.nextDouble();
            if (result <= 0.3) { //rate determines colour change of traffic light
                System.out.println("Traffic Light changed from " + colourGreen + " to " + colourRed);
                if (result <= 0.3) {
                    System.out.println("Current traffic light status : " + colourRed);
                    if (result > 0.3) {
                        System.out.println(" Traffic light changes to " + colourGreen);
                    }
                }
                else if (result > 0.3) {
                    System.out.println("Current traffic light status : " + colourGreen);
                }
                else if (positionOnRoad == 5 && result <= 0.3) {
                    System.out.println(vehicle + "Stopping at " + colourRed + " Light ");
                }
            }
            else if (result > 0.3) { //if less than 30%, lights stay same colour
                System.out.println("Traffic Light stays :  " + colourGreen);
                if (positionOnRoad == 4 && result > 0.3) {
                    if (!"Red".equals(colourRed.intern())) {
                        System.out.println(vehicle + " Is moving to " + road2);
                        ++positionOnRoad2;
                    }
                }
            }
        }
        positionOnRoad2 = 0;
        while (positionOnRoad2 <= 4) {
            System.out.println(vehicle + " is now travelling on : " + road2 + " : " + "segment " + positionOnRoad2);
            ++positionOnRoad2;

        }

    }
}



