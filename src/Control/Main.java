package Control;

import View.Simulation;
import View.mainFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();
        Simulation simulation = new Simulation();
        simulation.startTraffic();

        simulation.setCreateNewCity(newCityEvent -> {
            simulation.removeAll();
            simulation.revalidate();
            simulation.repaint();
            //creates new city from scratch
        });
        simulation.setEditCity(editCityEvent -> {
            //should allow user to load a city and then edit
        });
        simulation.setOpenCity(openCityEvent -> {
            //load file .csv try catch possibly
        });
        simulation.setSaveCity(saveCityEvent -> {
            //save file .csv
        });

        simulation.setUpdateRate(updateRateEvent -> {
            JOptionPane.showInputDialog("Enter the Update Rate");
            //set updateRate of simulation
            //popup box input that sets the update rate
        });
        simulation.setRunSimulation(runSimulatorEvent -> {
            simulation.updateView();
            //essentially starts the simulation
        });
        simulation.setStopSimulation(stopSimulatorEvent -> {
            //stops simulator, **Add if a car crashed, create self made exception that closes program
        });
        simulation.setVehicleSpawnRate(vehicleSpawnRateEvent -> {
            JOptionPane.showInputDialog("Enter Vehicle Spawn Rate");
            //set spawn rate (use of timer method for spawn rates can change?
            //popup input box that sets the update rate/speed
        });

    }

}
