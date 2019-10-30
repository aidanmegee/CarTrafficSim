package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class cityEditing extends JPanel {

    private JButton addRoad;

    public cityEditing() {

        this.setLayout(new BorderLayout());
        JPanel cityEditingPanel = new JPanel(new GridLayout(10, 10));
        JPanel sidePanel = new JPanel();
        addRoad = new JButton("Add a Road"); //simulation can only add straight roads at the moment.

        sidePanel.setLayout(new BorderLayout());
        sidePanel.add(addRoad, BorderLayout.NORTH);

        this.add(cityEditingPanel, BorderLayout.EAST);
        this.add(sidePanel, BorderLayout.WEST);

    }

    public void setAddRoad(ActionListener listener) {
        addRoad.addActionListener(listener);
    }

}
