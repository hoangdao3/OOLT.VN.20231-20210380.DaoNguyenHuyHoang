import javafx.scene.text.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private Text tfDisplay;

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
            String Button = null;
            tfDisplay.setText(tfDisplay.getText() + Button);
        }
        else if (button.equals("DEL")) {
                // handles the "DEL" case
            String currentText = tfDisplay.getText();
            if (!currentText.isEmpty()) {
                tfDisplay.setText(currentText.substring(0,currentText.length()-1));
            }
        }

        else {
            // handles the "C" case
            tfDisplay.setText("");
        }
    }
}