package Simulation;

import javax.swing.*;

public class Bus extends Vehicle {
    /**
     * Instantiates a new Vehicle
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */
    public Bus(int speed, int positionOnRoad, int id, float vehicleBreadth) {
        super(speed, positionOnRoad, id, vehicleBreadth);
    }

    @Override
    public void setVehicleLength(float vehicleLength) {
        this.vehicleLength = 3 * 4;
    }
}