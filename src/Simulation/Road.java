package Simulation;

public class Road extends Car {

    int roadLength = String.valueOf(10).length();

    public int getRoadLength() {
        return roadLength;
    }

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
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
