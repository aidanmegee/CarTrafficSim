package Simulation;

public class Motorbike extends Vehicle {
    /**
     * Instantiates a new Vehicle
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleLength  the vehicle length
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */
    public Motorbike(int speed, int positionOnRoad, int id, int vehicleLength, int vehicleBreadth) {
        super(speed, positionOnRoad, id, vehicleLength, vehicleBreadth);
        this.setVehicleLength(2 * 4);
    }
}
