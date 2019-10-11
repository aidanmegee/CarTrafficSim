package Simulation;

public class Car extends Vehicle {

    //car graphics draw in Car class
    /**
     * Instantiates a new Car
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */
    public Car(int speed, int positionOnRoad, int id, float vehicleBreadth) {
        super(speed, positionOnRoad, id, vehicleBreadth);
    }

    @Override
    public void setVehicleLength(float vehicleLength) {
        this.vehicleLength = 4;
    }

}
