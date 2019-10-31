package View;

import Model.*;
import Model.Road;

import java.awt.*;
import java.util.Random;

public class Simulation {

    private Car car;
    private Motorbike motorbike;
    private Bus bus;
    Road road = new Road(1, 100, 25);
    TrafficLight trafficLight = new TrafficLight(99);

    public void addStraightRoad() { //add a road object to simulation //TODO possibly need two methods to add different intersection types
        road.connectingRoads.add(new Road(1, 100, 25));
        for (Road road : road.connectingRoads) {
            road.setRoadLength(road.getRoadLength());
        }
    }

    public void addVehicle() { //adds a random vehicle index 0, 1, 2 to the road
        Random random = new Random();
        int randomVehicle = random.nextInt(3);
        switch (randomVehicle) {
            case 0:
                road.currentVehicles.add(new Car(1, 0, 1, 2));
                setCar(car);
                break;
            case 1:
                road.currentVehicles.add(new Motorbike(1, 0, 2, 2));
                setMotorbike(motorbike);
                break;
            case 2:
                road.currentVehicles.add(new Bus(1, 0, 3, 2));
                setBus(bus);
                break;
        }
    }

    public void addTrafficLight() {
        road.trafficLights.add(trafficLight);
        for (TrafficLight trafficLight : road.trafficLights) {
            trafficLight.setLightPositionOnRoad(trafficLight.getLightPositionOnRoad());
        }
    }

    public void changeRoad() { //change road, adds connecting road to road ArrayList
        for (Road connectingRoad : road.connectingRoads) {
            for (Vehicle vehicle : road.currentVehicles) {
                if (vehicle.getPositionOnRoad() == road.getRoadLength()) {
                    connectingRoad.currentVehicles.add(vehicle);
                    connectingRoad.removeVehicle();
                    vehicle.setPositionOnRoad(0);
                }
            }
        }
    }

    public void startTraffic() { //adds initial objects for now, should be in main for user to control what gets added
        addStraightRoad();
        addTrafficLight();
        addVehicle();
    }

    public void updateView() {
        road.moveVehicle();
        road.slowVehicle();
        road.removeVehicle();
        changeRoad();
    }

    public void setRoad(Road road) {
        this.road = road;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setMotorbike(Motorbike motorbike) {
        this.motorbike = motorbike;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

}
