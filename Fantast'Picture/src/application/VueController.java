package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import Entite.Images;
import Service.Personne;

public class VueController {

    @FXML
    private TextField name;
    @FXML
    private PasswordField password;
    @FXML
    private Button button1, button2;
    @FXML
    private ListView<String> imageList;
    @FXML
    private ImageView imageView;
    
    Personne personne = new Personne("Lucas", "12345");
    
    Images image1 = new Images("Paris", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/La_Tour_Eiffel_vue_de_la_Tour_Saint-Jacques%2C_Paris_ao%C3%BBt_2014_%282%29.jpg/1200px-La_Tour_Eiffel_vue_de_la_Tour_Saint-Jacques%2C_Paris_ao%C3%BBt_2014_%282%29.jpg");
    Images image2 = new Images("Toulouse", "https://www.guide-toulouse-pyrenees.com/_bibli/articlesPage/162/images/toulouse-adobestock-saiko3p.jpg");
    Images image3 = new Images("Marseille", "https://www.marseille-tourisme.com/app/uploads/marseille-tourisme/2020/07/thumbs/notre-dame-de-la-garde-fotolia-1920x960.jpg");
    
    @FXML
    public void initialize() {
    	
    	imageList.getItems().addAll(image1.getNom(), image2.getNom(), image3.getNom());
    	
    	button2.setDisable(true);
        imageList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                Image selectedImage = getImageByName(newValue);
                imageView.setImage(selectedImage);
            }
        });
    }
    
    private Image getImageByName(String name) {
        if (name.equals(image1.getNom())) {
            return new Image(image1.getUrl());
        } else if (name.equals(image2.getNom())) {
        	return new Image(image2.getUrl());
        } else if (name.equals(image3.getNom())) {
        	return new Image(image3.getUrl());
        }
        return null;
    }
    
    @FXML
    private void Login(MouseEvent event) {
        String Nom = name.getText();
        String MotDePasse = password.getText();
        
        try {
            if (personne.getNom().equals(Nom) && personne.getPassword().equals(MotDePasse)) {
            	button2.setDisable(false);
            } else {
                throw new Exception("Login ou mot de passe incorrect");
            }
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
          
            name.clear();
            password.clear();
        }
    }
   
}
