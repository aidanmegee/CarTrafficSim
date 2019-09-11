package Simulation;

public class Road { //Road class extends Car class

    private int roadLength; //index 0 to 4
    private Car car;

    public Road(int roadLength, Car car) { //constructor for Road class
        this.roadLength = roadLength;
        this.car = car;
    }



    public int roadLength() { //road length method for length of road
        roadLength = String.valueOf(roadLength).length(); //road length is 0, 1, 2, 3, 4
        return roadLength; //returns road length
    }

    /*get and set road length for Road class*/
    public int getRoadLength() {
        return roadLength();
    }


    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }


}
