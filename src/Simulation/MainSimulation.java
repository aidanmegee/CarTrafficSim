
package Simulation;

import java.util.Random;

public class MainSimulation { //main simulation class


    public static void main(String[] args) {

        /*create new objects for simulation */
        Car car = new Car(1);
        Road road = new Road(1);
        TrafficLight trafficLight = new TrafficLight();

        //main loop for simulation
        while (car.getPositionOnRoad() < 4 && road.getRoadId() <= 2) {
            car.carMove(); //calls car move method from car class
            trafficLight.operate(); //calls operate method from traffic light class
            System.out.println("Car " + car.getId() + " is on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad() + " Traffic Lights are : " + trafficLight.getCurrentState());
            if (car.getPositionOnRoad() == 4 && road.getRoadId() == 1) {
                while (!trafficLight.getCurrentState().equals("Red") && car.getPositionOnRoad() == 4 && road.getRoadId() == 1) {
                    road.roadChange();
                    car.setPositionOnRoad(0);
                    System.out.println("Car " + car.getId() + " is now travelling on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad());

                    if (trafficLight.getCurrentState().equals("Red") && car.getPositionOnRoad() == 4) {
                        System.out.println("Car " + car.getId() + " is currently stopped at a " + trafficLight.getCurrentState() + " light");
                        trafficLight.operate(); //operates lights if current state is red and position is 4
                        if (trafficLight.getCurrentState().equals("Red") && car.getPositionOnRoad() == 4 && road.getRoadId() == 1) {
                            trafficLight.operate();
                        } else if (trafficLight.getCurrentState().equals("Green") && car.getPositionOnRoad() == 4) {
                            road.roadChange();
                            car.setPositionOnRoad(0);
                            System.out.println("Car " + car.getId() + " is now travelling on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad());
                        }
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

                    }

                }
            }
            while (car.getPositionOnRoad() < 4 && road.getRoadId() == 2) { //Car moves while on road 2 without traffic light on road 2
                car.carMove();
                System.out.println("Car " + car.getId() + " is on road : " + road.getRoadId() + " on segment " + car.getPositionOnRoad());

            }

        }

    }


}




