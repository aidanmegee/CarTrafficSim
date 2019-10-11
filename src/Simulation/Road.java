package Simulation;

import java.util.ArrayList;
import java.util.Random;

public class Road { //Road class extends Car class

    //Road class variables
    private int roadLength;
    private int roadNumber;
    private ArrayList<Vehicle> currentVehicles = new ArrayList<Vehicle>();

    //Constructor for Road class
    public Road(int roadNumber, int roadLength) {
        this.roadNumber = roadNumber;
        this.roadLength = roadLength;
    }

    public void addVehicle() {
        Random random = new Random();
        int randomVehicle  = random.nextInt(2);
        switch (randomVehicle) {
            case 0:
                currentVehicles.add(new Car(0, 0, 1, 2));
                break;
            case 1:
                currentVehicles.add(new Motorbike(0, 0, 2, 2));
                break;
            case 2:
                currentVehicles.add(new Bus(0, 0, 3, 2));
                break;
        }
    }

    public void roadChange() {
        while (roadNumber < 2) {
            roadNumber = roadNumber + 1;
            if (roadNumber == 2) {
                break;
            }
        }
    }

    /*setters and getters for Road class*/
    public int getRoadLength() {
        return roadLength;
    }

    public int getRoadNumber() {
        return roadNumber;
    }

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }

    public void setRoadNumber(int roadNumber) {
        this.roadNumber = roadNumber;
    }

}
