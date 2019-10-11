package Simulation;

import java.util.ArrayList;

public abstract class Vehicle { //Car class

    //variables for Vehicle class inherited by it's sub classes Car, Motorbike and Bus
    private int speed;
    private int positionOnRoad; //index 0 for car position start
    private int id;
    public float vehicleLength;
    private float vehicleBreadth;
    ArrayList<Road> roads = new ArrayList<>();

    /**
     * Instantiates a new Vehicle
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */
    public Vehicle(int speed, int positionOnRoad, int id, float vehicleBreadth) {
        this.speed = speed;
        this.positionOnRoad = positionOnRoad;
        this.id = id;
        this.vehicleBreadth = vehicleBreadth;
    }

    public void changeRoad() {

    }

    /*setters and getters for car class*/
    public int getSpeed() {
        return speed;
    }

    public int getPositionOnRoad() {
        return positionOnRoad;
    }

    public int getId() {
        return id;
    }

    public float getVehicleLength() {
        return vehicleLength;
    }

    public float getVehicleBreadth() {
        return vehicleBreadth;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPositionOnRoad(int positionOnRoad) {
        this.positionOnRoad = positionOnRoad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void setVehicleLength(float vehicleLength);

    public void setVehicleBreadth(float vehicleBreadth) {
        this.vehicleBreadth = vehicleBreadth;
    }

}
