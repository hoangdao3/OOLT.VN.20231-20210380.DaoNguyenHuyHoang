package GUIProject.out.production.GUIProject.hust.soict.hedspi.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.event.ActionEvent;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup identical;

    @FXML
    void clearButtonPressed(ActionEvent event){
        // Clear the drawing area by removing all shapes
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event){
        if (identical.getSelectedToggle() instanceof RadioButton) {
            RadioButton selectedRadioButton = (RadioButton) identical.getSelectedToggle();
            if (selectedRadioButton.getText().equals("Pen")) {
                drawPen(event.getX(), event.getY());
            } else if (selectedRadioButton.getText().equals("Eraser")) {
                erase(event.getX(), event.getY());
            }
        }
    }

    private void drawPen(double x, double y) {
        // Draw a circle at the specified coordinates for the pen tool
        Circle circle = new Circle(x, y, 3); // Change the size as needed
        circle.setFill(Color.BLACK); // Change the color as needed
        drawingAreaPane.getChildren().add(circle);
    }

    private void erase(double x, double y) {
        // Erase functionality - Remove shapes intersecting the specified coordinates
        drawingAreaPane.getChildren().removeIf(node ->
                node instanceof Circle && node.getBoundsInParent().contains(x, y));
    }

    public void clearButtonPressed(javafx.event.ActionEvent actionEvent) {
        drawingAreaPane.getChildren().clear();
    }
}