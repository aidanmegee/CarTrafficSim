package Simulation;

import java.util.Random;

public class TrafficLight { //Traffic Light class

    private String[] myStringArray = {"Green", "Red"};
    private boolean[] array = {true, false};
    private String currentState; //set light to green first, changes based on rate


    public void operate() { //determines the rate of change for traffic light from 1% to 99%
        Random random = new Random();
        double result = random.nextDouble();
        if (result <= 0.3) { //if number generated is less than 0.3, change colour
            if (array[0]) {
                array[0] = false;
                array[1] = true;
                currentState = myStringArray[1];
            } else {
                array[1] = false;
                array[0] = true;
                currentState = myStringArray[0];
            }
        }
    }

    /*Setters and getter methods for fields in Traffic Light class*/
    public String[] getMyStringArray() {
        return myStringArray;
    }

    public boolean[] getArray() {
        return array;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

}
