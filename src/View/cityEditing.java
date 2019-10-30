package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;

public class cityEditing extends mainFrame {

    JButton addVehicle, addRoad, addTrafficLight;

    public cityEditing() {

        this.setLayout(new BorderLayout());
        JPanel cityEditingPanel = new JPanel(new GridLayout(10, 10));
        JPanel sidePanel = new JPanel();
        addVehicle = new JButton("Add a Vehicle");
        addRoad = new JButton("Add a Road"); //simulation can only add straight roads at the moment.
        addTrafficLight = new JButton("Add a Traffic Light");

        sidePanel.setLayout(new BorderLayout());
        sidePanel.add(addVehicle, BorderLayout.NORTH);
        sidePanel.add(addRoad, BorderLayout.CENTER);
        sidePanel.add(addTrafficLight, BorderLayout.SOUTH);

        this.add(cityEditingPanel, BorderLayout.EAST);
        this.add(sidePanel, BorderLayout.WEST);
    }

    public void setAddVehicle(ActionListener listener) {
        addVehicle.addActionListener(listener);
    }

    public void setAddRoad(ActionListener listener) {
        addRoad.addActionListener(listener);
    }

    public void setAddTrafficLight(ActionListener listener) {
        addTrafficLight.addActionListener(listener);
    }
}
