package View;

import javax.swing.*;
import java.awt.*;

public class cityEditing extends JPanel {

    public cityEditing() {

        JPanel sidePanel = new JPanel();
        JButton addVehicleButton = new JButton("Add a Vehicle");
        JButton addRoadButton = new JButton("Add a Road"); //simulation can only add straight roads at the moment.
        JButton addTrafficLightButton = new JButton("Add a Traffic Light");

        sidePanel.setLayout(new BorderLayout());
        sidePanel.add(addVehicleButton, BorderLayout.NORTH);
        sidePanel.add(addRoadButton, BorderLayout.CENTER);
        sidePanel.add(addTrafficLightButton, BorderLayout.SOUTH);

        this.add(sidePanel, BorderLayout.WEST);



    }
}
