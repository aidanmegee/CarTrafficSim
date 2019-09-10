package Simulation;

import java.util.Random;

public class TrafficLight extends Road { //Traffic light class extends Road class

    double maxRateOfChange = 0.99; //set values for traffic light class
    double minRateOfChange = 0.01;
    String colourGreen = "Green";
    String colourRed = "Red";


    public void RateOfChange() { //determines the rate of change for traffic light from 1% to 99%
        Random random = new Random();
        double maxRateOfChange = 0.99;
        double minRateOfChange = 0.01;
        double result = minRateOfChange + (maxRateOfChange - minRateOfChange) + random.nextDouble();
        if (result <= 0.3) { //if number generated is less than 0.3, change colour
            System.out.println("Traffic light has changed to " + colourRed);
        } else {
            System.out.println("Traffic light is green " + colourGreen);
        }
    }

    /*setters and getter methods for Traffic Light class */
    public String getColourGreen(String green) {
        return colourGreen;
    }

    public void setColourGreen(String colourGreen) {
        this.colourGreen = colourGreen;
    }

    public String getColourRed(String red) {
        return colourRed;
    }

    public void setColourRed(String colourRed) {
        this.colourRed = colourRed;
    }

    public void getMaxRateOfChange(double v) {
        //if random number between max and min rateofchange is less than 0.3 or 30%
        double maxRateOfChange = 0.99;
    }

    public void getMinRateOfChange(double v) {
        double minRateOfChange = 0.01;
    }
}
