package Simulation;

import java.util.Random;

public class MainSimulation extends Car   { //main simulation class


    public static void main(String[] args) {

        /*Car class values*/
        int positionOnRoad; //index 0 for car position start
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

        while(positionOnRoad < 4) {
            System.out.println(vehicle + " is now travelling on " + road1 + " at segment " + positionOnRoad);
            ++positionOnRoad;
            Random random = new Random();
            double result = minRateOfChange + (maxRateOfChange - minRateOfChange) * random.nextDouble();
            if (result <= 0.3) { //rate determines colour change of traffic light
                System.out.println("Traffic Light changed from " + colourGreen + " to " + colourRed);
            }
            else if (result > 0.3) { //if less than 30%, lights stay same colour
                System.out.println("Traffic Light stays " + colourGreen);
            }
                if (positionOnRoad == 4 && result > 0.3) { //if vehicle is at segment 5 on road, vehicle moves to road 2
                    road1 = road2;
                    positionOnRoad = 0;
                    System.out.println(vehicle + " is moving from Road 1 " + " to " + road2);
                    System.out.println(vehicle + " is now travelling on " + road2 + " at segment " + positionOnRoad);
                }
                else if (positionOnRoad == 4 && result <= 0.3) {
                    System.out.println(vehicle + " Stopping at " + colourRed + " Light ");
                    positionOnRoad = 4;

                }
        }



    }


}
