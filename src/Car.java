public class Car {

    int positionOnRoad = 0; //index 0 for car position start
    int roadLength = 10;
    String road1;
    String road2;

    /*setters and getters for car class*/

    public int getPositionOnRoad() {
        return positionOnRoad;
    }

    public int getRoadLength() {
        return roadLength;
    }

    public String getRoad1() {
        return road1;
    }

    public String getRoad2() {
        return road2;
    }

    public void setRoad1(String road1) {
        this.road1 = road1;
    }

    public void setRoad2() {
        this.road2 = road2;
    }

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }

    public void setPositionOnRoad(int positionOnRoad) {
        this.positionOnRoad = positionOnRoad;
    }


}
