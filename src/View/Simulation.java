//package View;
//
//import Model.*;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.Random;
//
//public class Simulation {
//
//    //Constructor holds GUI components
//    public void addStraightRoad() { //add a road object to simulation //TODO possibly need two methods to add different intersection types
//        for (Road road : road.connectingRoads) {
//            road.connectingRoads.add(road);
//            road.setRoadLength(road.getRoadLength());
//        }
//    }
//
//    void setModel(Road road, Car car) {
//        this.road = road;
//        this.car = car;
//    }
//
//    public void addVehicle() { //adds a random vehicle index 0, 1, 2 to the road
//        Random random = new Random();
//        int randomVehicle = random.nextInt(3);
//        switch (randomVehicle) {
//            case 0:
//                currentVehicles.add(new Car(1, 0, 1, 2));
//                break;
//            case 1:
//                road.currentVehicles.add(new Motorbike(1, 0, 2, 2, 10));
//                break;
//            case 2:
//                road.currentVehicles.add(new Bus(1, 0, 3, 2, 10));
//                break;
//        }
//    }
//
//    public void addTrafficLight() {
//        for (TrafficLight trafficLight : road.trafficLights) {
//            //implement scanner to determine if user adds a traffic light
//            road.trafficLights.add(trafficLight);
//            trafficLight.setLightPositionOnRoad(trafficLight.getLightPositionOnRoad());
//        }
//    }
//
//    public void changeRoad() { //change road, adds connecting road to road ArrayList
//        for (Road connectingRoad : road.connectingRoads) {
//            for (Vehicle vehicle : road.currentVehicles) {
//                if (vehicle.getPositionOnRoad() == road.getRoadLength()) {
//                    connectingRoad.currentVehicles.add(vehicle);
//                    connectingRoad.removeVehicle();
//                    vehicle.setPositionOnRoad(0);
//                }
//            }
//        }
//    }
//
//}
