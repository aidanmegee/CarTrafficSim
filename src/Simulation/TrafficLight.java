package Simulation;

public class TrafficLight extends Road {

    String colourGreen = "Green";
    String colourRed = "Red";
    final double maxRateOfChange = 0.99; //if random number between max and min rateofchange is less than 0.3 or 30%
    final double minRateOfChange = 0.01; //traffic light changes from green to red or red to green


    public String getColourGreen() {
        return colourGreen;
    }

    public void setColourGreen(String colourGreen) {
        this.colourGreen = colourGreen;
    }

    public String getColourRed() {
        return colourRed;
    }

    public void setColourRed(String colourRed) {
        this.colourRed = colourRed;
    }

    public double getMaxRateOfChange() {
        return maxRateOfChange;
    }

    public double getMinRateOfChange() {
        return minRateOfChange;
    }
}
