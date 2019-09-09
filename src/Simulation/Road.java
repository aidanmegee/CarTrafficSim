package Simulation;

public class Road extends Car {

    private int roadLength;

    /*get and set road length*/
    public int getRoadLength() {
        return roadLength;
    }

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }

    public int roadLength() {
        int roadLength;
        roadLength = String.valueOf(5).length(); //road length is 0, 1, 2, 3, 4, 5
        return roadLength;
    }
    @Override
    public int getPositionOnRoad() {
        return super.getPositionOnRoad();
    }

    @Override
    public String getRoad2() {
        return super.getRoad2();
    }

    @Override
    public String getRoad1() {
        return super.getRoad1();
    }
}
