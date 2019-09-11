package Simulation;

import java.util.Arrays;
import java.util.Random;

public class TrafficLight { //Traffic Light class

    private String[] myStringArray = {"Green", "Red"};
    private boolean [] array = {true, false};
    private boolean currentState = true; //set light to green first, changes based on rate

    public void operate() { //determines the rate of change for traffic light from 1% to 99%
        Random random = new Random();
        double result = random.nextDouble();
        if (result <= 0.3) { //if number generated is less than 0.3, change colour
            System.out.println("Traffic light has changed to " + Arrays.toString(myStringArray));
        }
        else if (result > 0.3) { //number higher than 0.3, stay green
            System.out.println("Traffic light is stays " + Arrays.toString(myStringArray));
        }
        while(currentState = false) {
            System.out.println("Traffic Light is " + myStringArray[1]);
        }
    }

    /*Setters and getter methods for fields in Traffic Light class*/
    public String[] getMyStringArray() {
        return myStringArray;
    }

    public void setMyStringArray(String[] myStringArray) {
        this.myStringArray = myStringArray;
    }

    public boolean[] getArray() {
        return array;
    }

    public void setArray(boolean[] array) {
        this.array = array;
    }

    public boolean isCurrentState() {
        return currentState;
    }

    public void setCurrentState(boolean currentState) {
        this.currentState = currentState;
    }

}
