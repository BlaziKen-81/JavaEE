package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import base.getM;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VueController implements Initializable {
    @FXML
    private TextArea textarea;
    @FXML
    private Button button;

    @FXML
    private void initButtonClicked() {
        try {
            textarea.setText(getM.getMethod());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    }
}