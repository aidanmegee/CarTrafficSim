
package Simulation;

import java.util.Random;

public class MainSimulation { //main simulation class


    public static void main(String[] args) {

        Car car = new Car(1);
        Road road = new Road(1);
        TrafficLight trafficLight = new TrafficLight();

        while (car.getPositionOnRoad() < 4) {
            car.carMove();
            System.out.println("Car " + car.getId() + " is on road : " + +road.getRoadId() + " on segment " + car.getPositionOnRoad());
            while (car.getPositionOnRoad() == 4) {
                boolean[] array = trafficLight.getArray();
                boolean change = false;
                while (!change) {
                    trafficLight.operate();
                    if (array[1]) {
                        change = true;
                        System.out.println("Traffic lights are " + trafficLight.getCurrentState());
                        System.out.println("Car " + car.getId() + " is staying on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad());
                    }
                        while (change = true)
                        trafficLight.operate();
                        if (array[0]) {
                            change = true;
                            road.roadChange();
                            System.out.println("Car" + car.getId() + " is moving to road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad());
                        }


                }

            }

        }
    }
}
