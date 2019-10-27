package Control;

import Model.*;
import View.Simulation;
import View.mainFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();
        Simulation simulation = new Simulation();
        Road road = new Road(1,100, 20);


    }
}
