package Control;

import Model.Road;
import View.Simulation;
import View.cityEditing;
import View.mainFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();
        cityEditing cityEditing = new cityEditing();
        Simulation simulation = new Simulation();
        simulation.startTraffic();

        simulation.setCreateNewCity(newCityEvent -> {
            simulation.removeAll();
            mainFrame.removeAll();
            mainFrame.add(cityEditing);
            cityEditing.setVisible(true);
            mainFrame.revalidate();
            mainFrame.repaint();

            cityEditing.setAddRoad(addRoadEvent -> {
                Road road = new Road(1, 100, 20);
                simulation.addStraightRoad();
                simulation.addTrafficLight();
                System.out.println();
            });

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
            System.exit(0);
            //stops simulator, **Add if a car crashed, create self made exception that closes program
        });
        simulation.setVehicleSpawnRate(vehicleSpawnRateEvent -> {
            JOptionPane.showInputDialog("Enter Vehicle Spawn Rate");
            //set spawn rate (use of timer method for spawn rates can change?
            //popup input box that sets the update rate/speed
        });

    }

}
