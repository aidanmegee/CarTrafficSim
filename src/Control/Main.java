package Control;

import Model.*;
import View.Simulation;
import View.mainFrame;

public class Main {

    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();
        Simulation simulation = new Simulation();
        simulation.startTraffic();
        simulation.updateView();

    }

}
