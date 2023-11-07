package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class VueController {

	    @FXML
	    public ImageView imgClickMe1, imgClickMe2;

	    public void ClickMeCourse() throws Exception{
	    	
	    	Parent vue2 = FXMLLoader.load(getClass().getResource("multi-pane2.fxml"));
	    	Stage window = (Stage) imgClickMe1.getScene().getWindow();
	    	window.setScene(new Scene(vue2));
	    	
	    }
	    
	    public void ClickMeVille() throws Exception{
	    	
	    	Parent vue2 = FXMLLoader.load(getClass().getResource("multi-pane2.fxml"));
	    	Stage window2 = (Stage) imgClickMe2.getScene().getWindow();
	    	window2.setScene(new Scene(vue2));
	    }
}
