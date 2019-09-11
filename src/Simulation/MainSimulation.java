
package Simulation;

import java.util.Random;

public class MainSimulation { //main simulation class


    public static void main(String[] args) {

        Car car = new Car(1);
        Road road = new Road(1);
        TrafficLight trafficLight = new TrafficLight();

        while (car.getPositionOnRoad() < 4) {
            car.carMove();
            System.out.println("Car " + car.getId() + " is on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad());
            if (car.getPositionOnRoad() == 4 && car.getId() == 1) {
                trafficLight.operate();
                boolean[] array = trafficLight.getArray();
                boolean change = false;
                while (!change) {
                    trafficLight.operate();
                    if (array[1]) {
                        change = true;
                        System.out.println("Traffic lights are : " + trafficLight.getCurrentState());
                        trafficLight.operate();
                        if (array[0]) {
                            change = false;
                            System.out.println("Traffic lights are : " + trafficLight.getCurrentState());
                            road.roadChange();
                            if (road.getRoadId() == 2) {
                                System.out.println("Car " + car.getId() + " is now on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad());
                            }

                        }
                    }

                }

            }


        }
    }


}
