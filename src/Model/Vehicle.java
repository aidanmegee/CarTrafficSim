package Model;

public abstract class Vehicle { //Model.Car class

    //variables for Model.Vehicle class inherited by it's sub classes Model.Car, Model.Motorbike and Model.Bus
    public int speed;
    public int positionOnRoad; //index 0 for car position start
    public int id;
    public float vehicleLength;
    public int vehicleBreadth;

    /**
     * Instantiates a new Model.Vehicle
     *
     * @param speed          the speed
     * @param positionOnRoad the position on the road
     * @param id             the vehicle id
     * @param vehicleBreadth the vehicle breadth - Half of its length
     */
    public Vehicle(int speed, int positionOnRoad, int id, int vehicleBreadth) {
        this.speed = speed;
        this.positionOnRoad = positionOnRoad;
        this.id = id;
        this.vehicleBreadth = vehicleBreadth;
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

    public void setVehicleBreadth(int vehicleBreadth) {
        this.vehicleBreadth = vehicleBreadth;
    }

}
