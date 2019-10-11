package Simulation;

import java.util.ArrayList;
import java.util.Random;

public class TrafficLight { //Traffic Light class

    public int lightPositionOnRoad;
    public ArrayList<Road> roads = new ArrayList<>();

    public enum trafficLightState {
        GREEN,
        ORANGE,
        RED,
    }

    public void operate() {
        Random random = new Random();
        float lightChange = random.nextFloat();
        if (lightChange <= 0.3) {
            //set trafficlight state to different enum
        }
//        switch (lightChange) {
//            case 1:
//                //if lightChange is less than 0.3 change from green to orange
//                break;
//            case 2:
//                //if lightchange is greater than 0.3 change from red to green
//                break;
//
//        }
    }


//    public void changeRoad() {
//        Road connectingRoad = new Road(1, 30); //instantiates new road to connect to
//        for (Road road : roads) {
//            if (getPositionOnRoad() == road.getRoadLength()) {
//                //check for traffic lights ****
//                roads.add(connectingRoad);
//                //eventually check if no roads are added to end of 1st road, removeVehicle() method is called
//                road.setRoadNumber(1);
//                road.setRoadLength(30);
//                setPositionOnRoad(0);
//            }
//        }
//    }

    /*Setters and getter methods for fields in Traffic Light class*/


}

