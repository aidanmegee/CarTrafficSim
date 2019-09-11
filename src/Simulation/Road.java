package Simulation;

public class Road { //Road class extends Car class

    private int roadLength = 5; //index 0 to 4

    public Road(int roadLength) { //constructor for Road class
        this.roadLength = roadLength;
        Road road1 = new Road(roadLength);
        Road road2 = new Road(roadLength);
    }



    public int roadLength() { //road length method for length of road
        int roadLength = 5;
        this.roadLength = roadLength;
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
