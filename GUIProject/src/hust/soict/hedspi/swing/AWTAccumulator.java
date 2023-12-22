package hust.soict.hedspi.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.glass.ui.Cursor.setVisible;
import static java.awt.AWTEventMulticaster.add;

public class AWTAccumulator {
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;

    public AWTAccumulator() {
        setLayout(new GridLayout(2,2));

        add(new Label("Enter an Integer: "));
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        add(new Label("The Accumulated Sum is: "));
        tfOutput=new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);

        setTitle("AWT Accumulator");
        setSize(350,120);
        setVisible(true);
    }

    private void add(TextField tfInput) {

    }

    private void setSize(int i, int i1) {
    }

    private void setTitle(String awtAccumulator) {
    }

    private void add(Label label) {
    }

    private void setLayout(GridLayout gridLayout) {
    }

    public static void main(String[] args) {
        new AWTAccumulator();
    }
    private class TFInputListener implements ActiveListener, ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }
}
