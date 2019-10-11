package Simulation;

public class Car extends Vehicle {

    //car graphics draw in Car class

    /**
     * Instantiates a new Car
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleLength  the vehicle length
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */
    public Car(int speed, int positionOnRoad, int id, int vehicleLength, int vehicleBreadth) {
        super(speed, positionOnRoad, id, vehicleLength, vehicleBreadth);
        this.setVehicleLength(4);
    }

}
