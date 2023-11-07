package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class Option {

    @FXML
    private Label prix;

    @FXML
    private Circle redCircle, greenCircle, whiteCircle, blackCircle;

    public void initialize() {
        prix.setText("500 €");
    }

    @FXML
    public void redCircleClick() {
        prix.setText("600 €");
    }

    @FXML
    public void greenCircleClick() {
        prix.setText("525 €");
    }
    
    @FXML
    public void whiteCircleClick() {
        prix.setText("550 €");
    }

    @FXML
    public void blackCircleClick() {
        prix.setText("570 €");
    }
}