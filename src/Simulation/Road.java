package Simulation;

public class Road { //Road class extends Car class

    private int roadLength = 5; //index 0 to 4
    private int roadId = 1;

    public Road(int roadId) { //constructor for Road class
        this.roadId = roadId;

    }
    public void roadChange() {
        while (roadId < 3) {
            roadId = roadId + 1;
            if(roadId == 2) {
                break;
            }
        }
    }

    /*setters and getters for Road class*/
    public int getRoadLength() {
        return roadLength;
    }

    public int getRoadId() {
        return roadId;
    }

    public void setRoadId(int roadId) {
        this.roadId = roadId;
    }


    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }


}
