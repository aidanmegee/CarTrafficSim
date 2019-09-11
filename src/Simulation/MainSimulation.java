
package Simulation;

import java.util.Random;

public class MainSimulation { //main simulation class


    public static void main(String[] args) {

        Car car = new Car(1);
        Road road = new Road(1);
        TrafficLight trafficLight = new TrafficLight();

        while (car.getPositionOnRoad() < 4) {
            car.carMove();
            System.out.println("Car " + car.getId() + " is on road : " + + road.getRoadId()  + " on segment " + car.getPositionOnRoad());
        }
        if (car.getPositionOnRoad() == 4) {
            trafficLight.operate();

        }





    }
}
