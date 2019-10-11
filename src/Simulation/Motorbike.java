package Simulation;

public class Motorbike extends Vehicle {

    /**
     * Instantiates a new Vehicle
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */
    public Motorbike(int speed, int positionOnRoad, int id, float vehicleBreadth) {
        super(speed, positionOnRoad, id, vehicleBreadth);
    }
    @Override
    public void setVehicleLength(float vehicleLength) {
        this.vehicleLength = (float) (0.5 * 4);
    }
}
