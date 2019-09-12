
package Simulation;

import java.util.Random;

public class MainSimulation { //main simulation class


    public static void main(String[] args) {

        Car car = new Car(1);
        Road road = new Road(1);
        TrafficLight trafficLight = new TrafficLight();

        while (car.getPositionOnRoad() < 4 && road.getRoadId() <= 2) {
            car.carMove();
            trafficLight.operate();
            System.out.println("Car " + car.getId() + " is on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad() + " Traffic Lights are : " + trafficLight.getCurrentState());
            if (car.getPositionOnRoad() == 4 && road.getRoadId() == 1) {
                while (!trafficLight.getCurrentState().equals("Green") && car.getPositionOnRoad() == 4 && road.getRoadId() == 1) {
                    trafficLight.operate();
                    if (!trafficLight.getCurrentState().equals("Red")) {
                        road.roadChange();
                        car.setPositionOnRoad(0);
                        System.out.println("Car " + car.getId() + " is now travelling on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad());
                    }

                    boolean[] array = trafficLight.getArray();
                    boolean change = false;
                    while (!change && trafficLight.getCurrentState().equals("Red")) {//while value isn't false, calls operate method
                        if (array[1]) { //checks index of array is "red"
                            trafficLight.operate(); //calls operate method if lights are red
                            change = true;
                            trafficLight.operate(); //calls operate method again if lights are red
                            if (array[0]) { //checks index of array is "green"
                                change = false;
                                System.out.println("Traffic lights are : " + trafficLight.getCurrentState());
                                road.roadChange(); //changes road if traffic lights are green

                                //while loop to call operate() function so traffic lights keeps trying to change if lights are red

                            }
                        }
                        if (road.getRoadId() == 2) { //checks if roadID is 2
                            car.setPositionOnRoad(0);
                            System.out.println("Car " + car.getId() + " is now on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad());
                        }

                    }

                }
            }


        }
        while (car.getPositionOnRoad() < 4 && road.getRoadId() == 2) {
            car.carMove();
            System.out.println("Car " + car.getId() + " is on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad());

        }
    }


}




