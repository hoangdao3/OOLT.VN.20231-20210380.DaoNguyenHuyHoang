package hust.soict.hedspi.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public class AddItemToStoreScreen extends JFrame {
    protected JTextField tfTitle;
    protected JTextField tfCategory;
    protected JTextField tfCost;
    public AddItemToStoreScreen (String mediaType) {
        Container cp = getContentPane();
        //cp.add(createNorth(), BorderLayout.NORTH);

        cp.add(new Label("Please enter the title of the " + mediaType + ": "));
        tfTitle = new JTextField(100);
        cp.add(tfTitle);
        cp.add(new Label("Please enter the category of the " + mediaType + ": "));
        tfCategory = new JTextField(100);
        cp.add(tfCategory);
        cp.add(new Label("Please enter the cost of the " + mediaType + ": "));
        tfCost = new JTextField(100);
        cp.add(tfCost);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Add " + mediaType);
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
